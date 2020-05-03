package com.company;

import javax.naming.Name;

public class User implements Cloneable {
    public String name;
    public String family;
    public int age;
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        Name=name;
    }
    public String getFamily(){
        return family;
    }
    public void setFamily(String Family){
        Family=family;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        Age=age;
    }
}
