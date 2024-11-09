package com.example.flashcard.demos.web.controller;

import com.example.flashcard.demos.web.entity.Flashcard;
import com.example.flashcard.demos.web.service.FlashcardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/flashcards")
public class FlashcardController {
    @Resource
    private FlashcardService flashcardService;

    @PostMapping
    public String addFlashcard(@RequestBody Flashcard flashcard) {
        flashcardService.addFlashcard(flashcard);
        return "Flashcard added successfully!";
    }

    @GetMapping("/{id}")
    public Flashcard getFlashcardById(@PathVariable Long id) {
        return flashcardService.getFlashcardById(id);
    }

    @GetMapping
    public List<Flashcard> getAllFlashcards() {
        return flashcardService.getAllFlashcards();
    }
}