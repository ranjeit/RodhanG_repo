package com.jobchahiye.kya.controller;

import com.jobchahiye.kya.entity.Lesson;
import com.jobchahiye.kya.service.ILessonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class LessonController {
    private final ILessonService lessonService;

    public LessonController(ILessonService lessonService) {
        this.lessonService = lessonService;
    }
    // create lesson
    @PostMapping
   public ResponseEntity<Lesson> persistLesson(@Valid
                                               @RequestParam String topic,
                                               @RequestParam String category){
        Lesson lesson = lessonService.create(topic, category);
    return ResponseEntity.status(HttpStatus.CREATED).body(lesson);
    }
    // get all lessons as records
    @GetMapping
    public ResponseEntity<List<Lesson>> getLessons(){
        List<Lesson> lessons = lessonService.getAll();
        return ResponseEntity.ok(lessons) ;
    }

    // get lesson by ID
    @GetMapping("/{id}")
    public ResponseEntity<Lesson> getLesson(@PathVariable Long id){
        Lesson lesson = lessonService.getById(id);
        return ResponseEntity.ok(lesson);
    }
}
