package org.example.bookmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Author extends BaseModel{
    private String name;
    private List<Genre> genres;

    public Author(int id, String name, List<Genre> genres) {
        this.name = name;
        this.genres = genres;
    }
}
