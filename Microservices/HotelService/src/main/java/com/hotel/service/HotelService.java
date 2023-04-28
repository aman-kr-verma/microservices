package com.hotel.service;

import com.hotel.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {
    Hotel addHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotelById(String id);






}
