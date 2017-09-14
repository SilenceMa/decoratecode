package decorate_day01;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.decorate.ssm.mapper.UserLoginMapper;
import com.decorate.ssm.po.User;

public class LoginTest {
	
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception{
		String resource = "mybatis/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testLogin() throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		UserLoginMapper mapper = session.getMapper(UserLoginMapper.class);
		
		User user = new User();
		user.setPhone("17762212834");
		user.setPassword("123456789");
		int count = mapper.findloginUser(user);
		System.out.println(count);
	}
}
