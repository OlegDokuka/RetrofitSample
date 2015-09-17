package ua.rainbow.development.retrofitsample;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * @author Oleg Dokuka
 */
public interface UserRepository {
    @GET("/get")
    Call<Object> get();

    @PUT("/put")
    Call<Object> put(@Body User user);

    @POST("/put")
    Call<Object> post(@Body User user);
}
