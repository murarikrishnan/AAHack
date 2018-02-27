package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoJourneyServicesJourneyServiceSegmentsSegment {
    @SerializedName("FlightDesignator")
    private PlanPojoJourneyServicesJourneyServiceSegmentsSegmentFlightDesignator FlightDesignator;
    @SerializedName("DepartureTime")
    private String DepartureTime;
    @SerializedName("ArrivalStation")
    private String ArrivalStation;
    @SerializedName("DepartureStation")
    private String DepartureStation;
    @SerializedName("ArrivalTime")
    private String ArrivalTime;

    public PlanPojoJourneyServicesJourneyServiceSegmentsSegmentFlightDesignator getFlightDesignator() {
        return this.FlightDesignator;
    }

    public void setFlightDesignator(PlanPojoJourneyServicesJourneyServiceSegmentsSegmentFlightDesignator FlightDesignator) {
        this.FlightDesignator = FlightDesignator;
    }

    public String getDepartureTime() {
        return this.DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public String getArrivalStation() {
        return this.ArrivalStation;
    }

    public void setArrivalStation(String ArrivalStation) {
        this.ArrivalStation = ArrivalStation;
    }

    public String getDepartureStation() {
        return this.DepartureStation;
    }

    public void setDepartureStation(String DepartureStation) {
        this.DepartureStation = DepartureStation;
    }

    public String getArrivalTime() {
        return this.ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
}
