package com.example.roomtasklist.addtasks.domain

import com.example.roomtasklist.addtasks.data.TaskRepository
import com.example.roomtasklist.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}