package com.example.bookmanagementsystem.dtos;

import com.example.bookmanagementsystem.models.Genre;
import com.example.bookmanagementsystem.models.IssueStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookDTO {
    private String title;
    private List<String> Author;
    private int numberOfPages;
    private List<Genre> genres;
    private String ISBN;
    private IssueStatus issueStatus;
}
