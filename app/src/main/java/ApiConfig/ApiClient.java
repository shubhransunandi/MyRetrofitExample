package ApiConfig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shubhransu on 17-Aug-17.
 */

public class ApiClient {

    public static final String BASE_URL = "https://androidtutorialpoint.com/api/";
    public static Retrofit retrofit = null;

    private ApiClient() {
    }

    public static Retrofit getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory
                            .create(
                                    new GsonBuilder()
                                            .setLenient()
                                            .create()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
