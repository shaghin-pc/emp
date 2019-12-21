package com.shagi.employ2;

public class Empmodel {

    public String name;
    public String designation;
    public String salary;
    public String place;
    public String company;
    public String email;
    public String mob;

    public Empmodel() {
    }

    public Empmodel(String name, String designation, String salary, String place, String company, String email, String mob) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.place = place;
        this.company = company;
        this.email = email;
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
