package commitcombo;

public class DeepPurple extends Theme{
    
    public DeepPurple(){
        this.themeName = "DeepPurple";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#5F0A87\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#A4508B\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}