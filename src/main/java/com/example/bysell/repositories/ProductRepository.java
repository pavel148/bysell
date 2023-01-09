package com.example.bysell.repositories;

import com.example.bysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//Long - тип ID
//получили достпу и чтобы не прописывать свою логику взаимодействия  с БД - мы получаем из коробки такие
//функции получить все товары из БД - сохранить товар удалить товар
//просто наследуясь от интерфейса
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
