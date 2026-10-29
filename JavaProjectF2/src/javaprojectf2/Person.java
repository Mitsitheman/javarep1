/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojectf2;

/**
 *
 * @author iektm1-11
 */
public class Person {

    public final static int MALE = 1;
    public final static int FEMALE = 2;
    public final static int NOGENDER = 3;
    protected String name;
    protected double age;
    protected int gender;

//Δημιουργούς..
    Person() {
        name = "";
        age = 0.0;
        gender = NOGENDER;
    }

    Person(String name, double age, int gender) {
        this.name = name;
        this.age = 0.0;
        setGender(gender);
    }

    Person(String name, double age) {
        this.name = name;
        this.age = age;
        gender = NOGENDER;
    }

//Μεθόδοι..
    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setAge(double a) {
        age = a;
    }

    public double getAge() {
        return age;
    }

    public void setGender(int a) {
        if (a == MALE || a == FEMALE)
            gender = a;
        else
            gender = NOGENDER;
    }

    public int getGender() {
        return gender;
    }

    public String description() {
        String g;
        if (gender == MALE) {
            g = "Person: Ο " + name + " είναι " + age + " χρονών. Gender=" + gender;
        } else if (gender == FEMALE) {
            g = "Person: Η " + name + " είναι " + age + " χρονών. Gender=" + gender;
        } else {
            g = "Person: " + name + " είναι " + age + " χρονών. Gender=" + gender;
        }

        return g;
    }
}
