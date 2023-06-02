package com.universal.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ne")
public class Native_Employee extends Employee
{
	@Column(name = "office")
	private String ofc_address;

	public Native_Employee() {
		super();
	}

	public String getOfc_address() {
		return ofc_address;
	}

	public void setOfc_address(String ofc_address) {
		this.ofc_address = ofc_address;
	}
}
