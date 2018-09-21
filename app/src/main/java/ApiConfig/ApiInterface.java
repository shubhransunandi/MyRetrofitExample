package ApiConfig;

import java.util.List;

import Model.StudentDetails;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Shubhransu on 17-Aug-17.
 */
//https://androidtutorialpoint.com/api/RetrofitAndroidObjectResponse
//https://androidtutorialpoint.com/api/RetrofitAndroidArrayResponse

public interface ApiInterface {

    @GET("RetrofitAndroidArrayResponse")
    Observable<List<StudentDetails>> getDetailsOfStudent();
}
