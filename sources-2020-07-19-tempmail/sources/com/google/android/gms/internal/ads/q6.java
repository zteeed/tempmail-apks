package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q6 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f4692b = new AtomicInteger(1);

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4693c;

    q6(String str) {
        this.f4693c = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f4693c;
        int andIncrement = this.f4692b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}