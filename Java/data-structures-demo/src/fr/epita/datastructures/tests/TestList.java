package fr.epita.datastructures.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        //define array list method 1
        List<String> stringList = new ArrayList<>();
        //define array list method 2
        stringList= Arrays.asList("test","of","init");
        //print stringList
        System.out.println(stringList);

    }



}
