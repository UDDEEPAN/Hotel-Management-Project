/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.CustomerDto;
import hotel.management.dto.RoomDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.customer.RoomService;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class RoomController {

    private RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

    public String save(RoomDto roomDto) throws Exception {
        return roomService.saveRoom(roomDto);
    }

    public String update(RoomDto roomDto) throws Exception {
        return roomService.updateRoom(roomDto);
    }

    public String delete(String room_number) throws Exception {
        return roomService.deleteRoom(room_number);
    }

    public RoomDto get(String room_number) throws Exception {
        return roomService.getRoom(room_number);
    }

    public ArrayList<RoomDto> getAll() throws Exception {
        return (ArrayList<RoomDto>) roomService.getAll();
    }

}
