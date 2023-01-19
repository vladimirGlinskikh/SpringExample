package kz.zhelezyaka.SpringExample.repository;

import kz.zhelezyaka.SpringExample.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
