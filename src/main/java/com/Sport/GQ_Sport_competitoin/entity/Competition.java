package com.Sport.GQ_Sport_competitoin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "competitions")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private Integer year;
    private String winner;
    private String runnerup;
}
