
/* Double lock single ton */

package aboutDB;

import java.sql.*;

public class Stmt{
    
    private static Stmt instance = null;
    private static Connection con = null;
    
    private Stmt(){}
    
    public static Stmt getInstance(){
        if(instance == null){
            synchronized(Stmt.class){
                if(instance == null){
                    instance = new Stmt();
                    try{
                        String url = "jdbc:mysql://localhost:3306/commitcombo";
                        con = DriverManager.getConnection(url, "commitcomboDB", "Devxb@123");
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }
    
    public synchronized void recoverConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/commitcombo";
            con = DriverManager.getConnection(url, "commitcomboDB", "Devxb@123");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public synchronized Statement getStatement(){ 
        // 
        // statement를 매번 statement를 생성하는방식으로 변경함으로써 
        // multi-thread에서의 병목현상 방지 (이전에는 commitcount를 제대로 못 읽어오는 경우가있었음)
        //
        try{
            if(con == null) this.recoverConnection();
            return con.createStatement();
        } catch (SQLException SQLE){
            SQLE.printStackTrace();
            return null;
        }
    }
    
}