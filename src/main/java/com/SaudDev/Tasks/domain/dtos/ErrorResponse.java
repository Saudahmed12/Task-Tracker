package com.SaudDev.Tasks.domain.dtos;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
