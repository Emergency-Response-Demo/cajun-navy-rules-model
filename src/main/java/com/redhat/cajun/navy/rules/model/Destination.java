package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Destination implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
