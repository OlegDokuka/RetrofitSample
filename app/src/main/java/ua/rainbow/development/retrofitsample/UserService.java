package ua.rainbow.development.retrofitsample;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Body;

/**
 * @author Oleg Dokuka
 */
public class UserService implements UserRepository {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.google.com.ua")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private UserRepository userRepository = retrofit.create(UserRepository.class);

    @Override
    public Call<String> get(@Body User user) {
        return userRepository.get(user);
    }
}
