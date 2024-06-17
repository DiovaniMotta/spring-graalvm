package com.diovanimotta.domain.model;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientModel {

    UUID id;
    String firstName;
    String lastName;
    String email;
    String document;
}
