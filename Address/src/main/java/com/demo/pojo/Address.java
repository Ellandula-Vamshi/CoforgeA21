package com.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")

public class Address {
	
	private Integer zip;
	private String Hname;
	private String Haddress;
	private String district;
	
	private String Hstate;
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHousename() {
		return Hname;
	}
	public void setHousename(String Hname) {
		this.Hname = Hname;
	}
	public String getHouseaddress() {
		return Haddress;
	}
	public void setHouseaddress(String houseaddress) {
		this.Haddress = Haddress;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getHousestate() {
		return Hstate;
	}
	public void setHousestate(String housestate) {
		this.Hstate = housestate;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
}