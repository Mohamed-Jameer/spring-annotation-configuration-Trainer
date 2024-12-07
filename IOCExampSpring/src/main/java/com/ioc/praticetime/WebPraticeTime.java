package com.ioc.praticetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebPraticeTime {


	private String time;

	public String getTime() {
		return time;
	}
   
	@Autowired
	public WebPraticeTime(@Value("1 hours")String time) {
		super();
		this.time = time;
	}
	
//	@Autowired
//	public void setTime(@Value("1 hours")String time) {
//		this.time = time;
//	}
//	
	
	
	
}
