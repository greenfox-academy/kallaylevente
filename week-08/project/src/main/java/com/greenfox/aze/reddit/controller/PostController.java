package com.greenfox.aze.reddit.controller;

import com.greenfox.aze.reddit.model.ListOfPosts;
import com.greenfox.aze.reddit.model.Post;
import com.greenfox.aze.reddit.services.RedditPostRepository;
import com.greenfox.aze.reddit.services.RedditPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  RedditPostRepository redditPostRepository;

  @Autowired
  RedditPostService redditPostService;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public ListOfPosts listAllPosts() {
    ListOfPosts listOfPosts = new ListOfPosts();
    listOfPosts.setPosts(redditPostService.list());
    return listOfPosts;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post, @RequestHeader("header-name") String headerValue) {
    Post tempPost = new Post(post.getTitle(),post.getHref());
    redditPostRepository.save(tempPost);

    return tempPost;
  }

  @RequestMapping(value = "posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upVoteOnPost(@PathVariable("id") long ID, @RequestHeader("header-name") String headerValue) {
   Post temp = redditPostRepository.findOne(ID);
   temp.setScore(temp.getScore() + 1);
   redditPostRepository.save(temp);
   return temp;
  }

  @RequestMapping(value = "posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downVoteOnPost(@PathVariable("id") long ID, @RequestHeader("header-name") String headerValue) {
    Post temp = redditPostRepository.findOne(ID);
    temp.setScore(temp.getScore() - 1);
    redditPostRepository.save(temp);
    return temp;
  }


}
