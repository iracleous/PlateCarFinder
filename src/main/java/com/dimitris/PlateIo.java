package com.dimitris;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlateIo {

    public List<CarData> loadFromFile(String filename) throws FileNotFoundException {
        List<CarData> carData = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String words [] = line.split(" ");
            CarData data= new CarData(words[0], words[1]);
            carData.add(data);
        }
        return carData;
    }


    public void   saveToFile(List<CarData> plateData, String filename, boolean append)
            throws IOException {

        FileWriter fileWriter = new FileWriter(filename, append);
        PrintWriter pw = new PrintWriter(fileWriter);

        for (CarData carData:plateData)
            pw.print(carData.getPlate()+ " "+ carData.getOwner()+"\n");
        pw.close();
    }



    public void deletePlate(String plates)   {
        // to implement , dummy method
       try {
            // 1. load from file to a list
            List<CarData> list = loadFromFile("plates.txt");
            // 2. delete plates from list
            CarData found =null;
            for (CarData carData : list)
                {
                    if(carData.getPlate().equals(plates))
                        found =carData;
                }
            if (found == null) return;
            list.remove(found);
            //3. save the list to the file as new
            saveToFile(list,"plates.txt", false);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
