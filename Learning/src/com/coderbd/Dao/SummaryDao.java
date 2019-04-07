
package com.coderbd.Dao;

import com.coderbd.pojo.Summary;
import java.util.List;


public interface SummaryDao {
     void createTable();

    void save(Summary s);

    void update(Summary s);

    Summary getSummaryByProductCode(String code);

    List<Summary> getList();
}
