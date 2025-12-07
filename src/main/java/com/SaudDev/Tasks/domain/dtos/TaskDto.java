package com.SaudDev.Tasks.domain.dtos;

import com.SaudDev.Tasks.domain.entities.TaskPriority;
import com.SaudDev.Tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
