package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

public class Demo {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Student stu = context.getBean("d",Student.class);
		System.out.println(stu.getName());
	}

}
