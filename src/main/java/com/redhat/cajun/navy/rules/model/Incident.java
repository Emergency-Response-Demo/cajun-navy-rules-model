package com.redhat.cajun.navy.rules.model;
import java.io.Serializable;
import java.time.ZonedDateTime;

public class Incident implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private Integer reporterId;
	
	private String location;
	
	private Integer numPeople;
	
	private Boolean medicalNeeded;
	
	private ZonedDateTime reportedTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReportId() {
		return reporterId;
	}
	
	public void setReportId(Integer reportId) {
		this.reporterId = reportId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Integer getNumPeople() {
		return numPeople;
	}
	
	public void setNumPeople(Integer numPeople) {
		this.numPeople = numPeople;
	}
	
	public Boolean getMedicalNeeded() {
		return medicalNeeded;
	}
	
	public void setMedicalNeeded(Boolean medicalNeeded) {
		this.medicalNeeded = medicalNeeded;
	}
	
    public Integer getReporterId() {
        return reporterId;
    }

    public void setReporterId( Integer reporterId ) {
        this.reporterId = reporterId;
    }

    public ZonedDateTime getReportedTime() {
        return reportedTime;
    }

    public void setReportedTime( ZonedDateTime reportedTime ) {
        this.reportedTime = reportedTime;
    }

    @Override
	public String toString() {
		return "Incident [id=" + id + ", reportId=" + reporterId + ", location=" + location + ", numPeople=" + numPeople
				+ ", medicalNeeded=" + medicalNeeded + ", reportedTime=" + reportedTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((medicalNeeded == null) ? 0 : medicalNeeded.hashCode());
		result = prime * result + ((numPeople == null) ? 0 : numPeople.hashCode());
		result = prime * result + ((reporterId == null) ? 0 : reporterId.hashCode());
		result = prime * result + ((reportedTime == null) ? 0 : reportedTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (medicalNeeded == null) {
			if (other.medicalNeeded != null)
				return false;
		} else if (!medicalNeeded.equals(other.medicalNeeded))
			return false;
		if (numPeople == null) {
			if (other.numPeople != null)
				return false;
		} else if (!numPeople.equals(other.numPeople))
			return false;
		if (reporterId == null) {
			if (other.reporterId != null)
				return false;
		} else if (!reporterId.equals(other.reporterId))
			return false;
		if (reportedTime == null) {
			if (other.reportedTime != null)
				return false;
		} else if (!reportedTime.equals(other.reportedTime))
			return false;
		return true;
	}
}