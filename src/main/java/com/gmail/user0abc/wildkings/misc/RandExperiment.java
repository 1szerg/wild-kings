package com.gmail.user0abc.wildkings.misc;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Sergii Ivanov
 */
public class RandExperiment
{

    public static void main(String[] args)
    {
        final int N = 1000000;
        plainRandTest(N);
        mod100RandTest(N);
    }

    private static void plainRandTest(int n)
    {
        prn("plainRandTest");
        int[] stats = new int[10];
        Random r = new Random();
        Arrays.fill(stats, 0);
        for (int i = 0; i < n; i++) {
            int v1 = r.nextInt(100);
            int sector = v1 / 10;
            stats[sector]++;
        }
        for (int i = 0; i < stats.length; i++) {
            prn(i + "\t" + stats[i]);
        }
    }

    private static void mod100RandTest(int n)
    {
        prn("mod100RandTest");
        int[] stats = new int[10];
        Random r = new Random();
        Arrays.fill(stats, 0);
        for (int i = 0; i < n; i++) {
            int v1 = r.nextInt(1000);
            int v2 = v1 % 100;
            int sector = v2 / 10;
            stats[sector]++;
        }
        for (int i = 0; i < stats.length; i++) {
            prn(i + "\t" + stats[i]);
        }
    }

    private static void prn(String s)
    {
        System.out.println(s);
    }


}
