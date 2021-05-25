package commitcombo;

public class ThemeFactory{
    
    
    public ThemeFactory(){
        
    }
    
    public static Theme getTheme(String target){
        Themes themes = Themes.getThemes();
        return themes.getTheme(target);
    }
}