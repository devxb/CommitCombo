package commitcombo;

import java.util.ArrayList;

public class Themes{
    
    private static Themes themes= new Themes();
    private static ArrayList<Theme> ThemeList= new ArrayList<Theme>();
    
    private Themes(){}
    
    public static void addTheme(Theme theme){
        ThemeList.add(theme);
    }
    
    public static Themes getThemes(){
        if(ThemeList.isEmpty()){
            ThemeList.add(new MintChocolate());
            ThemeList.add(new Perfume());
            ThemeList.add(new Peach());
            ThemeList.add(new Orange());
            ThemeList.add(new Mocha());
            ThemeList.add(new Indigo());
            ThemeList.add(new Grass());
            ThemeList.add(new Grape());
            ThemeList.add(new CottonCandy());
            ThemeList.add(new BasicWhite());
            ThemeList.add(new BasicGray());
            ThemeList.add(new BasicDark());
            ThemeList.add(new Abocado());
            ThemeList.add(new Sunset());
            ThemeList.add(new DeepOcean());
            ThemeList.add(new Ocean());
            ThemeList.add(new Lake());
            ThemeList.add(new Emerald());
            ThemeList.add(new Depths());
            ThemeList.add(new Cloud());
        }
        return themes;
    }
    
    public Theme getTheme(String theme){
        if(theme == null) return new BasicWhite();
        for(int i = 0; i < ThemeList.size(); i++){
            if(theme.contains(ThemeList.get(i).themeName)) return ThemeList.get(i);
        }
        return new BasicWhite();
    }
    
}