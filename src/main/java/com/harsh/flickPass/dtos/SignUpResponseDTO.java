package com.harsh.flickPass.dtos;

import com.harsh.flickPass.enums.ResponseStatus;
import lombok.Data;

@Data
public class SignUpResponseDTO {
    private Long userId;
    private ResponseStatus responseStatus;
}
