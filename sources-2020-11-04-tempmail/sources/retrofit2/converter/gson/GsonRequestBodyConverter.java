package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import e.b0;
import e.h0;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okio.Buffer;
import retrofit2.Converter;

final class GsonRequestBodyConverter<T> implements Converter<T, h0> {
    private static final b0 MEDIA_TYPE = b0.c("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonRequestBodyConverter(Gson gson2, TypeAdapter<T> typeAdapter) {
        this.gson = gson2;
        this.adapter = typeAdapter;
    }

    public h0 convert(T t) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), UTF_8));
        this.adapter.write(newJsonWriter, t);
        newJsonWriter.close();
        return h0.create(MEDIA_TYPE, buffer.readByteString());
    }
}
