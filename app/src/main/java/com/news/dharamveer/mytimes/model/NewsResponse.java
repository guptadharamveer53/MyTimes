package com.news.dharamveer.mytimes.model;

import java.util.ArrayList;

/**
 * Created by dharamveergupta on 15/07/18.
 */

public class NewsResponse {
    private String status;
    private int totalResults;
    private ArrayList<ArticleStructure> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ArticleStructure> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ArticleStructure> articles) {
        this.articles = articles;
    }
}
