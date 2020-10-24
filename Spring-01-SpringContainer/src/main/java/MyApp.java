
import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        // Commented lines and ones below are basically doing same things.
    //    BeanFactory container = new ClassPathXmlApplicationContext("config2.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config2.xml");
    //    Mentor mentor = (Mentor) container.getBean("FullTimeMentor");

        Mentor mentor = container.getBean("fullTimeMentor",Mentor.class);
        mentor.createAccount();

        BeanFactory container2 = new ClassPathXmlApplicationContext("config2.xml");

        Mentor mentor1 = (Mentor) container2.getBean("partTimeMentor");

        mentor1.createAccount();
    }
}
