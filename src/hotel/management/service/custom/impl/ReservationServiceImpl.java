/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.ReservationDao;
import hotel.management.dao.custom.RoomDao;
import hotel.management.db.DBConnection;
import hotel.management.dto.ReservationDto;
import hotel.management.dto.RoomDto;
import hotel.management.entity.ReservationEntity;
import hotel.management.entity.RoomEntity;
import hotel.management.service.customer.ReservationService;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ReservationServiceImpl implements ReservationService {

    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESERVATION);
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);

    @Override
    public String PlaceReservasion(ReservationDto dto) throws Exception {
        System.out.println(" dto  :   " + dto);
        Connection connection = (Connection) DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            ReservationEntity reservationEntity = new ReservationEntity(dto.getReservation_id(),
                    dto.getCust_id(),
                    dto.getRoom_number(),
                    dto.getDate());
            if (reservationDao.add(reservationEntity)) {
                connection.setAutoCommit(true);
                System.out.println("======================= ");
                return "saved Suucess";
            } else {
                connection.rollback();
                return "Reservation Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } 

    }

    @Override
    public ReservationDto getReservation(String id) throws Exception {
        ReservationEntity entity = reservationDao.get(id);
        if (entity != null) {
            return new ReservationDto(entity.getReservation_id(),
                    entity.getCust_id(),
                    entity.getRoom_number(),
                    entity.getDate());
        }
        return null;
    }

    @Override
    public List<ReservationDto> getAll() throws Exception {
        List<ReservationDto> reservationDto = new ArrayList<>();
        List<ReservationEntity> reservationEntities = reservationDao.getAll();
        for (ReservationEntity entiy : reservationEntities) {
            reservationDto.add(new ReservationDto(entiy.getReservation_id(),
                    entiy.getCust_id(),
                    entiy.getRoom_number(),
                    entiy.getDate()));
        }
        return reservationDto;
    }

    @Override
    public String Delete(String id) throws Exception {
        if (reservationDao.delete(id)) {
            return "Successfull Deleted";
        } else {
            return "Delete Error";
        }
    }

}
