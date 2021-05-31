package commitcombo;

public class ThemeFactory{
    
    public Theme getTheme(String target){
        Themes themes = Themes.getThemes();
        for(int i = 0; i < themes.getThemeListSize(); i++){
            Theme nowTheme = themes.getTheme(i);
            if(target.contains(nowTheme.themeName)) return nowTheme;
        }
        return themes.getTheme(0);
    }
    
}