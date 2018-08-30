package com.axxes.colleagues.service.impl;

import com.axxes.colleagues.dao.PictureDao;
import com.axxes.colleagues.domain.Picture;
import com.axxes.colleagues.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureDao pictureDao;

    @Autowired
    public PictureServiceImpl(PictureDao pictureDao) {
        this.pictureDao = pictureDao;
    }

    @Override
    public Optional<Picture> getRandom() {
        return pictureDao.findById((long) (Math.random() * 10 + 1));
    }
}
