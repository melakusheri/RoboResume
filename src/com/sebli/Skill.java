package com.sebli;

public class Skill {
    private String skills;
    private String rating;

    public Skill(String skills, String rating) {
        this.skills = skills;
        this.rating = rating;
    }

    public Skill() {
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
