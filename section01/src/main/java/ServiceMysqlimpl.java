import org.springframework.stereotype.Service;

/**
 * @author lee
 * @date 2020/5/30 - 5:21 下午
 */
public class ServiceMysqlimpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void getUser() {

           userDao.getUser();

    }
}
