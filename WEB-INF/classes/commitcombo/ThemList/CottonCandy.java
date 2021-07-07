package commitcombo;

public class CottonCandy extends Theme{
    
    public CottonCandy(){
        this.themeName = "CottonCandy";
        this.NameTagColor = "#458FFF";
        this.CommitComboColor = "#458FFF";
        this.ComboCntColor = "#458FFF";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#E3FDF5\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#FFE6FA\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}