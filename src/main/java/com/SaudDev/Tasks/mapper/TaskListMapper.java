package com.SaudDev.Tasks.mapper;

import com.SaudDev.Tasks.domain.dtos.TaskListDto;
import com.SaudDev.Tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
