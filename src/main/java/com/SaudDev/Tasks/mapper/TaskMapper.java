package com.SaudDev.Tasks.mapper;

import com.SaudDev.Tasks.domain.dtos.TaskDto;
import com.SaudDev.Tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);


}
