package commitcombo;

public class DarkBlue extends Theme{
    
    public DarkBlue(){
        this.themeName = "DarkBlue";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#0F2027\"/> \n";
        this.Gradient += "<stop offset=\"50%\" stop-color=\"#203A43\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#2C5364\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}