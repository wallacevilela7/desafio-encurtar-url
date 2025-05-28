package tech.wvs.desafiourlshorten.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.wvs.desafiourlshorten.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
