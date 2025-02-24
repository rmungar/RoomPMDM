package com.example.roomtasklist.addtasks.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomtasklist.addtasks.data.TaskDao
import com.example.roomtasklist.addtasks.data.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class TasksManageDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao
}