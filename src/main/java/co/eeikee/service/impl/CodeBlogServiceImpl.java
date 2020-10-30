package co.eeikee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.eeikee.model.Post;
import co.eeikee.repository.CodeBlogRepository;
import co.eeikee.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService{

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	@Override
	public List<Post> findALL() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}

}
