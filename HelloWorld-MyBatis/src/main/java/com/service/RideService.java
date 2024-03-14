package com.service;

import com.model.dao.PersonDAO;
import com.model.dao.RideDAO;
import com.model.dto.RideDTO;
import org.apache.ibatis.session.SqlSession;

import static com.common.Template.getSqlSession;

public class RideService {
    private RideDAO rideDAO;

    public boolean modifyRideInfo(RideDTO ridewaiting) {
        SqlSession sqlSession = getSqlSession();
        rideDAO = sqlSession.getMapper(RideDAO.class);
        int result = rideDAO.rideUpdate(ridewaiting);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}
