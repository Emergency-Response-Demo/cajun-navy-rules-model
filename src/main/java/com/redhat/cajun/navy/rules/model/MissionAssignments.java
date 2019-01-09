package com.redhat.cajun.navy.rules.model;

import java.util.ArrayList;
import java.util.Collection;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class MissionAssignments {

    private Collection<Incident> incidents = new ArrayList<>();
    private Collection<Responder> responders = new ArrayList<>();

    private HardSoftScore score;

    @PlanningEntityCollectionProperty
    public Collection<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents( Collection<Incident> incidents ) {
        this.incidents = incidents;
    }

    @ValueRangeProvider( id = "responders" )
    @ProblemFactCollectionProperty
    public Collection<Responder> getResponders() {
        return responders;
    }

    public void setResponders( Collection<Responder> responders ) {
        this.responders = responders;
    }

    @PlanningScore
    public HardSoftScore getScore() {
        return score;
    }

    public void setScore( HardSoftScore score ) {
        this.score = score;
    }

}