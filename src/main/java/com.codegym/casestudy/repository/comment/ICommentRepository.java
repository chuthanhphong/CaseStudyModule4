package com.codegym.casestudy.repository.comment;

import com.codegym.casestudy.model.comment.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICommentRepository extends CrudRepository<Comment,Long> {
    List<Comment> findAllByApartmentId(Long id);
}
