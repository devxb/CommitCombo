package commitcombo;

public class Apricot extends Theme{
    
    public Apricot(){
        this.themeName = "Apricot";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#E58C8A\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#EEC0C6\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}