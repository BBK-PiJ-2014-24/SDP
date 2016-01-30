package stage08;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld8 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("src/main/resources/beans.xml");
		System.out.println("Does this File Exist: " + file.exists());
		
		BeanFactory factory = getMyBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();

	}
	
	private static BeanFactory getMyBeanFactory() throws Exception{
		
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
		return factory;
		
	}
	

}
