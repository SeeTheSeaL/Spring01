import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lee
 * @date 2020/6/5 - 8:39 下午
 */
public class test02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        ServiceImpl serviceImpl = (ServiceImpl) applicationContext.getBean("userDaoService");
        serviceImpl.getUser();
    }
}
