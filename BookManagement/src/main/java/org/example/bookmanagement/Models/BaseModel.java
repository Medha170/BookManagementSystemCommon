package org.example.bookmanagement.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private Staff createdBy;
    private Date updatedAt;
    private Staff updatedBy;
}
