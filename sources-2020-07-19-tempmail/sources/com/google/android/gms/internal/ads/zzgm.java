package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzgm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    protected final zzex f8700b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8701c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8702d;

    /* renamed from: e  reason: collision with root package name */
    protected final zzcf.zza.C0074zza f8703e;

    /* renamed from: f  reason: collision with root package name */
    protected Method f8704f;
    private final int g;
    private final int h;

    public zzgm(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i, int i2) {
        getClass().getSimpleName();
        this.f8700b = zzex;
        this.f8701c = str;
        this.f8702d = str2;
        this.f8703e = zza;
        this.g = i;
        this.h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            Method e2 = this.f8700b.e(this.f8701c, this.f8702d);
            this.f8704f = e2;
            if (e2 == null) {
                return null;
            }
            a();
            zzdu w = this.f8700b.w();
            if (!(w == null || this.g == Integer.MIN_VALUE)) {
                w.b(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
