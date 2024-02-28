/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

/**
 *
 * @author Lenovo
 */
public class RoomEntity {

    private String room_number;
    private String room_category;
    private String room_price;
    private String In_date;
    private String Out_date;
    private String reseverd;

    public RoomEntity(String room_number, String room_category, String room_price, String In_date, String Out_date, String reseverd) {
        this.room_number = room_number;
        this.room_category = room_category;
        this.room_price = room_price;
        this.In_date = In_date;
        this.Out_date = Out_date;
        this.reseverd = reseverd;

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
     * @return the room_category
     */
    public String getRoom_category() {
        return room_category;
    }

    /**
     * @param room_category the room_category to set
     */
    public void setRoom_category(String room_category) {
        this.room_category = room_category;
    }

    /**
     * @return the room_price
     */
    public String getRoom_price() {
        return room_price;
    }

    /**
     * @param room_price the room_price to set
     */
    public void setRoom_price(String room_price) {
        this.room_price = room_price;
    }

    /**
     * @return the In_date
     */
    public String getIn_date() {
        return In_date;
    }

    /**
     * @param In_date the In_date to set
     */
    public void setIn_date(String In_date) {
        this.In_date = In_date;
    }

    /**
     * @return the Out_date
     */
    public String getOut_date() {
        return Out_date;
    }

    /**
     * @param Out_date the Out_date to set
     */
    public void setOut_date(String Out_date) {
        this.Out_date = Out_date;
    }

    /**
     * @return the reseverd
     */
    public String getReseverd() {
        return reseverd;
    }

    /**
     * @param reseverd the reseverd to set
     */
    public void setReseverd(String reseverd) {
        this.reseverd = reseverd;
    }

    @Override
    public String toString() {
        return "RoomEntity{" + "room_number=" + room_number + ", room_category=" + room_category + ", room_price=" + room_price + ", In_date=" + In_date + ", Out_date=" + Out_date + ", reseverd=" + reseverd + '}';
    }

}
