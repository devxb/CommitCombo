package commitcombo;

public class Perfume extends Theme{
    
    public Perfume(){
        this.themeName = "Perfume";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#FF1745\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#D501F8\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}