package co.eeikee.service;

import java.util.List;

import co.eeikee.model.Post;

public interface CodeBlogService {
	
	List<Post> findALL();
	Post findById(Long id);
	Post save(Post post);
}
