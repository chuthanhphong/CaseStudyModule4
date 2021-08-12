package com.codegym.casestudy.service.comment;

import com.codegym.casestudy.model.comment.Comment;
import com.codegym.casestudy.service.IGeneralService;

import java.util.List;

public interface ICommentService extends IGeneralService<Comment> {
    List<Comment> findAllCommentByApartmentId(Long id);
}
