package com.rating.service;

import com.rating.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating addRating(Rating rating);
    List<Rating> getRatings();
    List<Rating> getRatingsByUserId(String userId);

    List<Rating> getRatingsByHotelId(String hotelId);
}
