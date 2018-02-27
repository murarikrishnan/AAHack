package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoJourneyServicesJourneyServiceSegmentsSegmentFlightDesignator {
    @SerializedName("FlightNumber")
    private String FlightNumber;

    public String getFlightNumber() {
        return this.FlightNumber;
    }

    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }
}
