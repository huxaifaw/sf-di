package com.springframework.pets.services;

//@Profile("cat")
//@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
