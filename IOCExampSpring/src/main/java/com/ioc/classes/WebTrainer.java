package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Trainer;
import com.ioc.praticetime.SQLPraticeTime;
import com.ioc.praticetime.WebPraticeTime;
@Component
public class WebTrainer implements Trainer {

	private String name ;
	private String  message; 
	private WebPraticeTime wpt;
	
	
	  @Autowired
	public WebTrainer( @Value("Harshith") String name,
			@Value("Create sample websites")  String message,
			@Qualifier("webPraticeTime")  WebPraticeTime wpt) {
		super();
		this.name = name;
		this.message = message;
		this.wpt = wpt;
	}


	public WebPraticeTime getWpt() {
		return wpt;
	}

//	  @Autowired
//	public void setWpt(@Qualifier("webPraticeTime")WebPraticeTime wpt) {
//		this.wpt = wpt;
//	}


	public String getName() {
		return name;
	}

//  @Autowired
//	public void setName(@Value("Harshith") String name) {
//		this.name = name;
//	}


	public String getMessage() {
		return message;
	}

//  @Autowired
//	public void setMessage(@Value("Create sample websites")String message) {
//		this.message = message;
//	}


	@Override
	public String giveTask() {
		//WebPraticeTime wpt = new WebPraticeTime();
		//WebPraticeTime wpt= (WebPraticeTime)cpx.getBean("wpt");
		return name+" says "+message+" for "+wpt.getTime();
	}
}
