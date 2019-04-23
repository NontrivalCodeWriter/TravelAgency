package ru.leo.javacore.lesson9genericsbegin;

import ru.leo.travelagency.common.business.dto.BaseDTO;

public class GenericsFeatureTest extends BaseDTO {

    public static void main(String[] args) {
        GenericsFeatureTest g =  new GenericsFeatureTest();
        g.setId(5);
        System.out.println(g.getId());
    }
}
