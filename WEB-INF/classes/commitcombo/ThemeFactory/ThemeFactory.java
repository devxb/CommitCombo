package commitcombo;

import java.util.*;

public class ThemeFactory{
    
    public Theme getTheme(String target){
        Themes themes = Themes.getThemes();
        ArrayList<Theme> themeList = themes.makeTheme();
        for(int i = 0; i < themeList.size(); i++){
            Theme nowTheme = themeList.get(i);
            if(target.contains(nowTheme.themeName)) return nowTheme;
        }
        return themeList.get(0);
    }
    
}