package com.tempmail.l;

import android.content.Context;
import androidx.appcompat.app.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.h;
import com.tempmail.utils.d;
import com.tempmail.utils.m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CallbackWrapper */
public abstract class c<T> extends d.a.c0.c<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f12913e = "c";

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f12914c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12915d = false;

    public c(Context context) {
        this.f12914c = new WeakReference<>(context);
        FirebaseAnalytics.getInstance(context);
    }

    public abstract void c(Throwable th);

    public abstract void d(Throwable th);

    public void e(Response response) {
        m.b(f12913e, "process error");
        Context context = (Context) this.f12914c.get();
        try {
            if ((context instanceof e) && response.code() != 404) {
                String string = context.getString(R.string.message_title_error);
                ((h) context).O0(string, response.code() + " " + response.message());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onError(Throwable th) {
        th.printStackTrace();
        Context context = (Context) this.f12914c.get();
        if (th instanceof HttpException) {
            d(th);
            if (context != null) {
                d.k(context, th);
            }
            e(((HttpException) th).response());
        } else if (!(th instanceof IOException)) {
            d(th);
        } else if ((context instanceof e) || this.f12915d) {
            c(th);
            if (context != null) {
                d.l(context, th);
            }
        }
    }

    public c(boolean z, Context context) {
        this.f12915d = z;
        this.f12914c = new WeakReference<>(context);
        FirebaseAnalytics.getInstance(context);
    }
}
