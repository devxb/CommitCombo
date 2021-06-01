package storage;

public abstract class Storage{
    
    protected String userName;
    protected int commitCnt;
    protected String commitDate;
    
    public abstract void setUser(String userName, int commitCnt, String commitDate);
    public abstract String getUserName();
    public abstract int getUserCommitCnt();
    
}