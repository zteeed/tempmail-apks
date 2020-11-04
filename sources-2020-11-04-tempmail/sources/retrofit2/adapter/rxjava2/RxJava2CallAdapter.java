package retrofit2.adapter.rxjava2;

import d.a.t;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;

final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    @Nullable
    private final t scheduler;

    RxJava2CallAdapter(Type type, @Nullable t tVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = tVar;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isFlowable = z4;
        this.isSingle = z5;
        this.isMaybe = z6;
        this.isCompletable = z7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object adapt(retrofit2.Call<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.isAsync
            if (r0 == 0) goto L_0x000a
            retrofit2.adapter.rxjava2.CallEnqueueObservable r0 = new retrofit2.adapter.rxjava2.CallEnqueueObservable
            r0.<init>(r2)
            goto L_0x000f
        L_0x000a:
            retrofit2.adapter.rxjava2.CallExecuteObservable r0 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r0.<init>(r2)
        L_0x000f:
            boolean r2 = r1.isResult
            if (r2 == 0) goto L_0x001a
            retrofit2.adapter.rxjava2.ResultObservable r2 = new retrofit2.adapter.rxjava2.ResultObservable
            r2.<init>(r0)
        L_0x0018:
            r0 = r2
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1.isBody
            if (r2 == 0) goto L_0x0024
            retrofit2.adapter.rxjava2.BodyObservable r2 = new retrofit2.adapter.rxjava2.BodyObservable
            r2.<init>(r0)
            goto L_0x0018
        L_0x0024:
            d.a.t r2 = r1.scheduler
            if (r2 == 0) goto L_0x002c
            d.a.l r0 = r0.subscribeOn(r2)
        L_0x002c:
            boolean r2 = r1.isFlowable
            if (r2 == 0) goto L_0x0037
            d.a.a r2 = d.a.a.LATEST
            d.a.f r2 = r0.toFlowable(r2)
            return r2
        L_0x0037:
            boolean r2 = r1.isSingle
            if (r2 == 0) goto L_0x0040
            d.a.u r2 = r0.singleOrError()
            return r2
        L_0x0040:
            boolean r2 = r1.isMaybe
            if (r2 == 0) goto L_0x0049
            d.a.h r2 = r0.singleElement()
            return r2
        L_0x0049:
            boolean r2 = r1.isCompletable
            if (r2 == 0) goto L_0x0052
            d.a.b r2 = r0.ignoreElements()
            return r2
        L_0x0052:
            d.a.l r2 = d.a.d0.a.n(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.RxJava2CallAdapter.adapt(retrofit2.Call):java.lang.Object");
    }

    public Type responseType() {
        return this.responseType;
    }
}
