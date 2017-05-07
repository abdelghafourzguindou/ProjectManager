package com.zGuindou.ProjetManager.presentation;


import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import com.zGuindou.ProjetManager.DAO.entity.Project;
import com.zGuindou.ProjetManager.DAO.entity.Type;
import com.zGuindou.ProjetManager.service.ProjectService;
import com.zGuindou.ProjetManager.service.ProjectServiceImpl;
import com.zGuindou.ProjetManager.service.TypeService;
import com.zGuindou.ProjetManager.service.TypeServiceImpl;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ManagedBean
@RequestScoped
public class ProjectBean {
	
	public Logger log = Logger.getLogger(ProjectBean.class);

	private ProjectService projectService = new ProjectServiceImpl();
	private TypeService typeService = new TypeServiceImpl();


	private String title;
	private String description;
	private String budget;
	private String type;
	private String active;

	private String success;
	private Boolean showForms = false;
	private List<SelectItem> typeList;
	private List<Project> projectList;

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

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

	public Boolean getShowForms() {
		return showForms;
	}

	public void setShowForms(Boolean showForms) {
		this.showForms = showForms;
	}

	static {
		System.out.println("block static");
	}

	{
		System.out.println("block");
	}

	public ProjectBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initBean() {
		//Preparer Type List
		typeList = new ArrayList<>();
		typeList.add(new SelectItem("", ""));
		List<Type> listServices = typeService.findAll();
		for (Type o: listServices) {
			typeList.add(new SelectItem(o.getId(), o.getName()));
		}

		//Preparer project list
		projectList = projectService.findAll();
	}

	public void addProject(ActionEvent e) {
		success = "";
		if("".equalsIgnoreCase(title)) {
			FacesContext.getCurrentInstance().addMessage("title", new FacesMessage("Le titre est vide !"));
		}
		else if(title.length() > 10) {
			FacesContext.getCurrentInstance().addMessage("title", new FacesMessage("Le titre est superieur de 10 caracteres !"));
		}
		else {
			Project p = new Project();
			p.setTitle(title);
			p.setBudget(Double.valueOf(budget));
			p.setDescription(description);
			p.setActive(active);
			p.setTypeId(Long.valueOf(type));
			projectService.add(p);

			success = "Bien ajouter";

			title = "";
			description = "";
			budget = "";
			active = "";
			type = "";
		}
	}

	public void generateDescription(ActionEvent e) {
		String desc = "";
		desc += "\nle titre est : " + title;
		desc += "\net le budget : " + budget;
		desc += "\net le active : " + ("Y".equalsIgnoreCase(active)? "Oui" : "Non");
		description = desc;
	}

	public void showFormsAction(ActionEvent e) {
		showForms = true;
	}

	public void cancelAction(ActionEvent e) {
		showForms = false;
	}

	public void deleteProject(ActionEvent e) {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> param = fc.getExternalContext().getRequestParameterMap();
		projectService.delete(new Long(param.get("id")));
		projectList = projectService.findAll();
	}

}
