package commitcombo;

import java.util.ArrayList;

public class Themes{
    
    private static Themes themes= new Themes();
    private static ArrayList<Theme> themeList;
    
    private Themes(){}
    
    public static Themes getThemes(){
        if(themeList == null){
            themeList= new ArrayList<Theme>();
            themeList.add(new MintChocolate());
            themeList.add(new Perfume());
            themeList.add(new Peach());
            themeList.add(new Orange());
            themeList.add(new Mocha());
            themeList.add(new Indigo());
            themeList.add(new Grass());
            themeList.add(new Grape());
            themeList.add(new CottonCandy());
            themeList.add(new BasicWhite());
            themeList.add(new BasicGray());
            themeList.add(new BasicDark());
            themeList.add(new Abocado());
            themeList.add(new Sunset());
            themeList.add(new DeepOcean());
            themeList.add(new Ocean());
            themeList.add(new Lake());
            themeList.add(new Emerald());
            themeList.add(new Depths());
            themeList.add(new Cloud());
        }
        return themes;
    }
    
    public int getThemeListSize(){
        return themeList.size();
    }
    
    public Theme getTheme(int idx){
        return themeList.get(idx);
    }
    
}