 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.RoomDao;
import hotel.management.dto.RoomDto;
import hotel.management.entity.RoomEntity;
import hotel.management.service.customer.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class RoomServiceImpl implements RoomService{
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);

    @Override
    public String saveRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(dto.getRoomNumber(),
                dto.getRoomCategory(),
                dto.getRoomPrice(),
                dto.getInDate(),
                dto.getOutDate(),
                dto.getReseverd());
                if(roomDao.add(roomEntity)){
                   return "Succesfully saved";
                }else{
                    return "Save Error";
                }
    }

    @Override
    public String updateRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(dto.getRoomNumber(),
                dto.getRoomCategory(),
                dto.getRoomPrice(),
                dto.getInDate(),
                dto.getOutDate(),
                dto.getReseverd());
                if(roomDao.add(roomEntity)){
                   return "Succesfully Update";
                }else{
                    return "Update Error";
                }
    }
    @Override
    public String deleteRoom(String room_number) throws Exception {
        if(roomDao.delete(room_number)){
            return "Succesfully Deleted";
        }else{
            return "Delete Error";
        }
    }

    @Override
    public RoomDto getRoom(String room_number) throws Exception {
         RoomEntity roomEntity = roomDao.get(room_number);
         if(roomEntity !=null){
             return new RoomDto(roomEntity.getRoom_number(),
             roomEntity.getRoom_category(),
             roomEntity.getRoom_price(),
             roomEntity.getIn_date(),
             roomEntity.getOut_date(),
             roomEntity.getReseverd());
         }
        return null;
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
         ArrayList<RoomEntity>roomEntities = roomDao.getAll();
         List<RoomDto>roomDtos = new ArrayList<>();
         for(RoomEntity roomEntity: roomEntities){
             roomDtos.add(new RoomDto(roomEntity.getRoom_number(),
             roomEntity.getRoom_category(),
             roomEntity.getRoom_price(),
             roomEntity.getIn_date(),
             roomEntity.getOut_date(),
             roomEntity.getReseverd()));
         }
        return roomDtos;
    
    
    }
    
}
