/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.CustomerDao;
import hotel.management.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?,?,?)",
                t.getCust_id(),
                t.getName(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getMobile_number(),
                t.getNic());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET name=?,address=?,city=?,province=?,mobile_number=?, nic=?" 
                +"WHERE cust_id=?",
                t.getName(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getMobile_number(),
                t.getNic(),
                t.getCust_id());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE cust_id = ?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM customer WHERE cust_id = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
                    rst.getString("cust_id"),
                    rst.getString("name"),
                    rst.getString("address"),
                    rst.getString("city"),
                    rst.getString("province"),
                    rst.getInt("mobile_number"),
                    rst.getString("nic"));
        }

        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("cust_id"),
                    rst.getString("name"),
                    rst.getString("address"),
                    rst.getString("city"),
                    rst.getString("province"),
                    rst.getInt("mobile_number"),
                    rst.getString("nic")));
        }
        return (ArrayList<CustomerEntity>) customerEntities;

    }

}
