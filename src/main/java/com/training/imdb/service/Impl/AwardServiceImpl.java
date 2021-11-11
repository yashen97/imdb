package com.training.imdb.service.Impl;

import com.training.imdb.repository.AwardRepository;
import com.training.imdb.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AwardServiceImpl implements AwardService {
    @Autowired
    AwardRepository awardRepository;
}
