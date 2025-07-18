package com.harsh.flickPass.dtos;

import lombok.Data;

import java.util.List;

@Data
public class BookMovieShowRequestDTO {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds;
}
