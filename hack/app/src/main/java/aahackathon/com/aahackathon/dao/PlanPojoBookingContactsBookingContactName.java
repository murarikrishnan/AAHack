package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingContactsBookingContactName {
    @SerializedName("FirstName")
    private String FirstName;
    @SerializedName("Title")
    private String Title;
    @SerializedName("LastName")
    private String LastName;
    @SerializedName("MiddleName")
    private Object MiddleName;

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Object getMiddleName() {
        return this.MiddleName;
    }

    public void setMiddleName(Object MiddleName) {
        this.MiddleName = MiddleName;
    }
}
