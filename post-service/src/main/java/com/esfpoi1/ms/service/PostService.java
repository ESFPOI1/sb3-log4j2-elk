package com.esfpoi1.ms.service;

import com.esfpoi1.ms.domain.Post;
import com.esfpoi1.ms.domain.PostWithComments;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getPosts();

    Optional<PostWithComments> getPost(Long id);

    Optional<PostWithComments> getPostWebClient(Long id);
}