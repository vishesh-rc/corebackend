package com.roundcircle.wyzard.corebackend.db.repository;

import com.roundcircle.wyzard.corebackend.db.model.ClientAppsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClientAppsConfigRepository extends MongoRepository<ClientAppsConfig, String> {

    @Query("{clientName:'?0'}")
    ClientAppsConfig findByClientName(String clientName);

    long count();
}
