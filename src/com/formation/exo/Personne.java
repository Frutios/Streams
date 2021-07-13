package com.formation.exo;

public class Personne {
    private String lastname;
    private String firstname;
    private String gender;
    private float salary;
    private int birthYear;
    private String city;

    public Personne(String firstname, String lastname, int birthYear, float salary, String gender, String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.salary = salary;
        this.gender = gender;
        this.city = city;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", birthYear=" + birthYear +
                ", city='" + city + '\'' +
                '}';
    }
}
