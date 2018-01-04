package ApiConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shubhransu on 17-Aug-17.
 */

public class ApiClient {

    public static final String BASE_URL="https://androidtutorialpoint.com/api/";
    public static Retrofit retrofit=null;

    private ApiClient(){}

    public static Retrofit getApiClient()
    {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
