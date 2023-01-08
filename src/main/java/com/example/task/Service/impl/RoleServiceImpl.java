package com.example.task.Service.impl;
import com.example.task.Entity.Role;
import com.example.task.Repository.RoleRepository;
import com.example.task.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
roleRepository.save(role);
    }



}
