package retrofit2;

import e.e0;
import e.g0;
import e.i0;
import e.j0;
import e.y;
import java.util.Objects;
import javax.annotation.Nullable;
import retrofit2.OkHttpCall;

public final class Response<T> {
    @Nullable
    private final T body;
    @Nullable
    private final j0 errorBody;
    private final i0 rawResponse;

    private Response(i0 i0Var, @Nullable T t, @Nullable j0 j0Var) {
        this.rawResponse = i0Var;
        this.body = t;
        this.errorBody = j0Var;
    }

    public static <T> Response<T> error(int i, j0 j0Var) {
        Objects.requireNonNull(j0Var, "body == null");
        if (i >= 400) {
            i0.a aVar = new i0.a();
            aVar.b(new OkHttpCall.NoContentResponseBody(j0Var.contentType(), j0Var.contentLength()));
            aVar.g(i);
            aVar.l("Response.error()");
            aVar.o(e0.HTTP_1_1);
            g0.a aVar2 = new g0.a();
            aVar2.h("http://localhost/");
            aVar.q(aVar2.a());
            return error(j0Var, aVar.c());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> success(@Nullable T t) {
        i0.a aVar = new i0.a();
        aVar.g(200);
        aVar.l("OK");
        aVar.o(e0.HTTP_1_1);
        g0.a aVar2 = new g0.a();
        aVar2.h("http://localhost/");
        aVar.q(aVar2.a());
        return success(t, aVar.c());
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.d();
    }

    @Nullable
    public j0 errorBody() {
        return this.errorBody;
    }

    public y headers() {
        return this.rawResponse.h();
    }

    public boolean isSuccessful() {
        return this.rawResponse.k();
    }

    public String message() {
        return this.rawResponse.m();
    }

    public i0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i < 200 || i >= 300) {
            throw new IllegalArgumentException("code < 200 or >= 300: " + i);
        }
        i0.a aVar = new i0.a();
        aVar.g(i);
        aVar.l("Response.success()");
        aVar.o(e0.HTTP_1_1);
        g0.a aVar2 = new g0.a();
        aVar2.h("http://localhost/");
        aVar.q(aVar2.a());
        return success(t, aVar.c());
    }

    public static <T> Response<T> error(j0 j0Var, i0 i0Var) {
        Objects.requireNonNull(j0Var, "body == null");
        Objects.requireNonNull(i0Var, "rawResponse == null");
        if (!i0Var.k()) {
            return new Response<>(i0Var, (Object) null, j0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t, y yVar) {
        Objects.requireNonNull(yVar, "headers == null");
        i0.a aVar = new i0.a();
        aVar.g(200);
        aVar.l("OK");
        aVar.o(e0.HTTP_1_1);
        aVar.j(yVar);
        g0.a aVar2 = new g0.a();
        aVar2.h("http://localhost/");
        aVar.q(aVar2.a());
        return success(t, aVar.c());
    }

    public static <T> Response<T> success(@Nullable T t, i0 i0Var) {
        Objects.requireNonNull(i0Var, "rawResponse == null");
        if (i0Var.k()) {
            return new Response<>(i0Var, t, (j0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
