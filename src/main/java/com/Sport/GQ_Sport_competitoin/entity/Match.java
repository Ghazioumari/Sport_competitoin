package com.Sport.GQ_Sport_competitoin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matches")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "competition")
    private String competition;
    @Column(name = "year")
    private Integer year;
    @Column(name = "round")
    private String round;
    @Column(name = "team1")
    private String team1;
    @Column(name = "team2")
    private String team2;
    @Column(name = "team1goals")
    private Integer team1Goals;
    @Column(name = "team2goals")
    private Integer team2Goals;
}
