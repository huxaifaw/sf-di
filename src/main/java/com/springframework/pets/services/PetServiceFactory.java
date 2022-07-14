package com.springframework.pets.services;

public class PetServiceFactory {

    public PetService getPetType(String petType) {
        switch (petType){
            case "cats":
                return new CatPetService();
            case "dogs":
                return new DogPetService();
            default:
                return new DogPetService();
        }
    }
}
