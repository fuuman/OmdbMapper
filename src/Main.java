import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    public static void main(String[] args) {
        String s = "";
        try {
            s = readUrl("http://www.omdbapi.com/?t=inception&y=&plot=short&r=json");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new GsonBuilder().create();
        Movie m = gson.fromJson(s, Movie.class);
        System.out.println(m);
    }
}
