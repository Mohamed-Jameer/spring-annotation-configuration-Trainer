package com.ioc.praticetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaPraticeTime {
	
	private String time;

	public String getTime() {
		return time;
	}

	@Autowired
	public JavaPraticeTime(@Value("2 hours") String time) {
		super();
		this.time = time;
	}
	
	
// 	@Autowired
//	public void setTime(@Value("2 hours")String time) {
//		this.time = time;
//	}
	
	
	

}
