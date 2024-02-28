/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.CustomerDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.customer.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class CustomerController {

    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String save(CustomerDto customerDto) throws Exception {
        return customerService.saveCustomer(customerDto);
    }

    public String update(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String delete(String custid) throws Exception {
        return customerService.deleteCustomer(custid);
    }

    public CustomerDto get(String custid) throws Exception {
        return customerService.getCustomer(custid);
    }

    public ArrayList<CustomerDto> getAll() throws Exception {
        return (ArrayList<CustomerDto>) customerService.getAll();
    }

}
