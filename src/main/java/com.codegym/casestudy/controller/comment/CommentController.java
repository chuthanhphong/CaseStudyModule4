package com.codegym.casestudy.controller.comment;

import com.codegym.casestudy.model.comment.Comment;
import com.codegym.casestudy.service.comment.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/comments")
public class CommentController {
    @Autowired
   private ICommentService iCommentService ;
    @GetMapping("")
    public ResponseEntity<Iterable<Comment>> findAll(){
        Iterable<Comment> comments = iCommentService.findAll();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }


    @PostMapping("")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        return new ResponseEntity<>(iCommentService.save(comment), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Comment> findOne(@PathVariable Long id){
        return new ResponseEntity<>(iCommentService.findById(id).get(),HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Comment> updateProduct(@PathVariable Long id,@RequestBody Comment comment){
        Optional<Comment> products = iCommentService.findById(id);
        if (!products.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            comment.setId(id);
            iCommentService.save(comment);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Comment> deleteProduct(@PathVariable Long id){
        Optional<Comment> productOptional = iCommentService.findById(id);
        if (!productOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iCommentService.delete(id);
        return new ResponseEntity<>(productOptional.get(),HttpStatus.NO_CONTENT);
    }
    @GetMapping("/list")
    public ModelAndView getAllCmt() {
        ModelAndView modelAndView = new ModelAndView("/comment/list");
        modelAndView.addObject("comments", iCommentService.findAll());
        return modelAndView;
    }
}
