package exemplul04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String []args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean04.xml");
       Vehicul v = (Vehicul) context.getBean("veh");
        System.out.println(v);
        Vehicul a =(Vehicul) context.getBean("auto");
        System.out.println(a);
        Vehicul m =(Vehicul) context.getBean("Motocicleta");
        System.out.println(m);
        Vehicul t =(Vehicul) context.getBean("Tir");
        System.out.println(t);
    }
}
