package com.example.flashcard.demos.web.service;

import com.example.flashcard.demos.web.mapper.FlashcardMapper;
import com.example.flashcard.demos.web.entity.Flashcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlashcardService {
    @Resource
    private FlashcardMapper flashcardMapper;

    public void addFlashcard(Flashcard flashcard) {
        flashcardMapper.insertFlashcard(flashcard);
    }

    public Flashcard getFlashcardById(Long id) {
        return flashcardMapper.getFlashcardById(id);
    }

    public List<Flashcard> getAllFlashcards() {
        return flashcardMapper.getAllFlashcards();
    }
}