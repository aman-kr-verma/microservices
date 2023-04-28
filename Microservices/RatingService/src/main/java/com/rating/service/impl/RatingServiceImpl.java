package com.rating.service.impl;

import com.rating.entity.Rating;
import com.rating.exception.ResurceNotFoundException;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating addRating(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByUserId(hotelId);
    }


}
