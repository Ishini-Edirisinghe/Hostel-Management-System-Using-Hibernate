package org.hostelManagement.bo;


import org.hostelManagement.bo.custom.impl.ReservationBoImpl;
import org.hostelManagement.bo.custom.impl.RoomBOImpl;
import org.hostelManagement.bo.custom.impl.StudentBOImpl;
import org.hostelManagement.bo.custom.impl.UserBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {
        USER, STUDENT, ROOM , RESERVATION

    }

    public SuperBO getBO(BOTypes boTypes) {

        switch (boTypes) {

            case USER:
                return new UserBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            case ROOM:
                return new RoomBOImpl();
           case RESERVATION:
                return new ReservationBoImpl();
            default:
                return null;
        }


    }

}
