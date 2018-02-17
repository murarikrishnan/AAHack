package aahackathon.com.aahackathon.dao;

public class PlanPojo {
    private PlanPojoBookingContacts BookingContacts;
    private String PNR;
    private PlanPojoJourneyServices JourneyServices;
    private PlanPojoBookingPassengers BookingPassengers;
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
