package commitcombo;

public class Depths extends Theme{
    
    public Depths(){
        this.themeName = "Depths";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#373B44\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#4286F4\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}