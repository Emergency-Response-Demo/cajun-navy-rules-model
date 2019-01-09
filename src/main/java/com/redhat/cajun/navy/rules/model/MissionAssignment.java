package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class MissionAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    private int compatibilityScore = 0;
    private final Incident incident;
    private final Responder responder;

    public MissionAssignment( Incident incident, Responder responder ) {
        this.incident = incident;
        this.responder = responder;
        this.compatibilityScore = 0;
    }

    public int getCompatibilityScore() {
        return compatibilityScore;
    }

    public void setCompatibilityScore( int compatibilityScore ) {
        this.compatibilityScore = compatibilityScore;
    }

    public Incident getIncident() {
        return incident;
    }

    public Responder getResponder() {
        return responder;
    }

    public ZonedDateTime getReportedTime() {
        if ( !( incident == null ) ) {
            return this.incident.getReportedTime();
        } else {
            return null;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( incident == null ) ? 0 : incident.hashCode() );
        result = prime * result + ( ( responder == null ) ? 0 : responder.hashCode() );
        result = prime * result + compatibilityScore;
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        MissionAssignment other = (MissionAssignment) obj;
        if ( incident == null ) {
            if ( other.incident != null )
                return false;
        } else if ( !incident.equals( other.incident ) )
            return false;
        if ( responder == null ) {
            if ( other.responder != null )
                return false;
        } else if ( !responder.equals( other.responder ) )
            return false;
        if ( compatibilityScore != other.compatibilityScore )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MissionAssignment [score=" + compatibilityScore + ", incident=" + incident + ", responder=" + responder + "]";
    }

}