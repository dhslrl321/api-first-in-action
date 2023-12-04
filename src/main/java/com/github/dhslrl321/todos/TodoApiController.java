package com.github.dhslrl321.todos;

import com.github.dhslrl321.oas.api.PetsApi;
import com.github.dhslrl321.oas.model.CreatePetData;
import org.springframework.http.ResponseEntity;

public class TodoApiController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets(CreatePetData createPetData) {
        return null;
    }
}
