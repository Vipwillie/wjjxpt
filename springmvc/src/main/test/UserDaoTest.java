import com.willie.springmvc.dao.user.UserDao;
import com.willie.springmvc.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liang on 2016/11/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@Transactional
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> list = userDao.findAll();
        System.out.println("================" + list + "===============");
     }
}
