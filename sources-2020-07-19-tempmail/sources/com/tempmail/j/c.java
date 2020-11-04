package com.tempmail.j;

import android.content.Context;
import androidx.appcompat.app.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.f;
import com.tempmail.utils.d;
import com.tempmail.utils.m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CallbackWrapper */
public abstract class c<T> extends d.a.c0.c<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12382f = "c";

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f12383c;

    /* renamed from: d  reason: collision with root package name */
    private FirebaseAnalytics f12384d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12385e = false;

    public c(Context context) {
        this.f12383c = new WeakReference<>(context);
        this.f12384d = FirebaseAnalytics.getInstance(context);
    }

    public abstract void c();

    public abstract void d(Throwable th);

    public void e(Response response) {
        m.b(f12382f, "process error");
        Context context = (Context) this.f12383c.get();
        try {
            if (context instanceof e) {
                String string = context.getString(R.string.message_title_error);
                ((f) context).Q0(string, response.code() + " " + response.message());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void f(Context context, Throwable th) {
        Response<?> response = ((HttpException) th).response();
        int code = response.code();
        String zVar = response.raw().q().i().toString();
        String str = f12382f;
        m.b(str, "error url " + zVar);
        d.b(context, this.f12384d, zVar, code);
    }

    public void onError(Throwable th) {
        th.printStackTrace();
        Context context = (Context) this.f12383c.get();
        if (th instanceof HttpException) {
            d(th);
            if (context != null) {
                f(context, th);
            }
            e(((HttpException) th).response());
        } else if (!(th instanceof IOException)) {
            d(th);
        } else if ((context instanceof e) || this.f12385e) {
            c();
        }
    }

    public c(boolean z, Context context) {
        this.f12385e = z;
        this.f12383c = new WeakReference<>(context);
        this.f12384d = FirebaseAnalytics.getInstance(context);
    }
}
