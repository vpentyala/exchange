package com.logilync.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Insurance {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int planId;
	private String planName;
	private String planProviderName;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanProviderName() {
		return planProviderName;
	}
	public void setPlanProviderName(String planProviderName) {
		this.planProviderName = planProviderName;
	}
	
	
}
