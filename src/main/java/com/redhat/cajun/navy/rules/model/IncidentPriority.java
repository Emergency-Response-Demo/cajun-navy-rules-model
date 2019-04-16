package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class IncidentPriority implements Serializable {

    private static final long serialVersionUID = 1L;

    private String incidentId;

    private BigDecimal priority;

    private BigDecimal averagePriority;

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public BigDecimal getAveragePriority() {
        return averagePriority;
    }

    public void setAveragePriority(BigDecimal averagePriority) {
        this.averagePriority = averagePriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncidentPriority that = (IncidentPriority) o;

        if (!Objects.equals(incidentId, that.incidentId)) return false;
        if (!Objects.equals(priority, that.priority)) return false;
        return Objects.equals(averagePriority, that.averagePriority);

    }

    @Override
    public int hashCode() {
        int result = incidentId != null ? incidentId.hashCode() : 0;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (averagePriority != null ? averagePriority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IncidentPriority[" +
                "incidentId='" + incidentId + '\'' +
                ", priority=" + priority +
                ", averagePriority=" + averagePriority +
                ']';
    }
}
