package utils;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class BatisUtil {
	private static SqlSessionFactory sessionFactory;

	static {
		try {
			// 1-1. xml 설정파일 읽어오기
			Charset charset = Charset.forName("UTF-8");
			Resources.setCharset(charset);

			Reader rd = Resources.getResourceAsReader("mybatis-config.xml");

			// 1-2 위에서 읽어온 Reader객체를 이용하여 SqlSessionFactory 객체 생성하기
			sessionFactory = new SqlSessionFactoryBuilder().build(rd);

			rd.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * SqlSession 객체를 제공하는 팩토리 메서드
	 * 
	 * @return SqlSession 객체
	 */
	public static SqlSession getSqlSession() {
		return sessionFactory.openSession();
	}

	/**
	 * SqlSession 객체를 제공하는 팩토리 메서드
	 * 
	 * @param autoCommit 오토커밋 여부
	 * @return SqlSession 객체
	 */
	public static SqlSession getSqlSession(boolean autoCommit) {
		return sessionFactory.openSession(autoCommit);
	}
}
