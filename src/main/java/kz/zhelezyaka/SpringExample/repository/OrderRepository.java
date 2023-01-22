package kz.zhelezyaka.SpringExample.repository;

import kz.zhelezyaka.SpringExample.model.TacoOrder;

import java.util.Optional;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
    Optional<TacoOrder> findById(Long id);
}
