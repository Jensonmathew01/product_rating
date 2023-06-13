package com.ust.Rating.Repository;

import com.ust.Rating.Model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Raterepository extends JpaRepository<Rate,Integer> {

    @Query("SELECT AVG(rate.value) FROM Rate rate")
    double getAverageValue();
}
