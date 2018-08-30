package com.axxes.colleagues.api;

import com.axxes.colleagues.domain.Score;
import com.axxes.colleagues.service.ScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    private ScoreService scoreService;

    @GetMapping("/scores")
    public Iterable<Score> getScores() {
        return scoreService.findAll();
    }
}
