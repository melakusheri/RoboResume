package com.sebli;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    ArrayList<Education> educations;
    ArrayList<Experience> experiences;
    ArrayList<Skill> skills;

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        educations=new ArrayList<>();
        experiences=new ArrayList<>();
        skills=new ArrayList<>();
    }

    public Person() {
        educations=new ArrayList<>();
        experiences=new ArrayList<>();
        skills=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
