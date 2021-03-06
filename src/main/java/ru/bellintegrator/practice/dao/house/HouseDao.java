package ru.bellintegrator.practice.dao.house;

import ru.bellintegrator.practice.model.House;

import java.util.List;

/**
 * DAO для работы с House
 */
public interface HouseDao {
    /**
     * Получить все объекты House
     *
     * @return
     */
    List<House> all();

    /**
     * Получить House по идентификатору
     *
     * @param id
     * @return
     */
    House loadById(Long id);

    /**
     * Сохранить House
     *
     * @param house
     */
    void save(House house);
}
