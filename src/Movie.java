/**
 * Created by marco on 06.07.16.
 */
public class Movie {
    private String Title;
    private String Year;
    private String Runtime;
    private String Director;
    private String Actors;
    private String Plot;
    private String imdbRating;

    @Override
    public String toString() {
        return "Title: " + Title
                + "\nYear: " + Year
                + "\nRuntime: " + Runtime
                + "\nDirector: " + Director
                + "\nActors: " + Actors
                + "\nPlot: " + Plot
                + "\nimdbRating: " + imdbRating + "\n";
    }
}
