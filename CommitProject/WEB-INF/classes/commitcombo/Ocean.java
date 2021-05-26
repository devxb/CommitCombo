package commitcombo;

public class Ocean extends Theme{
    
    public Ocean(){
        this.themeName = "Ocean";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
        
        // set Gradient
        this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
        this.Gradient += "<stop offset=\"0%\" stop-color=\"#1488CC\"/> \n";
        this.Gradient += "<stop offset=\"100%\" stop-color=\"#2B32B2\"/> \n";
        this.Gradient += "</linearGradient>";
        
    }
    
}