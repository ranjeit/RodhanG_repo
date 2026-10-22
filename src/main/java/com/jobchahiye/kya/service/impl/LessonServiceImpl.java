package com.jobchahiye.kya.service.impl;

import com.jobchahiye.kya.entity.Lesson;
import com.jobchahiye.kya.repository.ILessonRepository;
import com.jobchahiye.kya.service.ILessonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements ILessonService {

    private final ILessonRepository lessonRepository;

    public LessonServiceImpl(ILessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public Lesson getById(Long id) {
        return lessonRepository.findById(id)
                .filter(Lesson::isPublished)
                .orElseThrow(()->
                        new IllegalArgumentException("Lesson not found: "+id));
    }

    @Override
    public List<Lesson> getAll() {
        return lessonRepository.findByPublishedTrueOrderByCreatedAtDesc();
    }

    @Override
    public Lesson create(String topic, String category) {
        String title = topic.trim();

        String script = """
               Welcome to your Snapbit learning session.

                Today's topic is %s.

                Let's begin with the key idea. Understanding %s
                starts with identifying its basic principles and how
                they relate to real-world situations.

                As you learn, think about one example from your own
                experience. Try explaining the main idea in your own
                words, then review what you have learned.

                Thanks for listening. Revisit this lesson whenever
                you want to refresh your understanding of %s.
                """.formatted(title,title,title);
        return lessonRepository.save(new Lesson(title,category,script));
    }
}
