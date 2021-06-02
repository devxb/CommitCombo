package commitcombo;

import java.util.ArrayList;

public class Themes{
    
    private static Themes themes= new Themes();
    
    private Themes(){}
    
    public static Themes getThemes(){
        return themes;
    }
    
    public ArrayList<Theme> makeTheme(){
        ArrayList<Theme> themeList = new ArrayList<Theme>();
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
        themeList.add(new RoyalRed());
        themeList.add(new RoyalPink());
        themeList.add(new Pink());
        themeList.add(new Apricot());
        themeList.add(new DeepPurple());
        themeList.add(new DarkBlue());
        themeList.add(new DarkGray());
        themeList.add(new RoyalWhite());
        themeList.add(new RoyalPurple());
        themeList.add(new RoyalBlack());
        themeList.add(new RoyalBrown());
        return themeList;
    }
    
}