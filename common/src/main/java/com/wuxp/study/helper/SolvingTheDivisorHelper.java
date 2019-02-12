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

        Set<Integer> integers = new HashSet<>();

        for (int i = 1; i * i <= num; ++i) {
            if (num % i == 0) {
                //得到左侧的约数列表
                integers.add(i);
                if (i * i != num) {
                    //求出右侧的约数列表
                    integers.add(num / i);
                }
            }
        }
        return integers.stream()
                .sorted()
                .toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int num = 99;
        Integer[] integers = SolvingTheDivisorHelper.solve(num);
        log.debug("{}的因数列表为：{}", num, integers);
    }
}
