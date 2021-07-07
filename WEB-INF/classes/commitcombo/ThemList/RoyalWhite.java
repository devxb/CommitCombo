package commitcombo;

public class RoyalWhite extends Theme{
    
    public RoyalWhite(){
        this.themeName = "RoyalWhite";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#8B939A\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#5B6467\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}