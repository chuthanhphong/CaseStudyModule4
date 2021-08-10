package com.codegym.casestudy.repository.comment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;

@Repository
public interface ICommentRepository extends CrudRepository<Comment,Long> {
}
