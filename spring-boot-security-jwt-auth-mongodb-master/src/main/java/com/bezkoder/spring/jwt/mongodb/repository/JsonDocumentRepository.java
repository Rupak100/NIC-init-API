package com.bezkoder.spring.jwt.mongodb.repository;

import com.bezkoder.spring.jwt.mongodb.models.JsonDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import java.util.UUID;

public interface JsonDocumentRepository extends MongoRepository<JsonDocument, String> {
    Optional<JsonDocument> findByDocumentId(UUID documentId);
    Optional<JsonDocument> findByClientId(String clientId);
}
