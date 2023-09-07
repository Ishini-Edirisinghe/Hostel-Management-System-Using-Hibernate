package org.hostelManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomDTO {

    private String room_id;
    private String type;
    private Double key_money;
    private Integer qty;
    List<dto.ReservationDTO> reservationList = new ArrayList<>();
}
