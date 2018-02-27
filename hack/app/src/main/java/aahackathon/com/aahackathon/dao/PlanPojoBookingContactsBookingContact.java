package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingContactsBookingContact {
    @SerializedName("OtherPhone")
    private String OtherPhone;
    @SerializedName("WorkPhone")
    private Object WorkPhone;
    @SerializedName("HomePhone")
    private String HomePhone;
    @SerializedName("EmailAddress")
    private String EmailAddress;
    @SerializedName("Name")
    private PlanPojoBookingContactsBookingContactName Name;

    public String getOtherPhone() {
        return this.OtherPhone;
    }

    public void setOtherPhone(String OtherPhone) {
        this.OtherPhone = OtherPhone;
    }

    public Object getWorkPhone() {
        return this.WorkPhone;
    }

    public void setWorkPhone(Object WorkPhone) {
        this.WorkPhone = WorkPhone;
    }

    public String getHomePhone() {
        return this.HomePhone;
    }

    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    public String getEmailAddress() {
        return this.EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public PlanPojoBookingContactsBookingContactName getName() {
        return this.Name;
    }

    public void setName(PlanPojoBookingContactsBookingContactName Name) {
        this.Name = Name;
    }
}
