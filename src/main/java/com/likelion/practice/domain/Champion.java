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
public class Champion {
    @Id
    @Column(name = "champion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String type;

    @OneToMany(mappedBy = "champion", cascade = {PERSIST, REMOVE})
    private List<Skin> skins = new ArrayList<>();

    @ManyToMany(mappedBy = "champions")
    private List<Player> players = new ArrayList<>();

    public void addSkin(Skin skin) {
        this.skins.add(skin);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Champion(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
