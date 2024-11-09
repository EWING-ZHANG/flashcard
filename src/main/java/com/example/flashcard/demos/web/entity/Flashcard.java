package com.example.flashcard.demos.web.entity;

import lombok.Data;



@Data
public class Flashcard {
    private Long id;
    private Long flashcardSetId;
    private String term;
    private String definition;
    private String hint;
}
