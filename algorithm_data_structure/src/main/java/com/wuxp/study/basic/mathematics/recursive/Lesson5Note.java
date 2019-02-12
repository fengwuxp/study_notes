package com.wuxp.study.basic.mathematics.recursive;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 * 课堂5笔记
 *
 * <p>
 * 存在面额为1、2、5、10的钱币，现在需要总金额为10元，求一共有多少种解
 * </p>
 */
@Slf4j
public class Lesson5Note {

    private static final int[] COIN_NUMBERS = {1, 2, 5, 10};


    /**
     * 解的总个数
     */
    private int count = 0;

    /**
     * 求解
     *
     * @param totalAmount 总金额
     * @param results     求解的结果
     */
    public void solve(int totalAmount, List<Integer> results) {

        if (totalAmount == 0) {
            this.count++;
            log.debug("第{}个解：{}", this.count, results);
        } else if (totalAmount < 0) {
            //小于0 不处理

        } else {
            for (int coinNumber : COIN_NUMBERS) {
                List<Integer> newResults = new ArrayList<>(results);
                newResults.add(coinNumber);
                this.solve(totalAmount - coinNumber, newResults);
            }
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Lesson5Note classNote5 = new Lesson5Note();
        classNote5.solve(10, new ArrayList<>());

        log.debug("解的总个数：{}", classNote5.getCount());
    }

}
