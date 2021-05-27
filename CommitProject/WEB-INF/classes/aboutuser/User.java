package aboutuser;

public class User{ // User정보 총괄 클래스
    
    private String username;
    private String defaultFontSize = "15px";
    
    public User(String username){
        this.username = username;
        defaultSet();
    }
    
    public void defaultSet(){
        getFontSize(this.username);
    }
    
    public String getFontSize(String username){
        if(username.length() >= 10) return "0.6800em";
        if(username.length() > 7) return "0.8125em";
        return "0.9375em"; // default : 15px
    }
    
}