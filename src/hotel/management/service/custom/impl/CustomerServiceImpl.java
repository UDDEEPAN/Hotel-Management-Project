/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.CustomerDao;
import hotel.management.dto.CustomerDto;
import hotel.management.entity.CustomerEntity;
import hotel.management.service.customer.CustomerService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(dto.getCustid(),
                dto.getName(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getMobilenumber(),
                dto.getNic());
        if (customerDao.add(customerEntity)) {
            return "Successfully saved";
        } else {
            return "fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getCustid(),
                customerDto.getName(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getMobilenumber(),
                customerDto.getNic());

        if (customerDao.update(customerEntity)) {
            return "Succesfully Updated";
        }
        return "Fail";

    }

    @Override
    public String deleteCustomer(String custid) throws Exception {
        if (customerDao.delete(custid)) {
            return "Successfully Deleted";
        }
        return "Fail";
    }

    @Override
    public CustomerDto getCustomer(String custid) throws Exception {
        CustomerEntity customerEntity = customerDao.get(custid);
        if (customerEntity != null) {
            return new CustomerDto(customerEntity.getCust_id(),
                    customerEntity.getName(),
                    customerEntity.getAddress(),
                    customerEntity.getCity(),
                    customerEntity.getProvince(),
                    customerEntity.getMobile_number(),
                    customerEntity.getNic());
        }
        return null;

    }

    @Override
    public List<CustomerDto> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (CustomerEntity customerEntity : customerEntities) {
            customerDtos.add(new CustomerDto(customerEntity.getCust_id(),
                    customerEntity.getName(),
                    customerEntity.getAddress(),
                    customerEntity.getCity(),
                    customerEntity.getProvince(),
                    customerEntity.getMobile_number(),
                    customerEntity.getNic()));
        }

        return customerDtos;
    }

}
