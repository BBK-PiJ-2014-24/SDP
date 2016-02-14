package stage08;
/**
 * DI into Constructor with XML 
 */
import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld8 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/snewnham/git/exercises/SDP_02b/src/main/java/stage08/beans.xml");
		System.out.println("Does this File Exist: " + file.exists());
		
		BeanFactory factory = getMyBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();

	}
	
	private static BeanFactory getMyBeanFactory() throws Exception{
		//path = packageName.file.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("stage08/beans.xml"); 
		return factory;
		
	}
	

}
