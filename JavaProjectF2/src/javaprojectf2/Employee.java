/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojectf2;

/**
 *
 * @author iektm1-11
 */
public class Employee extends Person {
    private double misthos;
    private String epal;

//Δημιουργούς..    
    Employee() {
        super();
        misthos = 0.0;
        epal = "";
    }
    
    Employee(double misthos, String epal) {
        super();
        this.misthos = misthos;
        this.epal = epal;
    }
    
    Employee(String name, double age, double misthos, String epal) {
        super(name, age);
        this.misthos = misthos;
        this.epal = epal;
    }
    
    Employee(String name, double age, int gender, double misthos, String epal) {
        super(name, age, gender);
        this.misthos = misthos;
        this.epal = epal;
    }
    
//Μεθόδοι..
    public void setEpal(String epal) {
        this.epal = epal;
    }
    public String getEpal() {
        return epal;
    }
    
    public void setMisthos(double misthos) {
        if (misthos >= 0)
            this.misthos = misthos;
    }
    public double getMisthos() {
        return misthos;
    }
    
    //Method Overriding
    public String description() {
        String s = "Employee: " + getName() + ", είναι " + getAge();
        s = s + " και εργαζέται ως " + epal + " με μισθό " + misthos;
        return s;
    }
    
}
