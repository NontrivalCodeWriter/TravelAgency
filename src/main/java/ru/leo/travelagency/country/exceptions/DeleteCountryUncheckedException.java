package ru.leo.travelagency.country.exceptions;

import ru.leo.travelagency.common.business.exception.TravelAgencyUncheckedException;

public class DeleteCountryUncheckedException extends TravelAgencyUncheckedException {

    public DeleteCountryUncheckedException(int code, String message) {
        super(code, message);
    }

    public DeleteCountryUncheckedException(CountryExceptionMeta exceptionMeta) {
        super(exceptionMeta.getCode(), exceptionMeta.getDescription());
    }
}