package com.example.task.Service;
import com.example.task.Entity.Role;
public interface RoleService {
    Iterable<Role> findAll();
    void save(Role role);


}
