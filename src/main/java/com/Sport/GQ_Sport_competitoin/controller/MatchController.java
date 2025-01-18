package com.Sport.GQ_Sport_competitoin.controller;

import com.Sport.GQ_Sport_competitoin.entity.Match;
import com.Sport.GQ_Sport_competitoin.repository.MatchRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MatchController {
    private final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @QueryMapping
    public List<Match> matches() {
        return matchRepository.findAll();
    }

    @QueryMapping
    public Match match(@Argument Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Match createMatch(@Argument String competition, @Argument Integer year,
                           @Argument String round, @Argument String team1,
                           @Argument String team2, @Argument Integer team1goals,
                           @Argument Integer team2goals) {
        return matchRepository.save(Match.builder()
                .competition(competition)
                .year(year)
                .round(round)
                .team1(team1)
                .team2(team2)
                .team1Goals(team1goals)
                .team2Goals(team2goals)
                .build());
    }
}
