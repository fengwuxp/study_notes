package com.wuxp.study.basic.mathematics.recursive;


import com.wuxp.study.helper.SolvingTheDivisorHelper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 * 课堂5 作业
 *
 * <p>
 * 求解任意给定整数的（包括负数的）因数分解的所有组合，且1最多只能出现一次
 * <p>
 * 求解思路：
 * 1：先求解目标数的约数列表
 * 2：使用递归求解目标因数分解的所有组合
 * <p>
 * 1.1： 求解目标的约数列表
 * </p>
 */
@Slf4j
public class Lesson5Operation {


    /**
     * 求解
     *
     * @param num
     */
    void solve(int num) {
        SolveHandler solveHandler = new SolveHandler(num);
        solveHandler.handle(num, new ArrayList<>());
        log.debug("{}共有{}个组合的因数分解：", num, solveHandler.getCount());
    }


    public static void main(String[] args) {
        Lesson5Operation lesson5Operation = new Lesson5Operation();
        lesson5Operation.solve(100);
        lesson5Operation.solve(255);
    }


    /**
     * 求解因式分解组合的处理者
     */
    static class SolveHandler {

        private final Integer[] factorNumList;

        private final int handleNum;

        private int count;

        public SolveHandler(int num) {
            this.handleNum = num;
            this.factorNumList = SolvingTheDivisorHelper.solve(num);
            log.debug("数{}的约数列表{}", num, factorNumList);
        }


        /**
         * 处理
         *
         * @param num     目标数
         * @param results 结果
         */
        void handle(int num, List<Integer> results) {
            if (num == 1) {

                if (!results.contains(1)) {
                    this.count++;
                    List<Integer> integers = new ArrayList<>(results);
                    integers.add(1);
                    log.debug("{}的第{}个因式分解：{}", handleNum, this.count, integers);
                }
                if (results.size() > 1) {
                    this.count++;
                    log.debug("{}的第{}个因式分解：{}", handleNum, this.count, results);
                }
                return;
            } else if (num < 1) {
                return;
            }

            for (int i = 1; i < this.factorNumList.length; i++) {
                int factorNum = this.factorNumList[i];
                List<Integer> integers = new ArrayList<>(results);
                integers.add(factorNum);
                this.handle(num / factorNum, integers);
            }
        }

        public int getCount() {
            return count;
        }
    }
}
