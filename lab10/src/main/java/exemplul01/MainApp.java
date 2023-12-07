package exemplul01;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MainApp{
    public static void main(String []args){
        BeanFactory factory=new ClassPathXmlApplicationContext("beans01.xml");
        Dreptunghi d=(Dreptunghi)factory.getBean("dreptunghi");
        d.aria();
    }
}
