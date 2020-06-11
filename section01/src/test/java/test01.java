/**
 * @author lee
 * @date 2020/5/30 - 5:10 下午
 */
public class test01 {
    public static void main(String[] args) {

        ServiceImpl userService =  new ServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
