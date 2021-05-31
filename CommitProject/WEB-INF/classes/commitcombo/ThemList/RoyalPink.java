package commitcombo;

public class RoyalPink extends Theme{
    
    public RoyalPink(){
        this.themeName = "RoyalPink";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#FFA69E\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#861657\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}