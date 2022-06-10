package fr.epita.datastructures.tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        //create student email
        Map<String,Student> studentsByEmail = new LinkedHashMap<>();
        studentsByEmail.put("thomas@thomas.com",new Student("thomas"));
        studentsByEmail.put("quentin@quentin.com", new Student("quentin"));
        studentsByEmail.put("romain@romain.com",new Student("romain"));
        System.out.println(studentsByEmail);


    }
}
