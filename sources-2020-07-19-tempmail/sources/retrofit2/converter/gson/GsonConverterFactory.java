package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import e.h0;
import e.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class GsonConverterFactory extends Converter.Factory {
    private final Gson gson;

    private GsonConverterFactory(Gson gson2) {
        this.gson = gson2;
    }

    public static GsonConverterFactory create() {
        return create(new Gson());
    }

    public Converter<?, h0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    public Converter<j0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    public static GsonConverterFactory create(Gson gson2) {
        if (gson2 != null) {
            return new GsonConverterFactory(gson2);
        }
        throw new NullPointerException("gson == null");
    }
}
