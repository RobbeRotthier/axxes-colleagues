package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDao extends CrudRepository<Score, Long> {
}
