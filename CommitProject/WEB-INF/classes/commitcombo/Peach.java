package commitcombo;

public class Peach extends Theme{
    
    public Peach(){
        this.themeName = "Peach";
        this.NameTagColor = "#813627";
        this.CommitComboColor = "#813627";
        this.ComboCntColor = "#813627";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#FFECD2\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#FCB69F\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
}