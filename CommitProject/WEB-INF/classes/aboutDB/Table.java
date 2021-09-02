/* 스트레티지 패턴 */
package aboutDB;

import java.sql.*;

public interface Table{
    
    // 기본 쿼리문
    ResultSet selectTable();
    ResultSet selectTable(String id);
    boolean updateTable(String target, String item, String id);
    boolean updateTable(String target, int item, String id);
    boolean insertTable(String id);
    boolean deleteTable(String id);
    
}