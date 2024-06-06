package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.models.JsonDocument;
import com.bezkoder.spring.jwt.mongodb.repository.JsonDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

@RestController
@RequestMapping("/")
public class JsonDocumentController {

    @Autowired
    private JsonDocumentRepository jsonDocumentRepository;

    @GetMapping("getalldocuments")
    public ResponseEntity<List<JsonDocument>> getAllDocuments() {
        List<JsonDocument> documents = jsonDocumentRepository.findAll();
        return ResponseEntity.ok(documents);
    }

    @PostMapping("savedocument")
    public ResponseEntity<JsonDocument> saveJsonData(@RequestBody JsonDocument jsonData) {
        jsonData.setDocumentId(UUID.randomUUID());
        jsonDocumentRepository.save(jsonData);
        return ResponseEntity.ok(jsonData);
    }

    @GetMapping("getadocument/{id}")
    public ResponseEntity<?> getDocumentById(@PathVariable UUID id) {
        Optional<JsonDocument> documentOptional = jsonDocumentRepository.findByDocumentId(id);

        if (documentOptional.isPresent()) {
            JsonDocument document = documentOptional.get();
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Document with ID " + id + " not found");
        }
    }

    @GetMapping("documentofaperson/{clientId}")
    public ResponseEntity<?> getDocumentByClientId(@PathVariable String clientId) {
        Optional<JsonDocument> documentOptional = jsonDocumentRepository.findByClientId(clientId);

        if (documentOptional.isPresent()) {
            JsonDocument document = documentOptional.get();
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Document with clientId " + clientId + " not found");
        }
    }
}
