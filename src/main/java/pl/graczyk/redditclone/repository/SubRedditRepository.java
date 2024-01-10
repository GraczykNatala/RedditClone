package pl.graczyk.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.graczyk.redditclone.model.Subreddit;
import pl.graczyk.redditclone.model.User;

import java.util.Optional;

@Repository
public interface SubRedditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}
