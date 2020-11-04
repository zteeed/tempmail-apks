package com.tempmail.j;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.utils.d;
import com.tempmail.utils.m;
import d.a.c0.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: FreeCallbackWrapper */
public abstract class e<T> extends c<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12389f = "e";

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f12390c;

    /* renamed from: d  reason: collision with root package name */
    private FirebaseAnalytics f12391d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12392e = false;

    public e(Context context) {
        this.f12390c = new WeakReference<>(context);
        this.f12391d = FirebaseAnalytics.getInstance(context);
    }

    public abstract void c();

    public abstract void d(Throwable th);

    public void e(Context context, Throwable th) {
        Response<?> response = ((HttpException) th).response();
        int code = response.code();
        String zVar = response.raw().q().i().toString();
        String str = f12389f;
        m.b(str, "error url " + zVar);
        d.b(context, this.f12391d, zVar, code);
    }

    public void onError(Throwable th) {
        th.printStackTrace();
        Context context = (Context) this.f12390c.get();
        if (th instanceof HttpException) {
            d(th);
            if (context != null) {
                e(context, th);
            }
        } else if (!(th instanceof IOException)) {
            d(th);
        } else if ((context instanceof androidx.appcompat.app.e) || this.f12392e) {
            c();
        }
    }
}
