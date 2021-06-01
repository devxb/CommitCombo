package commitcombo;

public class Sunset extends Theme{
    
    public Sunset(){
        this.themeName = "Sunset";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#FFBC50\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#AA31BD\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}