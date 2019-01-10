package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;

public class CommanderOverride implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum OverridePriority {
        REPORTED_TIME, DISTANCE
    }

    private OverridePriority overridePriority;

    public OverridePriority getOverridePriority() {
        return overridePriority;
    }

    public void setOverridePriority( OverridePriority overridePriority ) {
        this.overridePriority = overridePriority;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( overridePriority == null ) ? 0 : overridePriority.hashCode() );
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
        CommanderOverride other = (CommanderOverride) obj;
        if ( overridePriority != other.overridePriority )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CommanderOverride [overridePriority=" + overridePriority + "]";
    }

}