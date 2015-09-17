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
            .baseUrl("http://httpbin.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private UserRepository userRepository = retrofit.create(UserRepository.class);

    @Override
    public Call<Object> get() {
        return userRepository.get();
    }

    @Override
    public Call<Object> put(@Body User user) {
        return userRepository.put(user);
    }

    @Override
    public Call<Object> post(@Body User user) {
        return userRepository.post(user);
    }
}
