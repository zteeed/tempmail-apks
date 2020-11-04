package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class r3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f4773a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzarl f4774b;

    r3(zzarl zzarl, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4774b = zzarl;
        this.f4773a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f4774b.e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4773a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f4773a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
