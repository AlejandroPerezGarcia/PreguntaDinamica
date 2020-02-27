package cl.desafiolatam.preguntadinamica.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("response_code")
    private int responseCode;
    private List<Quetion> results;

    public int getResponseCode() {
        return responseCode;
    }

    public List<Quetion> getResults() {
        return results;
    }
}
