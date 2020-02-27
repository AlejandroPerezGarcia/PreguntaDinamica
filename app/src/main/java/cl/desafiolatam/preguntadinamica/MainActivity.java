package cl.desafiolatam.preguntadinamica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


import java.util.List;

import cl.desafiolatam.preguntadinamica.api.Api;
import cl.desafiolatam.preguntadinamica.api.RetrofitClient;
import cl.desafiolatam.preguntadinamica.models.Quetion;
import cl.desafiolatam.preguntadinamica.models.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mostrar fracment en activiti
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment())
                .commit();
        Api apiservice = RetrofitClient.getRetrofitInstance().create(Api.class);
        Call<Result> call = apiservice.getAllQuestions();
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
               List<Quetion> quetionList = response.body().getResults();

                Toast.makeText(MainActivity.this, quetionList.get(0).getQuestion(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
    }
}
