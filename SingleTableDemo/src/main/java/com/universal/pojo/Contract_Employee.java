package com.universal.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ce")
public class Contract_Employee extends Employee
{
	@Column(name = "site")
	private String site_address;

	public Contract_Employee() {
		super();
	}

	public String getSite_address() {
		return site_address;
	}

	public void setSite_address(String site_address) {
		this.site_address = site_address;
	}
}
