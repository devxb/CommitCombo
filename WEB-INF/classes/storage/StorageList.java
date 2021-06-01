package storage;

import java.util.*;

public class StorageList{
    
    private ArrayList<Storage> userList;
    private static StorageList storageList = new StorageList();
    
    public static StorageList getInstaceOfStorageList(){
        return storageList;
    }
    
    public ArrayList<Storage> getUserList(){
        if(userList == null) userList = new ArrayList<Storage>();
        return this.userList;
    }
    
    public void addStorage(Storage user){
        this.userList.add(user);
    }
    
}