package com.zGuindou.ProjetManager.DAO.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class Type implements Serializable {
	
	@Id
	private Long id;
	private String name;
	private String description;
	private String active;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	
	public Type() {
		super();
	}
	
	public Type(Long id, String name, String description, String active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
	}
	
	
	
}
