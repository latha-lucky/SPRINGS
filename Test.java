package assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("assignment/springxml.xml");
		Company e1=(Company) c1.getBean("company");
		System.out.println(e1);
	}

}
