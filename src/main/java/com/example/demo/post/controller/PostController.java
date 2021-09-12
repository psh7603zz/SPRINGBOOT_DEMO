package com.example.demo.post.controller;

import com.example.demo.post.request.UpdatePostRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getPost(@RequestParam Long page){
        return "posts";
    }

    @GetMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String getPost(@PathVariable long postId){
        return "post";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addPost(@RequestBody UpdatePostRequest updatePostRequest){
        return "post added";
    }

    @PutMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String updatePost(@PathVariable long postId, @RequestBody String request)
    {
        return "post updated";
    }

    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String deletePost(@PathVariable long postId){
        return "post deleted";
    }

}
