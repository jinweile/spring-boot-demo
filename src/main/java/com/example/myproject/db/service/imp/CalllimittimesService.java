package com.example.myproject.db.service.imp;

import com.example.myproject.db.dao.intf.ICalllimittimesDao;
import com.example.myproject.db.model.Calllimittimes;
import com.example.myproject.db.service.intf.ICalllimittimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CalllimittimesService is the implementation of ICalllimittimesService
 */
@Service
public class CalllimittimesService implements ICalllimittimesService {

    @Autowired
    private ICalllimittimesDao dao;

    /**
     * dao interface
     *
     * @param dao
     */
//    public void setCalllimittimesDao(ICalllimittimesDao dao) {
//        this.dao = dao;
//    }

    /**
     * Implements ICalllimittimesService.GetCount
     */
    public int GetCount(Map param) throws SQLException {
        int result = dao.GetCount(param);
        return result;
    }

    /**
     * Implements ICalllimittimesService.Find
     */
    public Calllimittimes Find(Integer iD) throws SQLException {
        Calllimittimes result = dao.Find(iD);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.FindListByMap
     */
    public List<Calllimittimes> FindListByMap(Map param) throws SQLException {
        List<Calllimittimes> result = dao.FindListByMap(param);
        return result;
    }

    /**
     * Implements ICalllimittimesDao.FindListPage
     */
    public List<Calllimittimes> FindListPage(Map param, int start, int end) throws SQLException {
        List<Calllimittimes> result = dao.FindListPage(param, start, end);
        return result;
    }

    /**
     * Implements ICalllimittimesService.FindAll
     */
    public List<Calllimittimes> FindAll() throws SQLException {
        List<Calllimittimes> result = dao.FindAll();
        return result;
    }

    /**
     * Implements ICalllimittimesService.Insert
     */
    public Integer Insert(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        return dao.Insert(obj);
    }

    /**
     * Implements ICalllimittimesDao.InsertList
     */
    public void InsertList(List<Calllimittimes> list) throws SQLException {
        dao.InsertList(list);
    }

    /**
     * Implements ICalllimittimesService.Update
     */
    public int Update(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        return dao.Update(obj);
    }

    /**
     * Implements ICalllimittimesDao.UpdateByMap
     */
    public int UpdateByMap(Map param) throws SQLException {
        return dao.UpdateByMap(param);
    }

    /**
     * Implements ICalllimittimesDao.UpdateDynamic
     */
    public int UpdateDynamic(Calllimittimes model) throws SQLException {
        if (model == null) throw new NullPointerException("model");
        return dao.UpdateDynamic(model);
    }

    /**
     * Implements ICalllimittimesService.Delete
     */
    public int Delete(Calllimittimes obj) throws SQLException {
        if (obj == null) throw new NullPointerException("obj");
        return dao.Delete(obj);
    }

    /**
     * @return
     * @throws java.sql.SQLException
     */
    public Calllimittimes FindBySupplierIDAndResturlID(String SupplierID, Integer ResturlID) throws SQLException {
        Map params = new HashMap();
        params.put("supplierID", SupplierID);
        params.put("restUrlID", ResturlID);
        List<Calllimittimes> list = FindListByMap(params);
        if (list.size() == 0) return null;
        return list.get(0);
    }

}
