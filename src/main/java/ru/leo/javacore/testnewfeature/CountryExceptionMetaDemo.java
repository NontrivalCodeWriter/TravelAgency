package ru.leo.javacore.testnewfeature;



enum CountryExceptionMetaDupliccate {
    ELETE_COUNTRY_CONSTRAINT_ERROR(1, "Error while delete country. There is constraint violation!");

    private int code;
    private String description;

    CountryExceptionMetaDupliccate(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        CountryExceptionMetaDupliccate countryExceptionMetaDupliccate = null;
        countryExceptionMetaDupliccate.getDescription();
    }


}