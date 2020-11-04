package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class v3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f10462a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzfv f10463b;

    public v3(zzfv zzfv, String str) {
        this.f10463b = zzfv;
        Preconditions.k(str);
        this.f10462a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f10463b.h().G().b(this.f10462a, th);
    }
}
