package ru.leo.travelagency.customer;

import ru.leo.travelagency.order.Order;

public class Customer {

    String firstName;
    String lastName;
    Passport passport;
    Order[] order;

    private class Passport {
    }
}
