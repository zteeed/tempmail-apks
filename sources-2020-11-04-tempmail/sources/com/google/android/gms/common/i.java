package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
class i {

    /* renamed from: d  reason: collision with root package name */
    private static final i f3133d = new i(true, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f3134a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3135b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f3136c;

    i(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f3134a = z;
        this.f3135b = str;
        this.f3136c = th;
    }

    static i b(String str, Throwable th) {
        return new i(false, str, th);
    }

    static i c(Callable<String> callable) {
        return new k(callable);
    }

    static i d(String str) {
        return new i(false, str, (Throwable) null);
    }

    static String e(String str, c cVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, Hex.a(AndroidUtilsLight.b("SHA-1").digest(cVar.V())), Boolean.valueOf(z), "12451009.false"});
    }

    static i f() {
        return f3133d;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String a() {
        return this.f3135b;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.f3134a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f3136c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f3136c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
