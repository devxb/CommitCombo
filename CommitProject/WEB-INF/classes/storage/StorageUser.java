package storage;

import aboutuser.*;

public class StorageUser extends Storage{
    
    public StorageUser(){};
    
    public StorageUser(String userName, int commitCnt, String commitDate){
        this.setUser(userName, commitCnt, commitDate);
    }
    
    public void setUser(String userName, int commitCnt, String commitDate){
        this.userName = userName;
        this.commitCnt = commitCnt;
        this.commitDate = commitDate;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public int getUserCommitCnt(){
        if(!commitDate.equals(GetDate.getNowDate())){ // 마지막 커밋시간이 같지않다면,
            UserContribution userContribution = new UserContribution();
            commitCnt = userContribution.getContributions((Storage)this); // commitCnt값을 초기화해줌
            commitDatePeriod = userContribution.getContributionDate();
            commitDate = GetDate.getNowDate();
        }
        return commitCnt;
    }
}