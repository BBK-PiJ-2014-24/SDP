package stage09;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld9 {

	public static void main(String[] args) {
		
		BeanFactory factory = getMyBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();
	}
	
	public static BeanFactory getMyBeanFactory(){
		
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans2.xml");
		
	}
	
	
	

}
