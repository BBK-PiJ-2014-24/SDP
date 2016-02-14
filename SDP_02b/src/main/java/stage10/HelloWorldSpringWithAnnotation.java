package stage10;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring WITH ANNOTATIONS
 * @author snewnham
 *
 */
public class HelloWorldSpringWithAnnotation {

	public static void main(String[] args) throws Exception {

		// get the bean factory
		BeanFactory factory = getBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer"); // factory makes Renderer
		mr.render();
	}

	private static BeanFactory getBeanFactory() throws Exception {
		// create a bean factory from anno.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("stage10/anno.xml");
		return factory;
	}
}