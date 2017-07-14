package com.thesis.repository;

import com.thesis.model.Role;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */

//FIXME JUST a test case
class saveRole{

    public static List<Role> getRoles(){
        return new ArrayList<Role>(){{
            add(new Role(1L, "Chief", "System Chief"));
            add(new Role(2L, "Supply Officer", "Supply Office Manager"));
            add(new Role(3L, "Personnel", "Normal Employee"));

        }};
    }
}

@Repository
public class RoleRepositpryImpl implements RoleRepository {
    @Override
    public boolean addRole(Role role) {
        return false;
    }

    @Override
    public boolean removeRole(Long roleId) {
        return false;
    }

    @Override
    public boolean editRole(Role role) {
        return false;
    }

    @Override
    public List<Role> fetchRoles() {
        return saveRole.getRoles();
    }
}
