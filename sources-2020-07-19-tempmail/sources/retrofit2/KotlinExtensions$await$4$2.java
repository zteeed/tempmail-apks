package retrofit2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/KotlinExtensions$await$4$2", "Lretrofit2/Callback;", "Lretrofit2/Call;", "call", "", "t", "", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "Lretrofit2/Response;", "response", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "retrofit"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$await$4$2 implements Callback<T> {
    final /* synthetic */ CancellableContinuation $continuation;

    KotlinExtensions$await$4$2(CancellableContinuation cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    public void onFailure(@NotNull Call<T> call, @NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(call, "call");
        Intrinsics.checkParameterIsNotNull(th, "t");
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
    }

    public void onResponse(@NotNull Call<T> call, @NotNull Response<T> response) {
        Intrinsics.checkParameterIsNotNull(call, "call");
        Intrinsics.checkParameterIsNotNull(response, "response");
        if (response.isSuccessful()) {
            T body = response.body();
            Result.Companion companion = Result.Companion;
            this.$continuation.resumeWith(Result.constructor-impl(body));
            return;
        }
        HttpException httpException = new HttpException(response);
        Result.Companion companion2 = Result.Companion;
        this.$continuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(httpException)));
    }
}
