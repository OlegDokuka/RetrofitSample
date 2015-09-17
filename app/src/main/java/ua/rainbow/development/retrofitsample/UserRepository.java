package ua.rainbow.development.retrofitsample;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * @author Oleg Dokuka
 */
public interface UserRepository {
    @POST("/")
    Call<String> get(@Body User user);
}
