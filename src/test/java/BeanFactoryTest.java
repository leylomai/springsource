import chapter2.MyAnnotationTestBean;
import chapter2.MyTestBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        /*BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("chapter2.config");
        MyAnnotationTestBean bean = (MyAnnotationTestBean) applicationContext.getBean("myAnnotationTestBean");

        Assertions.assertEquals("testStr", bean.getTestStr());
    }
}
