package cl.desafiolatam.preguntadinamica.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Quetion {

    private String category, type, difficulty, question;
    @SerializedName("correct_answer")
    private boolean correctAnswer;
    // private boolean []incorrect_answers;
    @SerializedName("incorrect_answers")
    private List<Boolean> incorrectAnswers;

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public List<Boolean> getIncorrectAnswers() {
        return incorrectAnswers;
    }
}
