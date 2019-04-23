package ru.leo.travelagency.common.solution.utils;

import java.util.concurrent.ThreadLocalRandom;

public final class RandomUtils {
    public static int getRandomInt(int start, int end){
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }
}
