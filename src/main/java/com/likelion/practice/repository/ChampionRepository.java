package com.likelion.practice.repository;

import com.likelion.practice.domain.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
}
