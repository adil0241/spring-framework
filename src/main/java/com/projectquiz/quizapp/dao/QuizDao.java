package com.projectquiz.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectquiz.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
