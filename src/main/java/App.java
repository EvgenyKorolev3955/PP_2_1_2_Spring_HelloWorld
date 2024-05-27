import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld world = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat barsik = applicationContext.getBean("cat", Cat.class);
        Cat vaska = applicationContext.getBean("cat", Cat.class);

        System.out.println(hello == world);
        System.out.println(barsik == vaska);


    }
}