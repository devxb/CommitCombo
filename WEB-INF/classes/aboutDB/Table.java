/* 스트레티지 패턴 */
package aboutDB;

import java.sql.*;

public interface Table{
    
    // 기본 쿼리문
    ResultSet selectTable();
    ResultSet selectTable(String id);
    boolean insertTable(String id);
}