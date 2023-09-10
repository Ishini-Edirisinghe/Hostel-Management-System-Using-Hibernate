package org.hostelManagement.dao.custom;


import org.hostelManagement.dao.CrudDAO;
import org.hostelManagement.entity.Student;

import java.util.List;

public interface StudentDAO extends CrudDAO<Student> {
    List<Student> getUnpaidStudents();
}
