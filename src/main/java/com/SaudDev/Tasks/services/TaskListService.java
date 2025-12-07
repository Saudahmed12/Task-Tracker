package com.SaudDev.Tasks.services;

import com.SaudDev.Tasks.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> ListTaskLists();
    TaskList creatTaskList(TaskList taskList);
    Optional<TaskList> getTaskList(UUID id);

    TaskList updateTaskList(UUID taskListId, TaskList taskList);

    void deleteTaskList(UUID taskListId);
}
