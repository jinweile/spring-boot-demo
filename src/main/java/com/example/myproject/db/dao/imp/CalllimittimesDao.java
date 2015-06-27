package com.example.myproject.db.dao.imp;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.example.myproject.db.dao.intf.ICalllimittimesDao;
import com.example.myproject.db.model.Calllimittimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CalllimittimesDao is the implementation of ICalllimittimesDao
 */
@Repository
@Transactional
public class CalllimittimesDao implements ICalllimittimesDao {

    @Autowired
    private SqlMapClient mapper;

    /**
     * data map
     *
     * @param mapper
     */
//    public void setMapper(SqlMapClient mapper) {
//        this.mapper = mapper;
//    }

    /**
     * Implements ICalllimittimesDao.GetCount
     */
    public int GetCount(Map param) throws SQLException {
        String stmtId = "Calllimittimes-GetCount";
        int result = (Integer) mapper.queryForObject(stmtId, param);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.Find
     */
    public Calllimittimes Find(Integer iD) throws SQLException {
        String stmtId = "Calllimittimes-Find";
        Calllimittimes result = (Calllimittimes) mapper.queryForObject(stmtId, iD);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.FindListByMap
     */
    public List<Calllimittimes> FindListByMap(Map param) throws SQLException {
        String stmtId = "Calllimittimes-Select";
        List<Calllimittimes> result = mapper.queryForList(stmtId, param);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.FindListPage
     */
    public List<Calllimittimes> FindListPage(Map param, int start, int end) throws SQLException {
        String stmtId = "Calllimittimes-SelectPager";
        if (param == null) {
            param = new HashMap();
        }
        if (start > 0) {
            param.put("Start", start);
        }
        if (end > 0) {
            param.put("End", end);
        }
        List<Calllimittimes> result = mapper.queryForList(stmtId, param);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.FindAll
     */
    @SuppressWarnings("unchecked")
    public List<Calllimittimes> FindAll() throws SQLException {
        String stmtId = "Calllimittimes-FindAll";
        List<Calllimittimes> result = mapper.queryForList(stmtId, null);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.Insert
     */
    public Integer Insert(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        String stmtId = "Calllimittimes-Insert";
        return (Integer) mapper.insert(stmtId, obj);
    }

    /**
     * Implements ICalllimittimesDao.InsertList
     */
    public void InsertList(List<Calllimittimes> list) throws SQLException {
        if (list == null || list.size() == 0) throw new NullPointerException("list");
        String stmtId = "Calllimittimes-InsertBatch";
        mapper.insert(stmtId, list);
    }

    /**
     * Implements ICalllimittimesDao.Update
     */
    public int Update(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        String stmtId = "Calllimittimes-Update";
        return mapper.update(stmtId, obj);
    }

    /**
     * Implements ICalllimittimesDao.UpdateByMap
     */
    public int UpdateByMap(Map param) throws SQLException {
        String stmtId = "Calllimittimes-UpdateByMap";
        return mapper.update(stmtId, param);
    }

    /**
     * Implements ICalllimittimesDao.UpdateDynamic
     */
    public int UpdateDynamic(Calllimittimes model) throws SQLException {
        if (model == null) throw new NullPointerException("model");
        String stmtId = "Calllimittimes-UpdateDynamic";
        return mapper.update(stmtId, model);
    }

    /**
     * Implements ICalllimittimesDao.Delete
     */
    public int Delete(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        String stmtId = "Calllimittimes-Delete";
        return mapper.delete(stmtId, obj);
    }


}
