package com.org.demo.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.org.demo.model.Tutorials;

public interface TutorialRepository extends CrudRepository<Tutorials, Long> {
	  List<Tutorials> findByPublished(boolean published);
	  List<Tutorials> findByTitleContaining(String title);
	}