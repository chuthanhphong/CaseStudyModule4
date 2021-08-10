package com.codegym.casestudy.service.comment;
import com.codegym.casestudy.repository.comment.ICommentRepository;
import com.codegym.casestudy.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;

public interface ICommentService extends IGeneralService<Comment> {

}
