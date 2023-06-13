package com.ust.Rating.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ratedto {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int value;
}
