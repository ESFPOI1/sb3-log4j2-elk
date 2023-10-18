package com.esfpoi1.ms.service;

import com.esfpoi1.ms.domain.Comment;
import java.util.List;
public interface CommentService {

    List<Comment> getCommentsForPost(Long postId);
}