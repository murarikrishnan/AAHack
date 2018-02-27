package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoJourneyServicesJourneyServiceSegments {
    @SerializedName("Segment1")
    private PlanPojoJourneyServicesJourneyServiceSegmentsSegment1[] Segment1;
    @SerializedName("Segment")
    private PlanPojoJourneyServicesJourneyServiceSegmentsSegment[] Segment;

    public PlanPojoJourneyServicesJourneyServiceSegmentsSegment1[] getSegment1() {
        return this.Segment1;
    }

    public void setSegment1(PlanPojoJourneyServicesJourneyServiceSegmentsSegment1[] Segment1) {
        this.Segment1 = Segment1;
    }

    public PlanPojoJourneyServicesJourneyServiceSegmentsSegment[] getSegment() {
        return this.Segment;
    }

    public void setSegment(PlanPojoJourneyServicesJourneyServiceSegmentsSegment[] Segment) {
        this.Segment = Segment;
    }
}
