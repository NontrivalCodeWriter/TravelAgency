package ru.leo.travelagency.common.business.dto;

import java.io.Serializable;

public abstract class BaseDTO <ID> implements Serializable {
    protected ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
