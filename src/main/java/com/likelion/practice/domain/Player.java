package com.likelion.practice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;

@Getter
@Entity
@NoArgsConstructor
public class Player {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @ManyToMany
    @JoinTable(name = "player_champion",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "champion_id"))
    private List<Champion> champions = new ArrayList<>();

    public void addChampion(Champion champion) {
        this.champions.add(champion);

        if(!champion.getPlayers().contains(this)) {
            champion.addPlayer(this);
        }
    }

    public Player(String name) {
        this.name = name;
    }
}
