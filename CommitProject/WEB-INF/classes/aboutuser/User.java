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
    
    public double getFontSize(String username){
        //if(username.length() >= 10) return 0.6800;
        if(username.length() > 7) return 0.8125;
        return 0.9375; // default : 16px
    }
    
    private double transEmToPx(double em){
        return (16*em)-3;
    }
    
    public double getDragLength(String username){
        int[] Alph = {11, 9, 10, 10, 9, 8, 11, 10, 3, 8, 10, 8, 11, 10, 11, 10, 11, 9, 9, 10, 10, 9, 14, 9, 10, 9};
        int[] alph = {8, 9, 8, 9, 8, 7, 9, 9, 3, 3, 9, 4, 13, 9, 9, 9, 9, 7, 8, 6, 9, 10, 13, 8, 9, 7};
        int[] numb = {8, 7, 9, 8, 9, 9, 9, 8, 8, 9};
        double ans = 0;
        double em = getFontSize(username);
        for(int i = 0; i < username.length(); i++){
            if((int)username.charAt(i) >= (int)'a' && (int)username.charAt(i) <= (int)'z') ans += alph[(int)username.charAt(i)-(int)'a']*em;
            else if((int)username.charAt(i) >= (int)'0' && (int)username.charAt(i) <= (int)'9') ans += numb[(int)username.charAt(i)-(int)'0']*em;
            else if((int)username.charAt(i) >= (int)'A' && (int)username.charAt(i) <= 'Z') ans += Alph[(int)username.charAt(i)-(int)'A']*em;
            else ans += 10*em;
            ans += 1; // jump 1px;
        }
        ans = ans-79;
        if(ans <= 0) return 0;
        return -1*ans;
    }
    
}