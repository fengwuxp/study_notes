package com.wuxp.study.helper;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 求解一个数的约数
 */
@Slf4j
public final class SolvingTheDivisorHelper {

    /**
     * @param num 求解的数
     * @return 所有约数
     */
    public static Integer[] solve(int num) {

        if (num == 0) {
            throw new RuntimeException("not support zero");
        }

        if (num == 1) {
            return new Integer[]{1};
        }

        Set<Integer> integers = new HashSet<>();

        double sqrt = Math.sqrt(num);
        if (num % sqrt == 0) {
            integers.add((int) sqrt);
        }


        //这里可能会发生隐式类型装换，四舍五入
        int half = num / 2;
        if (num % half == 0) {
            integers.add(half);
            integers.addAll(Arrays.asList(solve(half)));
        } else {
            for (int i = 2; i < half; i++) {
                if (num % i == 0) {
                    integers.add(i);
                }
            }
        }

        integers.add(num);

        return integers.stream()
                .sorted()
                .toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int num = 100;
        Integer[] integers = SolvingTheDivisorHelper.solve(num);
        log.debug("{}的因数列表为：{}", num, integers);
    }
}
