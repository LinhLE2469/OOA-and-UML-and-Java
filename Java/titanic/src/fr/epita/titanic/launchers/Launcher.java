package fr.epita.titanic.launchers;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.service.PassengersDataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Launcher {
     //NOTE Passenger(class) passengers(list) passenger(passenger bat ki)

    public static void main(String[] args) throws FileNotFoundException {
        // read file data csv file titanic ben trong package titanic
        File file = new File( "./titanic/titanic.csv");
        //READING Passenger from File
        List<Passenger> passengers = PassengersDataService.readPassengersFromFile(file);
        //COUNT SURVIVED PASSENGER
        int survivedCount = PassengersDataService.getSurvivedCount(passengers);

        System.out.println("survived: "+ survivedCount + " out of " + passengers.size());


        //CANCULATE AGE
        double average = PassengersDataService.getAverageAge(passengers);

        System.out.println("average: "+ average);

        //COUNT SURVIVED AND NOT SURVIVED
        Map<String, Integer> passengerCountBySurvived = PassengersDataService.getPassengerCountBySurvival(passengers);

        //PUT IN MAXTRIX
        double[][] matrix= new double[passengers.size()][5];

        for (int i=0; i < passengers.size();i++){

            Passenger passenger=passengers.get(i);
            double[] passengerVector=new double[5];
            //due to PassengerId Pclass are string so need to parse to Double
            passengerVector[0] = Double.parseDouble(passenger.getPassengerId());
            passengerVector[1] = passenger.getSurvived() ? 1 : 0;
            passengerVector[2] = Double.parseDouble(passenger.getPclass());
            passengerVector[3] = passenger.getGender().equals("male") ?  0: 1;
            passengerVector[4] = passenger.getAge();
            matrix[i] = passengerVector;

        }

        System.out.println(Arrays.deepToString(matrix));


    }



}
