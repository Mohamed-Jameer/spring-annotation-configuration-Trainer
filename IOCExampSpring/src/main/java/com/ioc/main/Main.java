package com.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.classes.JavaTrainer;
import com.ioc.classes.SqlTrainer;
import com.ioc.classes.WebTrainer;
import com.ioc.interfaces.Trainer;
import com.tap.configu.Tap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		
	   AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(Tap.class);

		Trainer jt = (JavaTrainer) apx.getBean("javaTrainer");
		Trainer st =  (SqlTrainer)apx.getBean("sqlTrainer");
		Trainer wt =  (WebTrainer)apx.getBean("webTrainer");

		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());
	}

}
