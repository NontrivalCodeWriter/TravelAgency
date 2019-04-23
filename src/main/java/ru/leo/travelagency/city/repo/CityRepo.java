package ru.leo.travelagency.city.repo;

import ru.leo.travelagency.city.domain.City;
import ru.leo.travelagency.city.search.CitySearchCondition;
import ru.leo.travelagency.common.business.repo.BaseRepo;

import java.util.List;

public interface CityRepo extends BaseRepo {
    void add(City city);

    City findById(long id);

    List<City> search(CitySearchCondition searchCondition);
}
