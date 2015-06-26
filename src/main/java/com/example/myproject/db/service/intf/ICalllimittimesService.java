package com.example.myproject.db.service.intf;

import com.example.myproject.db.model.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * ICalllimittimesService is the Service interface for com.shangpin.openapi.model.Calllimittimes
 */
public interface ICalllimittimesService {

    /**
     * Returns the total count of objects
     */
    int GetCount(Map param) throws SQLException;

    /**
     * Finds a Calllimittimes instance by the primary key value
     */
    Calllimittimes Find(Integer iD) throws SQLException;

    /**
     * Finds list Calllimittimes instances by the map
     */
    List<Calllimittimes> FindListByMap(Map param) throws SQLException;

    /**
     * Finds list page Calllimittimes instances by the map and start and end
     */
    List<Calllimittimes> FindListPage(Map param, int start, int end) throws SQLException;

    /**
     * Finds all Calllimittimes instances.
     */
    List<Calllimittimes> FindAll() throws SQLException;

    /**
     * Inserts a new Calllimittimes instance into underlying database table.
     */
    Integer Insert(Calllimittimes obj) throws SQLException;

    /**
     * Inserts list Calllimittimes instances into underlying database table.
     */
    void InsertList(List<Calllimittimes> list) throws SQLException;

    /**
     * Update the underlying database record of a Calllimittimes instance.
     */
    int Update(Calllimittimes obj) throws SQLException;

    /**
     * Update the underlying database record of a Calllimittimes instance by map.
     */
    int UpdateByMap(Map param) throws SQLException;

    /**
     * Update the underlying database record of a Calllimittimes instance by model.
     */
    int UpdateDynamic(Calllimittimes model) throws SQLException;

    /**
     * Delete the underlying database record of a Calllimittimes instance.
     */
    int Delete(Calllimittimes obj) throws SQLException;

    /**
     * @param SupplierID
     * @param ResturlID
     * @return
     * @throws java.sql.SQLException
     */
    Calllimittimes FindBySupplierIDAndResturlID(String SupplierID, Integer ResturlID) throws SQLException;

}
