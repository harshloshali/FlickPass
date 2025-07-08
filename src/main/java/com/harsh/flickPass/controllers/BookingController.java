package com.harsh.flickPass.controllers;

import com.harsh.flickPass.dtos.BookMovieShowRequestDTO;
import com.harsh.flickPass.dtos.BookMovieShowResponseDTO;
import com.harsh.flickPass.enums.ResponseStatus;
import com.harsh.flickPass.models.Booking;
import com.harsh.flickPass.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieShowResponseDTO bookTicket(BookMovieShowRequestDTO requestDTO) {
        BookMovieShowResponseDTO responseDTO = new BookMovieShowResponseDTO();
        try {
            Booking booking = bookingService.bookTicket(requestDTO.getUserId(), requestDTO.getShowId(), requestDTO.getShowSeatIds());
            responseDTO.setBookingId(booking.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
