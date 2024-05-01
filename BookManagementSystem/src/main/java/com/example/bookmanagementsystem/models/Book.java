package com.example.bookmanagementsystem.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book extends BaseModel{
    private String title;
    private List<Author> authors;
    private int numberOfPages;
    private List<Genre> genres;
    private String ISBN;
    private IssueStatus issueStatus;


}
