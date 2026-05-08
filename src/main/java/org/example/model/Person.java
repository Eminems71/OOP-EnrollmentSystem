package org.example.model;

public abstract class Person {
    private String personID;
    private String personName;

    public Person(String personName, String personID){
        this.personID = personID;
        this.personName = personName;
    }

    public void setPersonID(String personID){
        this.personID = personID;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPersonName(String Name){
        this.personName = Name;
    }

    public String getPersonName(){
        return personName;
    }

    public abstract void mainTask();
}