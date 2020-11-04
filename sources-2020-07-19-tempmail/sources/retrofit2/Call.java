package retrofit2;

import e.g0;
import java.io.IOException;
import okio.Timeout;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    g0 request();

    Timeout timeout();
}
