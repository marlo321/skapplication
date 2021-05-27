package com.holyak.skhidnytsa.dummy;

import java.util.ArrayList;
import java.util.List;

public class SkhidnytsaItem {
    private String content;
    private String details;
    private List<String> diseases;
    private String coordinates;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetails() {
        return details;
    }

    public String getCoordinates() { return coordinates; }

    public void setCoordinates(String coordinates) { this.coordinates = coordinates; }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<String> diseases) {
        this.diseases = diseases;
    }
}
