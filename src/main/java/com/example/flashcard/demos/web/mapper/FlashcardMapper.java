package com.example.flashcard.demos.web.mapper;

import com.example.flashcard.demos.web.entity.Flashcard;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FlashcardMapper {
    @Insert("INSERT INTO flashcard (question, answer,hint) VALUES (#{question}, #{answer},#{hint})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertFlashcard(Flashcard flashcard);

    @Select("SELECT * FROM flashcard WHERE id = #{id}")
    Flashcard getFlashcardById(Long id);

    @Select("SELECT * FROM flashcard")
    List<Flashcard> getAllFlashcards();
}