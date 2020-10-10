package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Post;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {
   
	@RestResource(rel="contains-title",path="containsTitle")
	public List<Post> findByTitleContaining(String title) ;
}