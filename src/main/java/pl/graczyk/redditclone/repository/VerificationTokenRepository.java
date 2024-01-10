package pl.graczyk.redditclone.repository;

import org.springframework.stereotype.Repository;
import pl.graczyk.redditclone.model.User;
import pl.graczyk.redditclone.model.VerificationToken;

import java.util.Optional;

@Repository
public interface VerificationTokenRepository {
    Optional<VerificationToken> findByToken(String token);
}
