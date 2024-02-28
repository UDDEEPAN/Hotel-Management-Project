/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.RoomDao;
import hotel.management.entity.RoomEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class RoomDaoImpl implements RoomDao {
    
    @Override
    public boolean add(RoomEntity t) throws Exception {
             return CrudUtil.executeUpdate("INSERT INTO room VALUES(?,?,?,?,?,?)",
                t.getRoom_number(),
                t.getRoom_category(),
                t.getRoom_price(),
                t.getIn_date(),
                t.getOut_date(),
                t.getReseverd());
                 
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE room SET room_category=?,room_price=?,In_date=?,Out_date=?,reseverd=?" 
                +"WHERE room_number=?",
                t.getRoom_category(),
                t.getRoom_price(),
                t.getIn_date(),
                t.getOut_date(),
                t.getReseverd(),
                t.getRoom_number());
        
          
                
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM room WHERE room_number =?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM room WHERE room_number =?", id);
        while (rst.next()) {
            return new RoomEntity(
                    rst.getString("room_number"),
                    rst.getString("room_category"),
                    rst.getString("room_price"),
                    rst.getString("In_date"),
                    rst.getString("Out_date"),
                    rst.getString("reseverd"));
        }
        return null;
    }

    @Override
    public ArrayList<RoomEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM room");
        List<RoomEntity> roomEntities = new ArrayList<>();
        while (rst.next()) {
            roomEntities.add(new RoomEntity(
                    rst.getString("room_number"),
                    rst.getString("room_category"),
                    rst.getString("room_price"),
                    rst.getString("In_date"),
                    rst.getString("Out_date"),
                    rst.getString("reseverd")));

        }
        return (ArrayList<RoomEntity>) roomEntities;
    }

}
