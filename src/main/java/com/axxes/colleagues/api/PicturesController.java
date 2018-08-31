package com.axxes.colleagues.api;

import com.axxes.colleagues.domain.Picture;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PicturesController {

    @GetMapping("/pictures")
    public ResponseEntity<List<Picture>> getPictures() {
        //return list of 80 pictures

        return ResponseEntity.ok(Collections.emptyList());
    }
}
