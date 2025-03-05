package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    double height;
    double weight;
    String occupation;

    public Person (String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.occupation = "Belirtilmedi";
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Person (String occupation, double height, double weight) {
        this("Bilinmiyor", "Bilinmiyor", 0);
        this.occupation = occupation;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName () {
        return firstname;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public boolean isTeen () {
        return (age >= 13 && age <=19);
    }

}
