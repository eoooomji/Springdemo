package part02_annotation;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
//		String path = "part02_annotation/aop.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Service svc = null;
		svc = (Service) context.getBean("svc");
//		svc.prn1();
//		svc.prn1(10);
//		svc.prn1(new Random());
//		svc.prn1(20, 30);
//
//		svc.prn2();
//
//		svc.prn3();
//		
//		try {
//			svc.prn4();
//		} catch (Exception e) {
//			// System.out.println(e.toString());
//		}
		
		svc.prn5();
	} // end main()

} // end class
