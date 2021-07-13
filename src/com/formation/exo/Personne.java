package com.formation.exo;

public class Personne {
    private String lastname;
    private String firstname;
    private String gender;
    private int birthYear;

    public Personne(String firstname, String lastname, int birthYear, String gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.gender = gender;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
