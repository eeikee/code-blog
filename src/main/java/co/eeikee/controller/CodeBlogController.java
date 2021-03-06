package co.eeikee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.eeikee.model.Post;
import co.eeikee.service.CodeBlogService;

@Controller
public class CodeBlogController {
	
	@Autowired
	CodeBlogService codeBlogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts(){
	  ModelAndView mv = new ModelAndView("posts");
	  List<Post> posts = codeBlogService.findALL();
	  mv.addObject("posts", posts);
	  return mv;
	 }
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostDetails(@PathVariable("id") long id){
	  ModelAndView mv = new ModelAndView("postDetails");
	  Post post = codeBlogService.findById(id);
	  mv.addObject("post", post);
	  return mv;
	 }
}
