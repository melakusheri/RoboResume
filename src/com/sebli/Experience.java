package com.sebli;

import java.util.ArrayList;
import java.util.List;

public class Experience {
    private String Position;
    private String companyName;
    private String fromDate;
    private String toDate;
    List<String> duty;

    public Experience(String position, String companyName, String fromDate, String toDate) {
        Position = position;
        this.companyName = companyName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        duty=new ArrayList<>();
    }

    public Experience() {
        duty=new ArrayList<>();
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public List<String> getDuty() {
        return duty;
    }

    public void setDuty(List<String> duty) {
        this.duty = duty;
    }
}
