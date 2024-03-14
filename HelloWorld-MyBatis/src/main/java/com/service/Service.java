package com.service;

import com.common.Template;
import com.model.dao.PersonDAO;
import com.model.dto.PersonDTO;
import org.apache.ibatis.session.SqlSession;

public class Service {
    private PersonDAO personDAO;
    public boolean insertPerson(PersonDTO person) {

        SqlSession sqlSession = Template.getSqlSession();
        personDAO = sqlSession.getMapper(PersonDAO.class);

        int result = personDAO.insertPerson(person);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}
