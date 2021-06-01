package commitcombo;

public class Cloud extends Theme{
    
    public Cloud(){
        this.themeName = "Cloud";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#9796F0\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#FBC7D4\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}