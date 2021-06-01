package commitcombo;

public class RoyalPurple extends Theme{
    
    public RoyalPurple(){
        this.themeName = "RoyalPurple";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#948E99\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#2E1437\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}