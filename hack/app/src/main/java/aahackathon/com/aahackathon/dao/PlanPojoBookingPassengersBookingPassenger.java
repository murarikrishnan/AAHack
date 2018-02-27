package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingPassengersBookingPassenger {
    @SerializedName("PassengerFees")
    private Object PassengerFees;
    @SerializedName("Infant")
    private boolean Infant;
    @SerializedName("PaxPriceType")
    private PlanPojoBookingPassengersBookingPassengerPaxPriceType PaxPriceType;

    public Object getPassengerFees() {
        return this.PassengerFees;
    }

    public void setPassengerFees(Object PassengerFees) {
        this.PassengerFees = PassengerFees;
    }

    public boolean getInfant() {
        return this.Infant;
    }

    public void setInfant(boolean Infant) {
        this.Infant = Infant;
    }

    public PlanPojoBookingPassengersBookingPassengerPaxPriceType getPaxPriceType() {
        return this.PaxPriceType;
    }

    public void setPaxPriceType(PlanPojoBookingPassengersBookingPassengerPaxPriceType PaxPriceType) {
        this.PaxPriceType = PaxPriceType;
    }
}
