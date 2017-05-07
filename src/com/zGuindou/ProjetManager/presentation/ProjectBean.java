package com.zGuindou.ProjetManager.presentation;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;

@ManagedBean
@RequestScoped
public class ProjectBean {
	
	public Logger log = Logger.getLogger(ProjectBean.class);
	
	public ProjectBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void saveData(ActionEvent e) {
		log.info("Title is : " + title);
	}
	
	

}
