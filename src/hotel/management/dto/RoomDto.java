/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dto;

/**
 *
 * @author Lenovo
 */
public class RoomDto {

    private String roomNumber;
    private String roomCategory;
    private String roomPrice;
    private String inDate;
    private String outDate;
    private String reseverd;

    public RoomDto(String roomNumber, String roomCategory, String roomPrice, String inDate, String outDate, String reseverd) {
        this.roomNumber = roomNumber;
        this.roomCategory = roomCategory;
        this.roomPrice = roomPrice;
        this.inDate = inDate;
        this.outDate = outDate;
        this.reseverd = reseverd;
    }
    public RoomDto(){}

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the roomCategory
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * @param roomCategory the roomCategory to set
     */
    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    /**
     * @return the roomPrice
     */
    public String getRoomPrice() {
        return roomPrice;
    }

    /**
     * @param roomPrice the roomPrice to set
     */
    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * @return the inDate
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * @param inDate the inDate to set
     */
    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    /**
     * @return the outDate
     */
    public String getOutDate() {
        return outDate;
    }

    /**
     * @param outDate the outDate to set
     */
    public void setOutDate(String outDate) {
        this.outDate = outDate;
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
        return "RoomDto{" + "roomNumber=" + roomNumber + ", roomCategory=" + roomCategory + ", roomPrice=" + roomPrice + ", inDate=" + inDate + ", outDate=" + outDate + ", reseverd=" + reseverd + '}';
    }

}
