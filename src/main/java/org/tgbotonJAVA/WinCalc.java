package org.tgbotonJAVA;

import java.util.Objects;

public class WinCalc {
    // 0 = Rock
    // 1 = Scissors
    // 2 = Paper
    public static String Calc(int Randomed, String user_input){
        String output = "";
        switch (Randomed) {
            case 0 -> { // pc rock
                if (!user_input.equals("Scissors") && !user_input.equals("Rock"))
                    output = "You win";
                else if (Objects.equals(user_input, "Rock"))
                    output = "Draw";
                else
                    output = "You lost";
            }
            case 1 -> { // pc scissors
                if (!user_input.equals("Paper") && !user_input.equals("Scissors"))
                    output = "You win";
                else if (Objects.equals(user_input, "Scissors"))
                    output = "Draw";
                else
                    output = "You lost";
            }
            case 2 -> { // pc paper
                if (!user_input.equals("Rock") && !user_input.equals("Paper"))
                    output = "You win";
                else if (Objects.equals(user_input, "Paper"))
                    output = "Draw";
                else
                    output = "You lost";
            }
            default -> {
                output = "Wrong input";
            }
        }
        return output;
    }

}
