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
        // Removing id field from each document
        documents.forEach(document -> document.setId(null));
        return ResponseEntity.ok(documents);
    }

    @PostMapping("savedocument")
    public ResponseEntity<JsonDocument> saveJsonData(@RequestBody JsonDocument jsonData) {
        jsonData.setId(UUID.randomUUID());
        jsonDocumentRepository.save(jsonData);
        return ResponseEntity.ok(jsonData);
    }

    @GetMapping("getadocument/{id}")
    public ResponseEntity<?> getDocumentById(@PathVariable UUID id) {
        Optional<JsonDocument> documentOptional = jsonDocumentRepository.findById(id);

        if (documentOptional.isPresent()) {
            JsonDocument document = documentOptional.get();
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Document with ID " + id + " not found");
        }
    }
}

