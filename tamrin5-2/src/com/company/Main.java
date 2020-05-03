package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=new String();
        User u1=new User();
        System.out.println("please enter your name");
        u1.name=input.next();
        System.out.println("please enter your family");
        u1.family=input.next();
        System.out.println("age?");
        u1.age=input.nextInt();
        User u2=null;
        User u3=null;
        User u4=null;
        try {
            u2 = (User) u1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        try {
            u3 = (User) u1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        try {
            u4 = (User) u1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        if(!u1.equals(u2)){
            System.out.println(u1);
            System.out.println(u2);
            System.out.println("name of user:");
            System.out.println(u1.getName());
            System.out.println(u2.getName());
            System.out.println("family of users:");
            System.out.println(u1.getFamily());
            System.out.println(u2.getFamily());
            System.out.println("age of users:");
            System.out.println(u1.getAge());
            System.out.println(u2.getAge());
            System.out.println("-----------------");
        }
        if(!u1.equals(u3)){
            System.out.println(u1);
            System.out.println(u3);
            System.out.println("name of user:");
            System.out.println(u1.getName());
            System.out.println(u3.getName());
            System.out.println("family of users:");
            System.out.println(u1.getFamily());
            System.out.println(u3.getFamily());
            System.out.println("age of users:");
            System.out.println(u1.getAge());
            System.out.println(u3.getAge());
            System.out.println("-----------------");
        }
        if(!u1.equals(u4)){
            System.out.println(u1);
            System.out.println(u4);
            System.out.println("name of user:");
            System.out.println(u1.getName());
            System.out.println(u4.getName());
            System.out.println("family of users:");
            System.out.println(u1.getFamily());
            System.out.println(u4.getFamily());
            System.out.println("age of users:");
            System.out.println(u1.getAge());
            System.out.println(u4.getAge());
        }
    }
}
