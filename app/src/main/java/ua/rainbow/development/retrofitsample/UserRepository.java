package ua.rainbow.development.retrofitsample;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * @author Oleg Dokuka
 */
public interface UserRepository {
    @POST("/catchers/55fab7f09412060300001f1f")
    Call<String> get(@Body User user);
}
