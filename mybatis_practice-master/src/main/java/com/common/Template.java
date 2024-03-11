package com.common;

import com.management.product.model.dao.ProductDAO;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    // * 주석을 지우고 sqlSession을 생성하는 공통 template 파일을 작성하세요.

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/productcompany";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {
            Environment environment =
                    new Environment("dev"
                    , new JdbcTransactionFactory()
                    , new PooledDataSource(DRIVER,URL,USER,PASSWORD));

            Configuration configuration = new Configuration(environment);
            configuration.addMapper(ProductDAO.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        }
        return sqlSessionFactory.openSession(false);
//        if(sqlSessionFactory == null) {
//            String resource = "config/mybatis-config.xml";
//            try {
//                InputStream inputStream = Resources.getResourceAsStream(resource);
//                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return sqlSessionFactory.openSession(false);
    }
}
