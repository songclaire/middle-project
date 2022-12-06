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
			// 1-1. xml �������� �о����
			Charset charset = Charset.forName("UTF-8");
			Resources.setCharset(charset);

			Reader rd = Resources.getResourceAsReader("mybatis-config.xml");

			// 1-2 ������ �о�� Reader��ü�� �̿��Ͽ� SqlSessionFactory ��ü �����ϱ�
			sessionFactory = new SqlSessionFactoryBuilder().build(rd);

			rd.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * SqlSession ��ü�� �����ϴ� ���丮 �޼���
	 * 
	 * @return SqlSession ��ü
	 */
	public static SqlSession getSqlSession() {
		return sessionFactory.openSession();
	}

	/**
	 * SqlSession ��ü�� �����ϴ� ���丮 �޼���
	 * 
	 * @param autoCommit ����Ŀ�� ����
	 * @return SqlSession ��ü
	 */
	public static SqlSession getSqlSession(boolean autoCommit) {
		return sessionFactory.openSession(autoCommit);
	}
}
