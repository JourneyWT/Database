import com.jwt.mybatis1.bo.User;
import com.jwt.mybatis1.dao.UserMapper;
import com.jwt.mybatis1.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

/**
 * 实现类
 *
 * @author juwenting
 * @date 2018/1/17 下午1:58
 */
public class MyBatis1Test {

    public static void main(String[] args) {

        SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 增加
            int userAdd = userMapper.insertUser(add());
            System.out.println("新增" + userAdd + "条数据");
            sqlSession.commit();

            // 删除
            int userDelete = userMapper.deleteByName("JWT");
            System.out.println("name为1的" + userDelete + "条记录已被删除");
            sqlSession.commit();

            // 查找
            User userQuery = userMapper.selectUserById("8");
            System.out.println("查询的user年龄为：" + (userQuery==null ? "null" : userQuery.getAge()));

            // 修改
            int userUpdate = userMapper.updateByAge(update(), 21);
            System.out.println("修改了age为21的：" + userUpdate + "条记录");
            sqlSession.commit();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            sqlSession.close();
        }

    }

    private static User add() {
        User user = new User();
        user.setId(1);  // 如果主键设为自增，可以不赋值
        user.setIdNo("123");
        user.setName("JWT");
        user.setAge(21);
        user.setClassName("abc");
        user.setDescription("新增测试");
        return user;
    }

    private static User update() {
        User user = new User();
        user.setIdNo("321");
        user.setName("XYZ");
        user.setAge(21);
        user.setClassName("abc");
        user.setDescription("修改测试");
        return user;
    }
}
