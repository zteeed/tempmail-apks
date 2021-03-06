package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.b;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class n0 implements l0 {

    /* renamed from: c  reason: collision with root package name */
    private static n0 f9643c;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Context f9644a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f9645b;

    private n0(Context context) {
        this.f9644a = context;
        this.f9645b = new o0(this, (Handler) null);
        context.getContentResolver().registerContentObserver(zzcg.f9757a, true, this.f9645b);
    }

    static n0 a(Context context) {
        n0 n0Var;
        synchronized (n0.class) {
            if (f9643c == null) {
                f9643c = b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new n0(context) : new n0();
            }
            n0Var = f9643c;
        }
        return n0Var;
    }

    static synchronized void b() {
        synchronized (n0.class) {
            if (!(f9643c == null || f9643c.f9644a == null || f9643c.f9645b == null)) {
                f9643c.f9644a.getContentResolver().unregisterContentObserver(f9643c.f9645b);
            }
            f9643c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String g(String str) {
        if (this.f9644a == null) {
            return null;
        }
        try {
            return (String) zzco.a(new m0(this, str));
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return zzcg.a(this.f9644a.getContentResolver(), str, (String) null);
    }

    private n0() {
        this.f9644a = null;
        this.f9645b = null;
    }
}
