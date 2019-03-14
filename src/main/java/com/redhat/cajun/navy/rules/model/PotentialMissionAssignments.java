package com.redhat.cajun.navy.rules.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * This class encapsulates a complete view of all the mission assignments.
 * 
 * You can implement more advanced prioritization algorithms in Java here, or extend this class so that rules can be applied to it.
 *
 */
public class PotentialMissionAssignments implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean prioritized = false;

    private final List<MissionAssignment> potentialAssignments = new ArrayList<>();

    public PotentialMissionAssignments( Collection<MissionAssignment> potentialAssignments ) {
        this.potentialAssignments.addAll( potentialAssignments );
    }

    public void prioritizeByReportedTime() {
        this.potentialAssignments.sort( Comparator.comparing( MissionAssignment::getReportedTime ) );
        prioritized = true;
    }

    public void prioritizeByCompatibility() {
        this.potentialAssignments.sort( Comparator.comparing( MissionAssignment::getCompatibilityScore ) );
        prioritized = true;
    }

    public void defaultPrioritization() {
        // @michael ~ NOTE ~ using reversed() makes it so that the highest/most recent results are on the top
        this.potentialAssignments.sort( Comparator.comparing( MissionAssignment::getCompatibilityScore ).reversed()
                                          .thenComparing( Comparator.comparing( MissionAssignment::getReportedTime ).reversed() ) );
        System.err.println( potentialAssignments.size() + "\n" );
        prioritized = true;
    }

    public Mission getAssignedMission() {
        if ( potentialAssignments.size() > 0 ) {
            MissionAssignment assignment = potentialAssignments.get( 0 );
            Mission m = new Mission();
            m.setIncidentId( assignment.getIncident().getId() );
            m.setResponderId( assignment.getResponder().getId() );
            m.setLastUpdate( System.currentTimeMillis() );
            m.setStatus( Status.ASSIGNED );
            m.setResponderStartLat(assignment.getResponder().getLatitude());
            m.setResponderStartLong(assignment.getResponder().getLongitude());
            m.setIncidentLat(assignment.getIncident().getLatitude());
            m.setIncidentLong(assignment.getIncident().getLongitude());
            return m;
        } else {
            return null;
        }

    }

    public boolean isPrioritized() {
        return prioritized;
    }

    public void setPrioritized( boolean sorted ) {
        this.prioritized = sorted;
    }

    public List<MissionAssignment> getPotentialAssignments() {
        return potentialAssignments;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( potentialAssignments == null ) ? 0 : potentialAssignments.hashCode() );
        result = prime * result + ( prioritized ? 1231 : 1237 );
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
        PotentialMissionAssignments other = (PotentialMissionAssignments) obj;
        if ( potentialAssignments == null ) {
            if ( other.potentialAssignments != null )
                return false;
        } else if ( !potentialAssignments.equals( other.potentialAssignments ) )
            return false;
        if ( prioritized != other.prioritized )
            return false;
        return true;
    }

}