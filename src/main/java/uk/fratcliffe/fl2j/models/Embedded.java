package uk.fratcliffe.fl2j.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded {
    @JsonProperty("_embedded")
    public SearchResults searchResults;

    public SearchResults getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(SearchResults searchResults) {
        this.searchResults = searchResults;
    }
}
