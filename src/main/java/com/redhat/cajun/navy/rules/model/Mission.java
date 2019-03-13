package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class Mission implements Serializable {

	private static final long serialVersionUID = 1L;

	private String incidentId;
	
	private Integer responderId;
	
	private Status status;
	
	private ZonedDateTime lastUpdate;

	public String getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public Integer getResponderId() {
		return responderId;
	}

	public void setResponderId(Integer responderId) {
		this.responderId = responderId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

    public ZonedDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate( ZonedDateTime lastUpdate ) {
        this.lastUpdate = lastUpdate;
    }

    @Override
	public String toString() {
		return "Mission [incidentId=" + incidentId + ", responderId=" + responderId + ", status=" + status
				+ ", lastUpdate=" + lastUpdate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((incidentId == null) ? 0 : incidentId.hashCode());
		result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result + ((responderId == null) ? 0 : responderId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Mission other = (Mission) obj;
		if (incidentId == null) {
			if (other.incidentId != null)
				return false;
		} else if (!incidentId.equals(other.incidentId))
			return false;
		if (lastUpdate == null) {
			if (other.lastUpdate != null)
				return false;
		} else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (responderId == null) {
			if (other.responderId != null)
				return false;
		} else if (!responderId.equals(other.responderId))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}