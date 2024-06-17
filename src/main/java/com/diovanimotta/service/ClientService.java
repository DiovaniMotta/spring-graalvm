package com.diovanimotta.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.diovanimotta.domain.model.ClientModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientService {
    @Autowired
    ObjectMapper objectMapper;

    public List<ClientModel> findAll() {
        try {
            InputStream inputStream = new ClassPathResource("data.json").getInputStream();
            return objectMapper.readValue(inputStream, new TypeReference<List<ClientModel>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
