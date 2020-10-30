package co.eeikee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.eeikee.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long>{

}
