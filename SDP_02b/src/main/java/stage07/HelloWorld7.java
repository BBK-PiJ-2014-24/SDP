package stage07;
/**
 * Spring + Dependency Injection (USING Properties File)
 * 
 * It does not have to obtain MessageProvider bean and set the MessageProvider 
 * property of the MessageRenderer bean itself. This wiring is performed through 
 * the Spring Framework’s Dependency Injection mechanism
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;



public class HelloWorld7 {

	public static void main(String[] args) throws Exception {
		BeanFactory factory = getMyBeanFactory();
		
		//MessageProvider mp = IS DONE AUTOMATICALLY IN THE FACTORY
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer"); // mp is referred to by "renderer"
		
		//mr.setMessageProvider -  IS ALREADY IN INJECTED INTO THE RENDERER
		mr.render();

	}

	// Default bean Factory	
	public static BeanFactory getMyBeanFactory() throws Exception{
			
			// Config the Dependency File
			Properties props = new Properties();
			File beanFile = new File("src/main/resources/bean2.properties");
			System.out.println("Does the File Exist: " + beanFile.exists());
			props.load(new FileInputStream(beanFile)); // load the props file
			
			// Make a Default Factory
			DefaultListableBeanFactory factory = new DefaultListableBeanFactory();  
			
			// Make a Definition Reader that connects to the factory (Wiring)
			PropertiesBeanDefinitionReader defReader = new PropertiesBeanDefinitionReader(factory);
			
			// Now Connect the Definition Reader to the Dependency File (Wiring)
			defReader.registerBeanDefinitions(props);
			
			// return the factory
			return factory;  
				
		}


}
