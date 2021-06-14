package storage;

public abstract class Storage{
    
    protected String userName;
    protected int commitCnt;
    protected String commitDate;
    protected String commitDatePeriod;
    
    public abstract void setUser(String userName, int commitCnt, String commitDate);
    public abstract String getUserName();
    public abstract int getUserCommitCnt();
    
    public String getUserName(){
        return this.userName;
    }
    
}