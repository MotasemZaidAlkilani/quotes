/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertTrue;


class AppTest {
    @Test void testJsonFile() throws FileNotFoundException {
        Gson gson = new Gson();
        quotes[] list = gson.fromJson(new FileReader("build/resources/main/quotes.json"), quotes[].class);
        Random rand=new Random();
        int rand_num=rand.nextInt(list.length);
        assertTrue(list[rand_num].toString().contains("author"));
        assertTrue(list[rand_num].toString().contains("text"));

    }
    @Test void testApi() throws IOException {
    getAndSaveQuoteLocally first_quote=new getAndSaveQuoteLocally("https://favqs.com/api/qotd");
    System.out.println(first_quote);}
}
