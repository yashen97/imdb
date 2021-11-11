package com.training.imdb.repository;

import com.training.imdb.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardRepository extends JpaRepository<Award,Long> {
}
