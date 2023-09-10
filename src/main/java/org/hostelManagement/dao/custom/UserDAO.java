package org.hostelManagement.dao.custom;


import org.hostelManagement.dao.CrudDAO;
import org.hostelManagement.entity.User;

public interface UserDAO extends CrudDAO<User> {

    boolean valid(User user);
}
