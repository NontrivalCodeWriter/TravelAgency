package ru.leo.travelagency.user.repo;

import ru.leo.travelagency.common.business.repo.BaseRepo;
import ru.leo.travelagency.user.domain.User;
import ru.leo.travelagency.user.search.UserSearchCondition;

import java.util.List;

public interface UserRepo extends BaseRepo<User, Long> {
    List<User> search(UserSearchCondition searchCondition);

}
