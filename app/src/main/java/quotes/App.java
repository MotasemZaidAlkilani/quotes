/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;


import java.io.IOException;


public class App {


    public static void main(String[] args) throws IOException {
getAndSaveQuoteLocally first_quote=new getAndSaveQuoteLocally("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
System.out.println(getAndSaveQuoteLocally.quotes);
    }


}
