package com.itsfolarin.teachhub.backend.repo;

import com.itsfolarin.teachhub.backend.domain.PersistableRememberMeToken;
import com.itsfolarin.teachhub.backend.security.RememberMeToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RememberMeTokenRepository extends MongoRepository<PersistableRememberMeToken, Long> {

    RememberMeToken findBySeries(String series);

    void removeAllByUserName(String username);
}
