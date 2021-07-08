/* 각 테이블에 맞는 쿼리문 구현 */

package aboutDB;

import java.sql.*;
import aboutuser.*;

public class Users implements Table{
    
    private Statement stmt = null;
    private String tableName = "users";
    
    public Users(){
        Stmt stmt = Stmt.getInstance();
        this.stmt = stmt.getStatement();
    }
    
    @Override
    public boolean insertTable(String id){
        try{
            UserContribution userContribution = new UserContribution();
            int contributionCount = userContribution.getContributions(id);
            String contributionStartDate = "'2021-01-01'";
            String contributionEndDate = "'" + GetDate.getNowDate() + "'";
            id = "'" + id + "'";
            String query = "INSERT INTO " + tableName + " VALUES (" + id + ", " + contributionCount + ", " + contributionStartDate + ", "  + contributionEndDate+ ") ";
            query += "ON DUPLICATE KEY UPDATE " + "contributionCount = " + contributionCount + ", contributionStartDate = " + contributionStartDate + ", contributionEndDate = " + contributionEndDate; 
            stmt.executeUpdate(query);
        } catch (SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    @Override
    public ResultSet selectTable() throws NullPointerException{
        ResultSet ans = null;
        try{
            String query = "SELECT * FROM " + tableName;
            ans = stmt.executeQuery(query);
        } catch (SQLException e){
            System.out.println(e);
        }
        return ans;
    }
    
    @Override
    public ResultSet selectTable(String id) throws NullPointerException{
        ResultSet ans = null;
        try{
            id = "'" + id + "'";
            String query = "SELECT * FROM " + tableName + " WHERE username = " + id;
            ans = stmt.executeQuery(query);
        } catch (SQLException e){
            System.out.println(e);
        }
        return ans;
    }
    
} 