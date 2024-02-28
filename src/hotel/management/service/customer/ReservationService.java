/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.customer;

import hotel.management.dto.ReservationDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ReservationService extends SuperService {
    String PlaceReservasion(ReservationDto reservationDto)throws Exception;
    ReservationDto getReservation(String id)throws Exception;
    List<ReservationDto>getAll()throws Exception;
    String Delete(String id)throws Exception;
    
    
}
