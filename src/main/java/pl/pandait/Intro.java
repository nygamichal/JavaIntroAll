package pl.pandait;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Intro {

    public static void main(String[] args) {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        System.out.println(quotes.getRandomQuote());
    }
}
