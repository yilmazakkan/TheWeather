package com.yilmazakkan.TheWeather.repository.impl;

import com.yilmazakkan.TheWeather.entity.User;
import com.yilmazakkan.TheWeather.entity.UserRoles;
import com.yilmazakkan.TheWeather.repository.UserRoleDAO;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
@Repository
public class UserRoleDaoImpl implements UserRoleDAO {

    private EntityManager entityManager;

    public UserRoleDaoImpl (EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public UserRoles findById(long id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the user
        UserRoles roles =
                currentSession.get(UserRoles.class, id);

        // return the user
        return roles;
    }

    @Override
    public UserRoles save(UserRoles roles) {
        return null;
    }
}
