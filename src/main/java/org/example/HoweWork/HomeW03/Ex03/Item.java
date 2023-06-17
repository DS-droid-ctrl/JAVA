package org.example.HoweWork.HomeW03.Ex03;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;
}
