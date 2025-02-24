package com.example.roomtasklist.addtasks.domain

import com.example.roomtasklist.addtasks.data.TaskRepository
import com.example.roomtasklist.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)
    }
}