package ru.leo.travelagency.common.business.service;

import ru.leo.travelagency.common.business.exception.TravelAgencyUncheckedException;

import java.util.List;

public interface BaseService<TYPE, ID> {
    void insert(TYPE entity);

    void update(TYPE entity);

    TYPE findById(ID id);

    void deleteById(ID id) throws TravelAgencyUncheckedException;

    void delete(TYPE entity);

    void printAll();

    List<TYPE> findAll();
}
