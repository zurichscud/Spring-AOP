import com.demo1.config.SpringConfig;
import com.demo1.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zurichscud
 * @Date: 2023/9/23 17:41
 * @Description: TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.method2();
    }

    @Test
    public void test2() {
        String s = userService.method6("张三");
        System.out.println(s);
    }
}
