package com.harsh.flickPass.dtos;

import com.harsh.flickPass.enums.ResponseStatus;
import lombok.Data;

@Data
public class BookMovieShowResponseDTO {
    private Long bookingId;
    private double amount;
    private ResponseStatus responseStatus;
}
