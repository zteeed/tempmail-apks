package com.tempmail.l;

import android.content.Context;
import androidx.appcompat.app.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.a.c0.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import retrofit2.HttpException;

/* compiled from: FreeCallbackWrapper */
public abstract class d<T> extends c<T> {

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f12916c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12917d = false;

    public d(Context context) {
        this.f12916c = new WeakReference<>(context);
        FirebaseAnalytics.getInstance(context);
    }

    public abstract void c(Throwable th);

    public abstract void d(Throwable th);

    public void onError(Throwable th) {
        th.printStackTrace();
        Context context = (Context) this.f12916c.get();
        if (th instanceof HttpException) {
            d(th);
            if (context != null) {
                com.tempmail.utils.d.k(context, th);
            }
        } else if (th instanceof IOException) {
            if ((context instanceof e) || this.f12917d) {
                c(th);
            }
            if (context != null) {
                com.tempmail.utils.d.l(context, th);
            }
        } else {
            d(th);
        }
    }
}
