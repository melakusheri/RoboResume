package com.sebli;

public class Education {
    private String field;
    private String nameOfSchool;
    private String yearOfGrad;


    public Education(String field, String nameOfSchool, String yearOfGrad) {
        this.field = field;
        this.nameOfSchool = nameOfSchool;
        this.yearOfGrad = yearOfGrad;
    }

    public Education() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getYearOfGrad() {
        return yearOfGrad;
    }

    public void setYearOfGrad(String yearOfGrad) {
        this.yearOfGrad = yearOfGrad;
    }
}
