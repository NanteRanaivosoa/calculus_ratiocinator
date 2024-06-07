package org.example.calculus_ratiocinator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Affirmation {
    private String corps;
    private String condition;

    public static String isFalseOrTrue(Affirmation affirmation1, Affirmation affirmation2){
        if (affirmation1.getCondition().equals("VRAIE") || affirmation2.getCondition().equals("VRAIE")){
            return "VRAIE";
        }
        return "FAUSSE";
    }

    public static String isFalseOrTrueAnd(Affirmation affirmation1, Affirmation affirmation2){
        if (affirmation1.getCondition().equals("VRAIE") && affirmation2.getCondition().equals("VRAIE")){
            return "VRAIE";
        }
        return "FAUSSE";
    }

    public static String IsFalseOrTrueThusResult(Affirmation affirmation1, Affirmation affirmation2){
        if (affirmation1.getCondition().equals("VRAIE") && affirmation2.getCondition().equals("FAUSSE")){
            return "FAUSSE";
        }
        return "VRAIE";
    }
}
