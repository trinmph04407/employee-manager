package vn.poly.sof305.group1.statics.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

import vn.poly.sof305.group1.statics.service.StaticService;
@ResultPath("/views/statics/")
@InterceptorRef(value = "loginStack")
public class HomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Object[]> listStatic;
	private StaticService staticService;
	@Action(value = "homepage", results = { @Result(name = SUCCESS, location = "homepage.jsp") })
	public String listStatic() {
		listStatic =  staticService.listStatics();
		return SUCCESS;

	}
	
	public List<Object[]> getListStatic() {
		return listStatic;
	}


	public void setListStatic(List<Object[]> listStatic) {
		this.listStatic = listStatic;
	}


	public StaticService getStaticService() {
		return staticService;
	}


	public void setStaticService(StaticService staticService) {
		this.staticService = staticService;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
