package com.thesis.repository;


import com.thesis.model.security.Role;

import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */
public interface RoleRepository {

    boolean addRole(Role role);
    boolean removeRole(Long roleId);
    boolean editRole(Role role);
    List<Role> fetchRoles();
}
