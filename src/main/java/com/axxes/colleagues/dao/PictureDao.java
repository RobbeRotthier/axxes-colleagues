package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.Picture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureDao extends CrudRepository<Picture, Long> {
}
