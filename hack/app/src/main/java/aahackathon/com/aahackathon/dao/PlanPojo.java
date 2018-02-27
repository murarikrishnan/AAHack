package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojo {
    @SerializedName("BookingContacts")
    private PlanPojoBookingContacts BookingContacts;
    @SerializedName("PNR")
    private String PNR;
    @SerializedName("JourneyServices")
    private PlanPojoJourneyServices JourneyServices;
    @SerializedName("BookingPassengers")
    private PlanPojoBookingPassengers BookingPassengers;
    @SerializedName("BookingStatus")
    private String BookingStatus;

    public PlanPojoBookingContacts getBookingContacts() {
        return this.BookingContacts;
    }

    public void setBookingContacts(PlanPojoBookingContacts BookingContacts) {
        this.BookingContacts = BookingContacts;
    }

    public String getPNR() {
        return this.PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public PlanPojoJourneyServices getJourneyServices() {
        return this.JourneyServices;
    }

    public void setJourneyServices(PlanPojoJourneyServices JourneyServices) {
        this.JourneyServices = JourneyServices;
    }

    public PlanPojoBookingPassengers getBookingPassengers() {
        return this.BookingPassengers;
    }

    public void setBookingPassengers(PlanPojoBookingPassengers BookingPassengers) {
        this.BookingPassengers = BookingPassengers;
    }

    public String getBookingStatus() {
        return this.BookingStatus;
    }

    public void setBookingStatus(String BookingStatus) {
        this.BookingStatus = BookingStatus;
    }
}
