package com.jobchahiye.kya.repository;

import com.jobchahiye.kya.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILessonRepository extends JpaRepository<Lesson, Long> {
    List<Lesson> findByPublishedTrueOrderByCreatedAtDesc();
}
