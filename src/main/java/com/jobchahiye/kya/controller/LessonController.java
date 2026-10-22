package com.jobchahiye.kya.controller;

import com.jobchahiye.kya.service.ILessonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class LessonController {
    private final ILessonService lessonService;

    public LessonController(ILessonService lessonService) {
        this.lessonService = lessonService;
    }
   public 
}
