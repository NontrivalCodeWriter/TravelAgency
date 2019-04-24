package ru.leo.travelagency.user.search;

import ru.leo.travelagency.common.business.search.BaseSearchCondition;

import static ru.leo.travelagency.common.solution.utils.StringUtils.isNotBlank;

public class UserSearchCondition extends BaseSearchCondition {
    private String name;
    private String last;
    private UserOrderByField orderByField;

    public UserOrderByField getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(UserOrderByField orderByField) {
        this.orderByField = orderByField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public boolean searchByName() {
        return isNotBlank(this.getName());
    }

    public boolean searchByLast() {
        return isNotBlank(this.getLast());
    }

}
