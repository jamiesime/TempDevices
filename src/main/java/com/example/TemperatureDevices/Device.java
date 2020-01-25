package com.example.TemperatureDevices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Device {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	public String name;
	@Column
	public Float currenttemp;
	@Column
	public Float maxtemp;
	@Column
	public Float mintemp;
	
}
