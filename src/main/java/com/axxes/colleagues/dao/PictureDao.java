package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PictureDao extends JpaRepository<Picture, Long> {
}
