import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Являются ли bean одним объектом? " + (bean == bean2));

        Cat cstBean1 = (Cat) applicationContext.getBean("cat");
        Cat cstBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Являются ли catBean одним объектом? " + (cstBean1 == cstBean2));

    }
}