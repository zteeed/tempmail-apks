package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzgm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    protected final zzex f8883b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8884c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8885d;

    /* renamed from: e  reason: collision with root package name */
    protected final zzcf.zza.C0073zza f8886e;

    /* renamed from: f  reason: collision with root package name */
    protected Method f8887f;
    private final int g;
    private final int h;

    public zzgm(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i, int i2) {
        getClass().getSimpleName();
        this.f8883b = zzex;
        this.f8884c = str;
        this.f8885d = str2;
        this.f8886e = zza;
        this.g = i;
        this.h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            Method e2 = this.f8883b.e(this.f8884c, this.f8885d);
            this.f8887f = e2;
            if (e2 == null) {
                return null;
            }
            a();
            zzdu w = this.f8883b.w();
            if (!(w == null || this.g == Integer.MIN_VALUE)) {
                w.b(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
