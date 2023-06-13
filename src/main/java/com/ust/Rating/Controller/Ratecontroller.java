package com.ust.Rating.Controller;

import com.ust.Rating.Model.Rate;
import com.ust.Rating.Repository.Raterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class Ratecontroller {

    @Autowired
    private Raterepository raterepo;


    @PostMapping("/add")
    public ResponseEntity<Rate> createRate(@RequestBody Rate rate) {
        raterepo.save(rate);
        return ResponseEntity.ok().body(rate);
    }

    @GetMapping("{id}")
    public ResponseEntity<Rate> getRate(@PathVariable int id) {
        Optional<Rate> rate = raterepo.findById(id);
        if (rate.isPresent()) {
            return ResponseEntity.ok().body(raterepo.findById(id).orElse(null));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/average")
    public double calculateAverageRating() {
        double averageValue = raterepo.getAverageValue();
        return averageValue;
    }

}

