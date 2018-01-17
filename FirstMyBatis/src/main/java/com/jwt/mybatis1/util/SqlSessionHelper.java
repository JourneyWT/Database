package com.jwt.mybatis1.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ����ͨ���ļ�
 *
 * @author juwenting
 * @date 2018/1/17 ����1:55
 */
public class SqlSessionHelper {

    public static SqlSessionFactory getSessionFactory(){
        SqlSessionFactory sessionFactory = null;
        String resource= "configuration.xml";
        try{
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sessionFactory;
    }
}
