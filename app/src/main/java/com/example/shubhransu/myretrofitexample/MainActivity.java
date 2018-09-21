package com.example.shubhransu.myretrofitexample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ApiConfig.ApiClient;
import ApiConfig.ApiInterface;
import Model.StudentDetails;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
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
        result = findViewById(R.id.result);
        pb = findViewById(R.id.progressBar);

        apiinterface = ApiClient.getApiClient().create(ApiInterface.class);
        apiinterface.getDetailsOfStudent()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<StudentDetails>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<StudentDetails> studentDetails) {
                        pb.setVisibility(View.GONE);
                        result.setVisibility(View.VISIBLE);
                        result.setText(studentDetails != null ? studentDetails.toString() : null);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}