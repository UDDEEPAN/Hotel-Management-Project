/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.ReservationDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.customer.ReservationService;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ReservationController {

    private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String PlaceReservasion(ReservationDto dto) throws Exception {
        return reservationService.PlaceReservasion(dto);

    }

    public String Delete(String reservation_id) throws Exception {
        return reservationService.Delete(reservation_id);
    }

    public ReservationDto get(String reservation_id) throws Exception {
        return reservationService.getReservation(reservation_id);

    }

    public ArrayList<ReservationDto> getAll() throws Exception {
        return (ArrayList<ReservationDto>) reservationService.getAll();
    }

}
