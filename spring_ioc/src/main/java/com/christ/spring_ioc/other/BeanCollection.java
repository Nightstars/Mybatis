package com.christ.spring_ioc.other;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class BeanCollection {
    private List<String> courses;
    private Map<String,String> cups;

    public Properties getPs() {
        return ps;
    }

    public void setPs(Properties ps) {
        this.ps = ps;
    }

    private Properties ps;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Map<String, String> getCups() {
        return cups;
    }

    public void setCups(Map<String, String> courses1) {
        this.cups = courses1;
    }
}
