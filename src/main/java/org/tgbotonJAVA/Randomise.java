package org.tgbotonJAVA;

import java.util.Random;
public class Randomise {
    public static int Get_value() {
        Random power = new Random();
        int int_random = power.nextInt(2);
        return int_random;
    }
}


