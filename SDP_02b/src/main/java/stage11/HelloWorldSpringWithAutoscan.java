package stage11;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * DI with AUTOSCAN. Still have to AUTOWIRE, but then don't need to even specify any beans in xml!!
 * @author snewnham
 *
 */
public class HelloWorldSpringWithAutoscan {

    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from anno.xml - huh? autoscan.xml yeah?
        BeanFactory factory = new ClassPathXmlApplicationContext("week02/q10_autoscan/autoscan.xml");
        return factory;
    }
}
