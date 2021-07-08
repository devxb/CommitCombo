package commitcombo;

public class Rainbow extends Theme{
    
    public Rainbow(){
        this.themeName = "Rainbow";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#9DDDF6\"/> \n";
        this.Gradient += "<stop offset=\"50%\" stop-color=\"#B58DF0\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#F37FAB\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}