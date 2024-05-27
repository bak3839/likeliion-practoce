package com.likelion.practice.init;

import com.likelion.practice.domain.Champion;
import com.likelion.practice.domain.Player;
import com.likelion.practice.domain.Skin;
import com.likelion.practice.repository.ChampionRepository;
import com.likelion.practice.repository.PlayerRepository;
import com.likelion.practice.repository.SkinRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInit {
    private final PlayerRepository playerRepository;
    private final ChampionRepository championRepository;
    private final SkinRepository skinRepository;


    @PostConstruct
    public void init() {
        Player player1 = new Player("Faker");
        Player player2 = new Player("Chovy");
        Player player3 = new Player("ShowMaker");

        Champion champion1 = new Champion("아리", "마법사");
        Champion champion2 = new Champion("아지르", "마법사");
        Champion champion3 = new Champion("요네", "전사");
        Champion champion4 = new Champion("사일러스", "마법사");
        Champion champion5 = new Champion("아칼리", "암살자");

        Skin skin1 = new Skin("별 수호자 아리", "전설", 1820);
        Skin skin2 = new Skin("K/DA 아리", "서사", 1350);

        Skin skin3 = new Skin("대장군 아지르", "서사", 1350);

        Skin skin4 = new Skin("하이 눈 요네", "전설", 1820);
        Skin skin5 = new Skin("영혼의 꽃 요네", "서사", 1350);

        Skin skin6 = new Skin("프렐요드 사일러스", "서사", 1350);

        Skin skin7 = new Skin("별 수호자 아칼리", "전설", 1820);
        Skin skin8 = new Skin("DRX 아칼리", "서사", 1350);

        skin1.setChampion(champion1);
        skin2.setChampion(champion1);

        skin3.setChampion(champion2);

        skin4.setChampion(champion3);
        skin5.setChampion(champion3);

        skin6.setChampion(champion4);

        skin7.setChampion(champion5);
        skin8.setChampion(champion5);

        player1.addChampion(champion1);
        player1.addChampion(champion2);
        player1.addChampion(champion5);

        player2.addChampion(champion2);
        player2.addChampion(champion3);
        player2.addChampion(champion4);

        player3.addChampion(champion4);
        player3.addChampion(champion5);

        championRepository.save(champion1);
        championRepository.save(champion2);
        championRepository.save(champion3);
        championRepository.save(champion4);
        championRepository.save(champion5);

        playerRepository.save(player1);
        playerRepository.save(player2);
        playerRepository.save(player3);
    }
}
