package com.tempmail.j;

import android.content.Context;
import androidx.appcompat.app.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.f;
import com.tempmail.utils.m;
import d.a.c0.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CallbackWrapperNetworkError */
public abstract class d<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f12386e = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f12387c;

    /* renamed from: d  reason: collision with root package name */
    private FirebaseAnalytics f12388d;

    public d(Context context) {
        this.f12387c = new WeakReference<>(context);
        this.f12388d = FirebaseAnalytics.getInstance(context);
    }

    public void c(Context context, Throwable th) {
        Response<?> response = ((HttpException) th).response();
        int code = response.code();
        String zVar = response.raw().q().i().toString();
        String str = f12386e;
        m.b(str, "error url " + zVar);
        com.tempmail.utils.d.b(context, this.f12388d, zVar, code);
    }

    public void onError(Throwable th) {
        th.printStackTrace();
        m.b(f12386e, "onError ");
        Context context = (Context) this.f12387c.get();
        if (th instanceof HttpException) {
            m.b(f12386e, "HttpException ");
            if (context != null) {
                c(context, th);
            }
        } else if (th instanceof IOException) {
            m.b(f12386e, "onError IOException");
            if (context instanceof e) {
                m.b(f12386e, "mainActivity instanceof AppCompatActivity ");
                ((f) context).P0(context.getString(R.string.inbox_view_no_connection));
            }
        } else {
            m.b(f12386e, "other error ");
        }
    }
}
