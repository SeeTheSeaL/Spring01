/**
 * @author lee
 * @date 2020/5/30 - 5:46 下午
 */
public class ServiceImpl implements UserService{


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
