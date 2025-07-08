package com.harsh.flickPass.models;

import com.harsh.flickPass.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity(name = "bookings")
public class Booking extends BaseModel {
    //Booking : Show
    //1 : 1
    //M : 1
    @ManyToOne
    private com.harsh.flickPass.models.Show show;
    private Double amount;

    //Booking : ShowSeat
    //1 : M
    //M : 1
    @ManyToMany
    private List<com.harsh.flickPass.models.ShowSeat> showSeats;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    //Booking : User
    //1 : 1
    //M : 1
    @ManyToOne
    private User user;

    //Booking : Payment
    //1 : M
    //1 : 1
    @OneToMany
    private List<com.harsh.flickPass.models.Payment> payments;
    private Date bookedAt;
}
