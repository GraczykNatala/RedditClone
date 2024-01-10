package pl.graczyk.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.graczyk.redditclone.model.Comment;
import pl.graczyk.redditclone.model.Post;
import pl.graczyk.redditclone.model.Subreddit;
import pl.graczyk.redditclone.model.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost(Post post);

    List<Comment> findAllByUser(User user);
}