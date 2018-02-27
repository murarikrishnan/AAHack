package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoJourneyServices {
    @SerializedName("JourneyService")
    private PlanPojoJourneyServicesJourneyService[] JourneyService;

    public PlanPojoJourneyServicesJourneyService[] getJourneyService() {
        return this.JourneyService;
    }

    public void setJourneyService(PlanPojoJourneyServicesJourneyService[] JourneyService) {
        this.JourneyService = JourneyService;
    }
}
