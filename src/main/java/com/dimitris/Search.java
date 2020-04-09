package com.dimitris;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Search {


    public   String findCarOwner(String carPlates){

        PlateIo plateio = new PlateIo();
        List<CarData> data = null;
        try {
            data = plateio.loadFromFile("plates.txt");
            for(CarData car: data){
                if (car.getPlate().equals(carPlates))
                    return car.getOwner();
            }
        } catch (FileNotFoundException e) {
        }
        return "not found";
    }
}
