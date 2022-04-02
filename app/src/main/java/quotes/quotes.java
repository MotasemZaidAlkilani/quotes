package quotes;




public class quotes {

    private  quote quote;


    public quote getQuoteDetails() {
        return quote;
    }

    public void setQuoteDetails(quote quoteDetails) {
        this.quote = quoteDetails;
    }

    @Override
    public String toString() {
        return quote+"";
    }
}
