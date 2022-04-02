package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class getAndSaveQuoteLocally {
   String result="";
    public getAndSaveQuoteLocally(String api) throws IOException {
        try {
            URL apiUrl = new URL(api);
            HttpURLConnection connectToApi = (HttpURLConnection) apiUrl.openConnection();
            connectToApi.setRequestMethod("GET");
            InputStreamReader inputReader = new InputStreamReader(connectToApi.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputReader);
            String data = bufferedReader.readLine();
            Gson gson = new Gson();
            quotes quotes = gson.fromJson(data, quotes.class);
            Writer writer = Files.newBufferedWriter(Paths.get("app/src/main/resources/quotesFromApi.json"));
            gson.toJson(quotes, writer);
            writer.close();
            result = quotes.toString();
        }catch (Exception e){
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("app/src/main/resources/quotesFromApi.json"));
            quotes quotes = gson.fromJson(reader, quotes.class);
            result = quotes.toString();
            reader.close();

        }
    }

    @Override
    public  String toString() {
        return  result;

    }
}
