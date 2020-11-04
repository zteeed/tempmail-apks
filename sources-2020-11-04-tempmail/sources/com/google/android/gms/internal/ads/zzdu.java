package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzdu {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final ConditionVariable f8589c = new ConditionVariable();

    /* renamed from: d  reason: collision with root package name */
    protected static volatile zztr f8590d = null;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Random f8591e = null;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public zzex f8592a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile Boolean f8593b;

    public zzdu(zzex zzex) {
        this.f8592a = zzex;
        zzex.r().execute(new pz(this));
    }

    public static int e() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return f().nextInt();
        } catch (RuntimeException unused) {
            return f().nextInt();
        }
    }

    private static Random f() {
        if (f8591e == null) {
            synchronized (zzdu.class) {
                if (f8591e == null) {
                    f8591e = new Random();
                }
            }
        }
        return f8591e;
    }

    public final void b(int i, int i2, long j) {
        d(i, i2, j, (String) null, (Exception) null);
    }

    public final void c(int i, int i2, long j, String str) {
        d(i, -1, j, str, (Exception) null);
    }

    public final void d(int i, int i2, long j, String str, Exception exc) {
        try {
            f8589c.block();
            if (this.f8593b.booleanValue() && f8590d != null) {
                zzbw.zza.C0070zza X = zzbw.zza.X();
                X.y(this.f8592a.f8852a.getPackageName());
                X.x(j);
                if (str != null) {
                    X.D(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    zzeea.a(exc, new PrintWriter(stringWriter));
                    X.z(stringWriter.toString());
                    X.C(exc.getClass().getName());
                }
                zztv a2 = f8590d.a(((zzbw.zza) ((zzegb) X.O())).g());
                a2.b(i);
                if (i2 != -1) {
                    a2.a(i2);
                }
                a2.c();
            }
        } catch (Exception unused) {
        }
    }
}
