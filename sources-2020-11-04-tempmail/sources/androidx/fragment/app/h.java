package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: FragmentHostCallback */
public abstract class h<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f1529b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1530c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f1531d;

    /* renamed from: e  reason: collision with root package name */
    final k f1532e;

    h(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    public View b(int i) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f1529b;
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.f1530c;
    }

    /* access modifiers changed from: package-private */
    public Handler h() {
        return this.f1531d;
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment) {
    }

    public abstract E j();

    public LayoutInflater k() {
        return LayoutInflater.from(this.f1530c);
    }

    public void l(Fragment fragment, String[] strArr, int i) {
    }

    public boolean m(Fragment fragment) {
        return true;
    }

    public boolean n(String str) {
        return false;
    }

    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1530c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void p() {
    }

    h(Activity activity, Context context, Handler handler, int i) {
        this.f1532e = new l();
        this.f1529b = activity;
        a.h.j.h.c(context, "context == null");
        this.f1530c = context;
        a.h.j.h.c(handler, "handler == null");
        this.f1531d = handler;
    }
}
