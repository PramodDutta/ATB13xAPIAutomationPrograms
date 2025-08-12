package com.thetestingacademy.sample.ex_07_Payload_management.Class.manualWay.responsePOJO;

import com.thetestingacademy.sample.ex_07_Payload_management.Class.manualWay.requestPOJO.Booking;

public class BookingResponse {
    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
