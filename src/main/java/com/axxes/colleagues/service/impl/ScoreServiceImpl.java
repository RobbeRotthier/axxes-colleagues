package com.axxes.colleagues.service.impl;

import com.axxes.colleagues.dao.ScoreDao;
import com.axxes.colleagues.domain.Score;
import com.axxes.colleagues.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    private final ScoreDao scoreDao;

    @Autowired
    public ScoreServiceImpl(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }

    @Override
    public Iterable<Score> findAll() {
        return scoreDao.findAll();
    }
}
