package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean bean = null;
		// bean = new MessageBeanKorea();
		// display(bean, "스프링");
		bean = new MessageBeanEnglish();
		display(bean, "Spring");
	} // end main()

	public static void display(MessageBean bean, String subject) {
		// bean.sayHello("스프링");
		// bean.sayHello("Spring");
		bean.sayHello(subject);
	}
} // end class
