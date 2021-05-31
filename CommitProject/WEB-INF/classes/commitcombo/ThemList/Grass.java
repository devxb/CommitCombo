package commitcombo;

public class Grass extends Theme{
    
    public Grass(){
        this.themeName = "Grass";
        this.NameTagColor = "#003215";
        this.CommitComboColor = "#003215";
        this.ComboCntColor = "#003215";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(110)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#DFFFCD\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#39F3BB\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}