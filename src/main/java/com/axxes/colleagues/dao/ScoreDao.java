package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ScoreDao extends CrudRepository<Score, Long> {
}
