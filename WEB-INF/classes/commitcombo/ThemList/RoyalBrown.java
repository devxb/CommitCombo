package commitcombo;

public class RoyalBrown extends Theme{
    
    public RoyalBrown(){
        this.themeName = "RoyalBrown";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#1E130C\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#9A8478\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}