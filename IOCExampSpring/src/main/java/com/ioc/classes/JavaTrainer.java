package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Trainer;
import com.ioc.praticetime.JavaPraticeTime;

@Component
public class JavaTrainer implements Trainer {

	private String name ;
	private String  message; 
	private JavaPraticeTime jpt;
	
	
   @Autowired
	public JavaTrainer( @Value("Kshithij") String name, @Value("pratice coding everyday")  String message,
			@Qualifier("javaPraticeTime") JavaPraticeTime jpt) {
		super();
		this.name = name;
		this.message = message;
		this.jpt = jpt;
	}



	public JavaPraticeTime getJpt() {
		return jpt;
	}


//	  @Autowired
//	public void setJpt(@Qualifier("javaPraticeTime") JavaPraticeTime jpt) {
//		this.jpt = jpt;
//	}



	public String getName() {
		return name;
	}


//	  @Autowired
//	public void setName( @Value("Kshithij")String name) {
//		this.name = name;
//	}



	public String getMessage() {
		return message;
	}


//  @Autowired
//	public void setMessage(@Value("pratice coding everyday")String message) {
//		this.message = message;
//	}



	@Override
	public String giveTask() {
		//JavaPraticeTime jpt = new JavaPraticeTime();
		
		//JavaPraticeTime jpt = (JavaPraticeTime)cpx.getBean("jpt");
		return name+" says "+message+" for "+ jpt.getTime();
	}

}
