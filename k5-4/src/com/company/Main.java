package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Information info=new Information();
        info.setName("AmirHossein");
        info.setFamily("AbbasiNezhad");
        info.setAge(20);
        info.setPass("Amir123");
        info.setUserName("amirHossein_abbasinezhad79");
        info.setJob("student");
        System.out.println(info.getName());
        System.out.println(info.getFamily());
        System.out.println(info.getAge());
        System.out.println(info.getPass());
        System.out.println(info.getUserName());
        System.out.println(info.getJob());
    }
}
