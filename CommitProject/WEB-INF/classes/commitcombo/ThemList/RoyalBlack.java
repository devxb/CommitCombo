package commitcombo;

public class RoyalBlack extends Theme{
    
    public RoyalBlack(){
        this.themeName = "RoyalBlack";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#000000\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#434343\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}