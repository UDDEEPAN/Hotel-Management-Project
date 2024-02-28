/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.customer;

import hotel.management.dto.CustomerDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface CustomerService extends SuperService{

    String saveCustomer(CustomerDto customerDto) throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String custid) throws Exception;

    CustomerDto getCustomer(String custid) throws Exception;

    List<CustomerDto> getAll() throws Exception;
}
