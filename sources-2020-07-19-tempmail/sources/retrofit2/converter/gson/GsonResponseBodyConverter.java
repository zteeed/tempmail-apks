package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import e.j0;
import java.io.IOException;
import retrofit2.Converter;

final class GsonResponseBodyConverter<T> implements Converter<j0, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonResponseBodyConverter(Gson gson2, TypeAdapter<T> typeAdapter) {
        this.gson = gson2;
        this.adapter = typeAdapter;
    }

    public T convert(j0 j0Var) throws IOException {
        JsonReader newJsonReader = this.gson.newJsonReader(j0Var.charStream());
        try {
            T read = this.adapter.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            j0Var.close();
        }
    }
}
