package com.projectquiz.quizapp.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projectquiz.quizapp.model.Question;

@Repository

public interface QuestionDao extends JpaRepository<Question, Integer>{
	
	List<Question> findByCategory(String category);
	
	@Query(value = "SELECT * FROM question Where category=:category ORDER BY RAND() LIMIT :numQ",nativeQuery = true)
	List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
