package com.jobchahiye.kya.service;

import com.jobchahiye.kya.entity.Lesson;

import java.util.List;

public interface ILessonService {

    Lesson getById(Long id);

    List<Lesson> getAll();

    Lesson create(String topic, String category);

}
