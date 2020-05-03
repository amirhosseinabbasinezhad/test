package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        Coordinate stu=new Coordinate();
        System.out.println("please enter name of Student");
        stu.NameOfStudent=input.next();
        System.out.println("please enter number of Student");
        stu.NumberOfStudent=input.nextLong();
        System.out.println("please enter father name");
        stu.NameOfFather=input.next();
        System.out.println(stu.getNameOfStudent());
        System.out.println(stu.getNumberOfStudent());
        System.out.println(stu.getNameOfFather());
        System.out.println("enter 1th nomre");
        List<Object> list =new ArrayList<>();
        list.add(input.nextDouble());
        System.out.println("enter 2th nomre");
        list.add(input.nextDouble());
        System.out.println("enter 3th nomre");
        list.add(input.nextDouble());
        System.out.println("enter 4th nomre");
        list.add(input.nextDouble());
        System.out.println("enter 5th nomre");
        list.add(input.nextDouble());
        for (Object o:list){
            System.out.println(o);
        }
    }

}
