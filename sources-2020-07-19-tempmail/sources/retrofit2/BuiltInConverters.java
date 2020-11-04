package retrofit2;

import e.h0;
import e.j0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import retrofit2.Converter;
import retrofit2.http.Streaming;

final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    static final class BufferingResponseBodyConverter implements Converter<j0, j0> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        public j0 convert(j0 j0Var) throws IOException {
            try {
                return Utils.buffer(j0Var);
            } finally {
                j0Var.close();
            }
        }
    }

    static final class RequestBodyConverter implements Converter<h0, h0> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        public h0 convert(h0 h0Var) {
            return h0Var;
        }
    }

    static final class StreamingResponseBodyConverter implements Converter<j0, j0> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        public j0 convert(j0 j0Var) {
            return j0Var;
        }
    }

    static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class UnitResponseBodyConverter implements Converter<j0, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        public Unit convert(j0 j0Var) {
            j0Var.close();
            return Unit.INSTANCE;
        }
    }

    static final class VoidResponseBodyConverter implements Converter<j0, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        public Void convert(j0 j0Var) {
            j0Var.close();
            return null;
        }
    }

    BuiltInConverters() {
    }

    @Nullable
    public Converter<?, h0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (h0.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Nullable
    public Converter<j0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == j0.class) {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class)) {
                return StreamingResponseBodyConverter.INSTANCE;
            }
            return BufferingResponseBodyConverter.INSTANCE;
        } else if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        } else {
            if (!this.checkForKotlinUnit || type != Unit.class) {
                return null;
            }
            try {
                return UnitResponseBodyConverter.INSTANCE;
            } catch (NoClassDefFoundError unused) {
                this.checkForKotlinUnit = false;
                return null;
            }
        }
    }
}
