/**
 * @author lee
 * @date 2020/5/30 - 5:57 下午
 */
public class UserServiceOracleimpl implements UserService{
    static UserDao userDao = new UserDaoOracleimpl();

    public void getUser() {
        userDao.getUser();
    }
}
