package com.zGuindou.ProjetManager.presentation;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class ProjectBean {
	
	public Logger log = Logger.getLogger(ProjectBean.class);
	
	public ProjectBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String title;
	private String description;
	private String budget;
	private String type;
	private String active;

	private List<SelectItem> typeList;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public List<SelectItem> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<SelectItem> typeList) {
		this.typeList = typeList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void saveData(ActionEvent e) {
		log.info("Title is : " + title);
	}

	@PostConstruct
	public void initBean() {
		typeList = new ArrayList<>();
		typeList.add(new SelectItem("", ""));
		typeList.add(new SelectItem(1, "Informatique"));
		typeList.add(new SelectItem(2, "Commerce"));
		typeList.add(new SelectItem(3, "Math"));
	}

	public void addProject(ActionEvent e) {
		log.error("Les valeurs : ");
	}
	

}
