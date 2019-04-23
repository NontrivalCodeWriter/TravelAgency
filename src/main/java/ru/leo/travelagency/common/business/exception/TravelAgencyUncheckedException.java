package ru.leo.travelagency.common.business.exception;

public class TravelAgencyUncheckedException extends Exception {
    protected int code;

    public TravelAgencyUncheckedException(int code, String message) {
        super(message);
        this.code = code;
    }


    public TravelAgencyUncheckedException(int code, String message, Exception cause) {
        super(message);
        this.code = code;
        initCause(cause);
    }
}
