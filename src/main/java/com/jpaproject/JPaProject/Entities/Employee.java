package com.jpaproject.JPaProject.Entities;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name = "product")
// we need this one only if the database table name is different from the class name ,however here is the same .
public class Employee {

    @Id
    private int id;
    private int age;
    private String location;



//    @Column(name = " description")
//    private Double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", Location='" + location + '\'' +
                '}';
    }
}
