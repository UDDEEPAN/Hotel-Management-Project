/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dto;

/**
 *
 * @author Lenovo
 */
public class ReservationDto {

    private String reservation_id;
    private String cust_id;
    private String room_number;
    private String date;
    
    
    public ReservationDto(){}
    
    public ReservationDto(String reservation_id,String cust_id,String room_number,String date){
        this.reservation_id = reservation_id;
        this.cust_id = cust_id;
        this.room_number = room_number;
        this.date = date;
        
    }

    /**
     * @return the reservation_id
     */
    public String getReservation_id() {
        return reservation_id;
    }

    /**
     * @param reservation_id the reservation_id to set
     */
    public void setReservation_id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    /**
     * @return the cust_id
     */
    public String getCust_id() {
        return cust_id;
    }

    /**
     * @param cust_id the cust_id to set
     */
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    /**
     * @return the room_number
     */
    public String getRoom_number() {
        return room_number;
    }

    /**
     * @param room_number the room_number to set
     */
    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "reservation_id=" + reservation_id + ", cust_id=" + cust_id + ", room_number=" + room_number + ", date=" + date + '}';
    }
    

}
