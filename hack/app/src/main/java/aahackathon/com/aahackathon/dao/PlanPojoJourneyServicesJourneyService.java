package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoJourneyServicesJourneyService {
    @SerializedName("Segments")
    private PlanPojoJourneyServicesJourneyServiceSegments Segments;

    public PlanPojoJourneyServicesJourneyServiceSegments getSegments() {
        return this.Segments;
    }

    public void setSegments(PlanPojoJourneyServicesJourneyServiceSegments Segments) {
        this.Segments = Segments;
    }
}
