import com.jwt.mybatis1.bo.User;
import com.jwt.mybatis1.dao.UserMapper;
import com.jwt.mybatis1.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

/**
 * ʵ����
 *
 * @author juwenting
 * @date 2018/1/17 ����1:58
 */
public class MyBatis1Test {

    public static void main(String[] args) {

        SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // ����
            int userAdd = userMapper.insertUser(add());
            System.out.println("����" + userAdd + "������");
            sqlSession.commit();

            // ɾ��
            int userDelete = userMapper.deleteByName("JWT");
            System.out.println("nameΪ1��" + userDelete + "����¼�ѱ�ɾ��");
            sqlSession.commit();

            // ����
            User userQuery = userMapper.selectUserById("8");
            System.out.println("��ѯ��user����Ϊ��" + (userQuery==null ? "null" : userQuery.getAge()));

            // �޸�
            int userUpdate = userMapper.updateByAge(update(), 21);
            System.out.println("�޸���ageΪ21�ģ�" + userUpdate + "����¼");
            sqlSession.commit();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            sqlSession.close();
        }

    }

    private static User add() {
        User user = new User();
        user.setId(1);  // ���������Ϊ���������Բ���ֵ
        user.setIdNo("123");
        user.setName("JWT");
        user.setAge(21);
        user.setClassName("abc");
        user.setDescription("��������");
        return user;
    }

    private static User update() {
        User user = new User();
        user.setIdNo("321");
        user.setName("XYZ");
        user.setAge(21);
        user.setClassName("abc");
        user.setDescription("�޸Ĳ���");
        return user;
    }
}
