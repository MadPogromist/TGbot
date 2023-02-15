package org.tgbotonJAVA;
import java.util.Scanner;

public class RockPaperScissors {
    public static String Play(String user_input) {
        int Get_Random = Randomise.Get_value();
        String res = WinCalc.Calc(Get_Random, user_input);
        return res;

    }

}
