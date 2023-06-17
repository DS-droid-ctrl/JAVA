package org.example.HoweWork.HomeW03.Ex02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String name;
    private String country;
    private Double price;
    private Double mass;
    private Integer sort;
}