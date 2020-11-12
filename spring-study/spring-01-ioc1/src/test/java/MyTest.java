import com.chen.dao.UserDaoImpl;
import com.chen.dao.UserDaoMySQLImpl;
import com.chen.service.UserService;
import com.chen.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/13 21:36
 */
public class MyTest {
    public static void main(String[] args) {

        // 第一种方式
        /*//用户实际调用的是service层
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySQLImpl());

        userService.getUser();*/

        // 第二种方式
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();

    }
}
