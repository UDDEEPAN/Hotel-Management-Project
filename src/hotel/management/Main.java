/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.management;

import hotel.management.view.CustomerView;
import hotel.management.view.MainView;
import hotel.management.view.ReservationView;
import hotel.management.view.RoomView;
import hotel.management.view.UserLoginView;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ReservationView().setVisible(true);
    }
    
}
