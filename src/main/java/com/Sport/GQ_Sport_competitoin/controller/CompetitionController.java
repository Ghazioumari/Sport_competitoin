package com.Sport.GQ_Sport_competitoin.controller;

import com.Sport.GQ_Sport_competitoin.entity.Competition;
import com.Sport.GQ_Sport_competitoin.repository.CompetitionRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompetitionController {
    private final CompetitionRepository competitionRepository;

    public CompetitionController(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    @QueryMapping
    public List<Competition> competitions() {
        return competitionRepository.findAll();
    }

    @QueryMapping
    public Competition competition(@Argument Long id) {
        return competitionRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Competition createCompetition(@Argument String name, @Argument String country,
                                       @Argument Integer year, @Argument String winner,
                                       @Argument String runnerup) {
        return competitionRepository.save(Competition.builder()
                .name(name)
                .country(country)
                .year(year)
                .winner(winner)
                .runnerup(runnerup)
                .build());
    }
}
