package commitcombo;

public class Emerald extends Theme{
    
    public Emerald(){
        this.themeName = "Emerald";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#348F50\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#56B4D3\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}