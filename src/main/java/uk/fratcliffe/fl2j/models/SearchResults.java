package uk.fratcliffe.fl2j.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchResults {
    @JsonProperty("city:search-results")
    private List<Result> results;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
