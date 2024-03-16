import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.FirstBean;
import model.SecondBean;
public class Main {
    public static void main(String[] args) {
        // Создание контекста Spring на основе XML-конфигурации
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        SecondBean secondBean = (SecondBean) context.getBean("secondBean");
        System.out.println(firstBean);
        System.out.println(secondBean);
    }
}
