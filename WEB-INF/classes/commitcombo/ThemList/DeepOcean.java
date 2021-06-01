package commitcombo;

public class DeepOcean extends Theme{
    
    public DeepOcean(){
        this.themeName = "DeepOcean";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#000046\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#1CB5E0\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}