package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Trainer;
import com.ioc.praticetime.SQLPraticeTime;
@Component
public class SqlTrainer implements Trainer {


	private String name ;
	private String  message;
	private SQLPraticeTime spt;
	
	
    @Autowired
	public SqlTrainer(@Value("Blesina") String name,
			@Value("practice complex query")   String message, 
			@Qualifier("SQLPraticeTime") SQLPraticeTime spt) {
		super();
		this.name = name;
		this.message = message;
		this.spt = spt;
	}



	public SQLPraticeTime getSpt() {
		return spt;
	}


//	  @Autowired
//	public void setSpt(	@Qualifier("SQLPraticeTime") SQLPraticeTime spt) {
//		this.spt = spt;
//	}



	public String getName() {
		return name;
	}
	  

//	  @Autowired
//	public void setName(@Value("Blesina")String name) {
//		this.name = name;
//	}



	public String getMessage() {
		return message;
	}


//  @Autowired
//	public void setMessage(	@value("practice complex query") String message) {
//		this.message = message;
//	}



	@Override
	public String giveTask( ) {
		// SQLPraticeTime spt = new SQLPraticeTime();
		
		//SQLPraticeTime spt =(SQLPraticeTime)cpx.getBean("spt");
		return name+" says "+message+" for "+spt.getTime();
	}

}
