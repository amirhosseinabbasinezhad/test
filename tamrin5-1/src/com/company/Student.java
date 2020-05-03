package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    //chon int vase shomare daneshjoo kam bood double gereftam
    private long Student_Number;
    private String Student_Name;
    private double avrage;

    public long getStudent_Number(){
        return Student_Number;
    }
    public void setStudent_Number(long student_Number){ Student_Number=student_Number;
    }
    public String getName(){
        return Student_Name;
    }
    public void setName(String Name){
        Student_Name = Name;
    }
    public double getAvrage(){
        return avrage;
    }
    public void setAvrage(double Avrage){
        avrage=Avrage;
    }

}
