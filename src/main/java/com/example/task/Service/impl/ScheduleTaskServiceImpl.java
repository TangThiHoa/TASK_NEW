package com.example.task.Service.impl;
import com.example.task.Entity.ScheduleTask;
import com.example.task.Repository.ScheduleTaskRepository;
import com.example.task.Service.ScheduleTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleTaskServiceImpl implements ScheduleTaskService {
    @Autowired
    ScheduleTaskRepository taskRepository;

    @Override
    public List<ScheduleTask> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public ScheduleTask findById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void save(ScheduleTask scheduleTask) {
        taskRepository.save(scheduleTask);
    }
    @Override
    public void remove(Long id) {
        taskRepository.deleteById(id);

    }
}
