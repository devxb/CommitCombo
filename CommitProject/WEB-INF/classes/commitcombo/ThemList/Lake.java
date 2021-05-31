package commitcombo;

public class Lake extends Theme{
    
    public Lake(){
        this.themeName = "Lake";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#7F7FD5\"/> \n";
        this.Gradient += "<stop offset=\"50%\" stop-color=\"#86A8E7\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#91EAE4\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}