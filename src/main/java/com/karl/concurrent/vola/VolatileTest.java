package com.karl.concurrent.vola;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 描述:  Volatile test
 *
 * @author mh
 * @create 2020-02-16 20:57
 */
public class VolatileTest {
    private static final int period[][] = {{6, 8}, {10, 12}, {14, 16}, {18, 20}};

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 1, 32, 3, 4, 6, 9);

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                int a = e1 - e2;
                return a > 0 ? -1 : 1;
            }
        });
        System.out.println(integers);

        int a =23;
        int b = 33;
        BigDecimal divide = new BigDecimal(a).divide(new BigDecimal(a + b));
        System.out.println(divide);


    }


    private static boolean getDiffrent2(List<Long> list1, List<Long> list2) {
        return list1.retainAll(list2);
    }


    private static Date randomDate(Date start, Date end) {
        try {
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }


    private static Date getDayTime(int time) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, time);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return c.getTime();
    }


    /**
     * 获取随机时间段
     *
     * @return int[]
     */
    private static int[] getRandomPeriod() {
        Random r = new Random();
        int nextInt = r.nextInt(period.length);
        return period[nextInt];
    }

}