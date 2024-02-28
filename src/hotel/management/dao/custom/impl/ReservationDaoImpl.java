/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudDao;
import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.ReservationDao;
import hotel.management.entity.ReservationEntity;
import hotel.management.entity.RoomEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ReservationDaoImpl implements ReservationDao {

    @Override
    public boolean add(ReservationEntity t) throws Exception {
        System.out.println("t   : "+t);
        
        return CrudUtil.executeUpdate("INSERT INTO reservation values(?,?,?,?)",
                t.getReservation_id(),
                t.getCust_id(),
                t.getRoom_number(),
                t.getDate());
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM reservation WHERE reservation_id = ?", id);
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM reservation WHERE reservation_id =?", id);
        while (rst.next()) {
            return new ReservationEntity(
                    rst.getString("reservation_id"),
                    rst.getString("cust_id"),
                    rst.getString("room_number"),
                    rst.getString("date"));

        }
        return null;
    }

    @Override
    public ArrayList<ReservationEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM reservation");
        List<ReservationEntity> reservationEntitys = new ArrayList<>();
        while (rst.next()) {
            reservationEntitys.add(new ReservationEntity(
                    rst.getString("reservation_id"),
                    rst.getString("cust_id"),
                    rst.getString("room_number"),
                    rst.getString("date")));

        }
        return (ArrayList<ReservationEntity>) reservationEntitys;

    }
}
