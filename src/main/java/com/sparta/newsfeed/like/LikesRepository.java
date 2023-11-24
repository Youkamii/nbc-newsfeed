package com.sparta.newsfeed.like;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Long> {
    Optional<Likes> findByPostIdAndUserId(Long postId, Long userId);
    int countByPostId(Long postId);
}