package org.example.bookmanagement.Models;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

import static org.example.bookmanagement.Models.IssueStatus.NOT_ISSUED;
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
