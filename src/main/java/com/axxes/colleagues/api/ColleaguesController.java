package com.axxes.colleagues.api;

import com.axxes.colleagues.domain.Picture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ColleaguesController {

    @GetMapping("pictures")
    public List<Picture> getPictures() {
        //return list of 80 pictures

        return Collections.emptyList();
    }


    public void getScores() {
        //get every score from this month, rank desc
    }
}
