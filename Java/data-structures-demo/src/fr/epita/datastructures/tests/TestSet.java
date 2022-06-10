package fr.epita.datastructures.tests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {
     //define a Set student method 1 (method check duplicate 2)
    public static void main(String[] args) {

        duplicateDemo(); // hàm bên dưới muốn print phải bỏ vào main không liên quan đến method 2

        //method 2 check duplicate value
        Set<Student> students=new LinkedHashSet<>();
        students.add(new Student("linh"));
        students.add(new Student("linh"));
       //duplicate student name when print__ need to avoid it by Overide (student class)
        System.out.println(students);
    }

    //method test duplicate 1 in Set
    private static void duplicateDemo() {

        //define a Set; LinkedHashSet la de element unique va sort theo dung thu tu can in
        Set<String> set = new LinkedHashSet<>();
        set.add("this");
        set.add("is");
        set.add("a");
        set.add("set");
        set.add("is");// try to put duplicate element but when print it's not included
        System.out.println(set);

    }





}
