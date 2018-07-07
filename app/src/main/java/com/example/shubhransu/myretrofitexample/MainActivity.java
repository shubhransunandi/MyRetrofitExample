package com.example.shubhransu.myretrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import ApiConfig.ApiClient;
import ApiConfig.ApiInterface;
import Model.StudentDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiinterface;
    TextView result;
    ProgressBar pb;

    // Shubhransu Shekhar Nandi babuni

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= (TextView) findViewById(R.id.result);
        pb= (ProgressBar) findViewById(R.id.progressBar);

        apiinterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<StudentDetails> call = apiinterface.getDetailsOfStudent();

        call.enqueue(new Callback<StudentDetails>() {
            @Override
            public void onResponse(Call<StudentDetails> call, Response<StudentDetails> response) {
                pb.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                StudentDetails students = response.body();
                if(students!=null) {
                    result.setText(students.toString());
                }
                Toast.makeText(MainActivity.this, "Job is Successfull", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Rourkela is my hometown", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Sundargarh", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Staying at Banglore", Toast.LENGTH_SHORT).show();

                }

            @Override
            public void onFailure(Call<StudentDetails> call, Throwable t) {
                Toast.makeText(MainActivity.this, "There is an Error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}