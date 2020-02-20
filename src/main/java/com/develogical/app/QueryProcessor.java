package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("keats")) {
            return "John Keats was an English Romantic poet. He was one of the main figures of the" +
                    " second generation of Romantic poets, along with Lord Byron and Percy Bysshe Shelley, " +
                    "despite his works having been in publication for only four years before his death from " +
                    "tuberculosis at the age of 25.";
        }
        return "";
    }
}
