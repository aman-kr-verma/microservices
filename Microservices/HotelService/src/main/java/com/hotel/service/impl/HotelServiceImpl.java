package com.hotel.service.impl;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repository.HotelRepository;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel addHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found, check again"));
    }
}
