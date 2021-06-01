package commitcombo;

public class DarkGray extends Theme{
    
    public DarkGray(){
        this.themeName = "DarkGray";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#28313B\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#485461\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}