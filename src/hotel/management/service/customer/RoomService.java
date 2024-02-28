/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.customer;

import hotel.management.dto.RoomDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface RoomService extends SuperService   {

    String saveRoom(RoomDto roomDto) throws Exception;

    String updateRoom(RoomDto roomDto) throws Exception;

    String deleteRoom(String room_number) throws Exception;

    RoomDto getRoom(String room_number) throws Exception;

    List<RoomDto> getAll() throws Exception;
}
