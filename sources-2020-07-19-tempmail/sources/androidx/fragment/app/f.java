package androidx.fragment.app;

import a.h.j.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback */
public abstract class f<E> extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f1492a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1493b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f1494c;

    /* renamed from: d  reason: collision with root package name */
    final h f1495d;

    f(c cVar) {
        this(cVar, cVar, cVar.f1483d, 0);
    }

    /* access modifiers changed from: package-private */
    public Activity d() {
        return this.f1492a;
    }

    /* access modifiers changed from: package-private */
    public Context e() {
        return this.f1493b;
    }

    /* access modifiers changed from: package-private */
    public h f() {
        return this.f1495d;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.f1494c;
    }

    /* access modifiers changed from: package-private */
    public abstract void h(Fragment fragment);

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract LayoutInflater j();

    public abstract int k();

    public abstract boolean l();

    public abstract void m(Fragment fragment, String[] strArr, int i);

    public abstract boolean n(Fragment fragment);

    public abstract boolean o(String str);

    public abstract void p(Fragment fragment, Intent intent, int i, Bundle bundle);

    public abstract void q();

    f(Activity activity, Context context, Handler handler, int i) {
        this.f1495d = new h();
        this.f1492a = activity;
        h.c(context, "context == null");
        this.f1493b = context;
        h.c(handler, "handler == null");
        this.f1494c = handler;
    }
}
