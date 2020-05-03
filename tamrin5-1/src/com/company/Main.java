package com.company;

import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student stu = new Student();
        String str = new String();
        String studentname;
        long student_number;
        double avrage;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter student number");
        stu.setStudent_Number(input.nextInt());
        System.out.println("please enter students name");
        stu.setName(input.next());
        System.out.println("please enter students avrage");
        stu.setAvrage(input.nextDouble());
        Map map = new HashMap();
        map.put("name", stu.getName());
        map.put("number", stu.getStudent_Number());
        map.put("avrage", stu.getAvrage());
        System.out.println("name:"+map.get("name"));
        System.out.println("number:"+map.get("number"));
        System.out.println("avrage:"+map.get("avrage"));
    }
}
