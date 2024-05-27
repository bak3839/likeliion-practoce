package com.likelion.practice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Skin {
    @Id
    @Column(name = "skin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String grade;

    private int price;

    @ManyToOne(fetch = LAZY)
    private Champion champion;

    public void setChampion(Champion champion) {
        this.champion = champion;

        if(!champion.getSkins().contains(this)) {
            champion.addSkin(this);
        }
    }

    public Skin(String name, String grade, int price) {
        this.name = name;
        this.grade = grade;
        this.price = price;
    }
}
