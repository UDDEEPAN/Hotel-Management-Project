/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dto;

/**
 *
 * @author Lenovo
 */
public class CustomerDto {

    private String custid;
    private String name;
    private String address;
    private String city;
    private String province;
    private Integer mobilenumber;
    private String nic;

    public CustomerDto(String custid, String name, String address, String city, String province, Integer mobilenumber, String nic) {
        this.custid = custid;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.mobilenumber = mobilenumber;
        this.nic = nic;

    }
     public CustomerDto(){}
    /**
     * @return the custid
     */
    public String getCustid() {
        return custid;
    }

    /**
     * @param custid the custid to set
     */
    public void setCustid(String custid) {
        this.custid = custid;
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
     * @return the mobilenumber
     */
    public Integer getMobilenumber() {
        return mobilenumber;
    }

    /**
     * @param mobilenumber the mobilenumber to set
     */
    public void setMobilenumber(Integer mobilenumber) {
        this.mobilenumber = mobilenumber;
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
        return "CustomerDto{" + "custid=" + custid + ", name=" + name + ", address=" + address + ", city=" + city + ", province=" + province + ", mobilenumber=" + mobilenumber + ", nic=" + nic + '}';
    }

}
