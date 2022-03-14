package quotes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class getAndSaveQuoteLocally {
    static ArrayList<String> quotes=new ArrayList();

    public getAndSaveQuoteLocally(String api) throws IOException {
        URL apiUrl=new URL(api);
        HttpURLConnection connectToApi= (HttpURLConnection) apiUrl.openConnection();
        connectToApi.setRequestMethod("GET");
        InputStreamReader inputReader=new InputStreamReader(connectToApi.getInputStream());
        BufferedReader bufferedReader=new BufferedReader(inputReader);
        Gson gson=new Gson();
        quotesClass list = gson.fromJson(bufferedReader, quotesClass.class);
        quotes.add(list.toString());
    }
    @Override
    public  String toString() {
        return  quotes.toString();

    }
}
