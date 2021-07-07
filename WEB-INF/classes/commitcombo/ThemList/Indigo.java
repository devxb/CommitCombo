package commitcombo;

public class Indigo extends Theme{
    
    public Indigo(){
        this.themeName = "Indigo";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#7579FF\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#B224EF\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}