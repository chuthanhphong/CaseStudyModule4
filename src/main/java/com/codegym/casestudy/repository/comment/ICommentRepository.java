package com.codegym.casestudy.repository.comment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;

@Repository
public interface ICommentRepository extends PagingAndSortingRepository<Comment,Long> {

}
