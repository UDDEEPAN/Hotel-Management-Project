/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

/**
 *
 * @author Lenovo
 */
public class CustomerEntity {

    private String cust_id;
    private String name;
    private String address;
    private String city;
    private String province;
    private Integer mobile_number;
    private String nic;

    public CustomerEntity(String cust_id, String name, String address, String city, String province, Integer mobile_number, String nic) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.mobile_number = mobile_number;
        this.nic = nic;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the mobile_number
     */
    public Integer getMobile_number() {
        return mobile_number;
    }

    /**
     * @param mobile_number the mobile_number to set
     */
    public void setMobile_number(Integer mobile_number) {
        this.mobile_number = mobile_number;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "cust_id=" + cust_id + ", name=" + name + ", address=" + address + ", city=" + city + ", province=" + province + ", mobile_number=" + mobile_number + ", nic=" + nic + '}';
    }

}
