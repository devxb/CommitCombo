package commitcombo;

public class RoyalRed extends Theme{
    
    public RoyalRed(){
        this.themeName = "RoyalRed";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#A71D31\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#3F0D12\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}