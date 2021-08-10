package com.codegym.casestudy.service.comment;

import com.codegym.casestudy.repository.comment.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.Optional;
@Service
public class CommentService implements ICommentService{
    @Autowired
    private ICommentRepository iCommentRepository;
    @Override
    public Iterable<Comment> findAll() {
        return iCommentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return iCommentRepository.findById(id);
    }

    @Override
    public Comment save(Comment comment) {
        return iCommentRepository.save(comment);
    }

    @Override
    public void delete(Long id) {
        iCommentRepository.deleteById(id);
    }
}
