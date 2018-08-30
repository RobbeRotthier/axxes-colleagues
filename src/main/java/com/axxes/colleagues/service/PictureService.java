package com.axxes.colleagues.service;

import com.axxes.colleagues.domain.Picture;

import java.util.Optional;

public interface PictureService {

    Optional<Picture> getRandom();
}
