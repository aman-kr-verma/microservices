package com.rating.controller;


import com.rating.entity.Rating;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping()
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.addRating(rating));
    }

    @GetMapping()
    public ResponseEntity<List<Rating>> getRatings(){
        return ResponseEntity.ok(ratingService.getRatings());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String id){
        return ResponseEntity.ok(ratingService.getRatingsByUserId(id));
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String id){
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(id));
    }

}
