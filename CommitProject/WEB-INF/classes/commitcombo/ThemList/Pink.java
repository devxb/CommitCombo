package commitcombo;

public class Pink extends Theme{
    
    public Pink(){
        this.themeName = "Pink";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#D387AB\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#E899DC\"/> \n";
        this.Gradient += "</linearGradient>";
    }
    
    
}