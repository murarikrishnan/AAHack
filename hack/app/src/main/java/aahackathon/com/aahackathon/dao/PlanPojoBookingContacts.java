package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class PlanPojoBookingContacts {
    @SerializedName("BookingContact")
    private PlanPojoBookingContactsBookingContact[] BookingContact;

    public PlanPojoBookingContactsBookingContact[] getBookingContact() {
        return this.BookingContact;
    }

    public void setBookingContact(PlanPojoBookingContactsBookingContact[] BookingContact) {
        this.BookingContact = BookingContact;
    }
}
