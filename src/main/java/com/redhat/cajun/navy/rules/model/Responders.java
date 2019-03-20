package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.util.List;

public class Responders implements Serializable {
	private static final long serialVersionUID = 1L;
	
	List<Responder> responders;

	public List<Responder> getResponders() {
		return responders;
	}

	public void setResponders(List<Responder> responders) {
		this.responders = responders;
	}
	
	@Override
	public String toString() {
		return "Responders [responders=" + responders + "]";
	}
}
