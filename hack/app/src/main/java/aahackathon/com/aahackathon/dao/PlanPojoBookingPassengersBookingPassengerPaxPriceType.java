package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingPassengersBookingPassengerPaxPriceType {
    @SerializedName("PaxType")
    private String PaxType;

    public String getPaxType() {
        return this.PaxType;
    }

    public void setPaxType(String PaxType) {
        this.PaxType = PaxType;
    }
}
