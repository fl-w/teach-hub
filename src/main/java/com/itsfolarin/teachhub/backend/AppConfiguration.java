package com.itsfolarin.teachhub.backend;

import com.itsfolarin.teachhub.backend.security.AuthConfiguration;
import com.itsfolarin.teachhub.backend.security.AuthProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties({AuthProperties.class})
@EnableMongoRepositories
@Import({AuthConfiguration.class, MongoAutoConfiguration.class})
public class AppConfiguration {
}
