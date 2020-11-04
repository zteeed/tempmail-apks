package retrofit2.adapter.rxjava2;

import d.a.b;
import d.a.f;
import d.a.h;
import d.a.l;
import d.a.t;
import d.a.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    @Nullable
    private final t scheduler;

    private RxJava2CallAdapterFactory(@Nullable t tVar, boolean z) {
        this.scheduler = tVar;
        this.isAsync = z;
    }

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory((t) null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory((t) null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(t tVar) {
        if (tVar != null) {
            return new RxJava2CallAdapterFactory(tVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == b.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z3 = rawType == f.class;
        boolean z4 = rawType == u.class;
        boolean z5 = rawType == h.class;
        if (rawType != l.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType2 == Response.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z2 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 != Result.class) {
            type2 = parameterUpperBound;
            z2 = false;
            z = true;
            return new RxJava2CallAdapter(type2, this.scheduler, this.isAsync, z2, z, z3, z4, z5, false);
        } else if (parameterUpperBound instanceof ParameterizedType) {
            type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z2 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z = false;
        return new RxJava2CallAdapter(type2, this.scheduler, this.isAsync, z2, z, z3, z4, z5, false);
    }
}
