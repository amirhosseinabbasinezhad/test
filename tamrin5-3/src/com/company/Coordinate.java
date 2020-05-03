package com.company;

public class Coordinate <FIRST,SECOND,THIRD> {
    public FIRST NameOfStudent;
    public SECOND NumberOfStudent;
    public THIRD NameOfFather;
    public double Nomre;
    public FIRST getNameOfStudent(){
        return NameOfStudent;
    }
    public void setNameOfStudent(FIRST nameOfStudent){
        nameOfStudent=NameOfStudent;
    }
    public SECOND getNumberOfStudent(){
        return NumberOfStudent;
    }
    public void setNumberOfStudent(SECOND numberOfStudent){
        numberOfStudent=NumberOfStudent;
    }
    public THIRD getNameOfFather(){
        return NameOfFather;
    }
    public void setNameOfFather(THIRD nameOfFather){
        nameOfFather=NameOfFather;
    }
    public double getNomre(){
        return Nomre;
    }
    public void setNomre(double nomre){
        nomre=Nomre;
    }
}
