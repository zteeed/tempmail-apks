package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbag {

    /* renamed from: a  reason: collision with root package name */
    private long f6096a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private long f6097b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6098c = new Object();

    public zzbag(long j) {
        this.f6096a = j;
    }

    public final boolean a() {
        synchronized (this.f6098c) {
            long b2 = zzq.zzld().b();
            if (this.f6097b + this.f6096a > b2) {
                return false;
            }
            this.f6097b = b2;
            return true;
        }
    }

    public final void b(long j) {
        synchronized (this.f6098c) {
            this.f6096a = j;
        }
    }
}
