package com.example.locationbasefire;

public class Model {
    private  String title;
    private String description;
    private String location;

    public Model(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;
    }

    public Model() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
