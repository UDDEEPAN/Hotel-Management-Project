/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service;

import hotel.management.service.custom.impl.CustomerServiceImpl;
import hotel.management.service.custom.impl.ReservationServiceImpl;

import hotel.management.service.custom.impl.RoomServiceImpl;

/**
 *
 * @author Lenovo
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
               return (SuperService) new CustomerServiceImpl();
            case ROOM:
                return (SuperService) new RoomServiceImpl();
            case RESERVATION:
               return (SuperService) new ReservationServiceImpl();

            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER,ROOM, RESERVATION
    }

}
