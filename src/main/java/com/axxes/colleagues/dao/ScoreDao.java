package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ScoreDao extends JpaRepository<Score, Long> {
}
