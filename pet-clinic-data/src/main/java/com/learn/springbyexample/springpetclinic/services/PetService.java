package com.learn.springbyexample.springpetclinic.services;

import com.learn.springbyexample.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
