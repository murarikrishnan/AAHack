package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingPassengers {
    @SerializedName("BookingPassenger")
    private PlanPojoBookingPassengersBookingPassenger[] BookingPassenger;

    public PlanPojoBookingPassengersBookingPassenger[] getBookingPassenger() {
        return this.BookingPassenger;
    }

    public void setBookingPassenger(PlanPojoBookingPassengersBookingPassenger[] BookingPassenger) {
        this.BookingPassenger = BookingPassenger;
    }
}
