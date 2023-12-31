package org.hostelManagement.dao;


import org.hostelManagement.dao.custom.impl.ReservationDAOImpl;
import org.hostelManagement.dao.custom.impl.RoomDAOImpl;
import org.hostelManagement.dao.custom.impl.StudentDAOImpl;
import org.hostelManagement.dao.custom.impl.UserDAOImpl;

public class DAOFactory implements SuperDAO {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        USER, STUDENT, ROOM, RESERVATION
    }

    public SuperDAO getDAO(DAOTypes daoTypes) {

        switch (daoTypes) {

            case USER:
                return new UserDAOImpl();

            case STUDENT:
                return new StudentDAOImpl();

            case ROOM:
                return new RoomDAOImpl();

            case RESERVATION:
                return new ReservationDAOImpl();

            default:
                return null;


        }
    }
}
