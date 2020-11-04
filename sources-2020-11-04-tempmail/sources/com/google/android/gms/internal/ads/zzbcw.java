package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbcw {

    /* renamed from: a  reason: collision with root package name */
    private final long f6344a = TimeUnit.MILLISECONDS.toNanos(((Long) zzwg.e().c(zzaav.v)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f6345b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6346c = true;

    zzbcw() {
    }

    public final void a(SurfaceTexture surfaceTexture, zzbcj zzbcj) {
        if (zzbcj != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f6346c || Math.abs(timestamp - this.f6345b) >= this.f6344a) {
                this.f6346c = false;
                this.f6345b = timestamp;
                zzaye.h.post(new n7(this, zzbcj));
            }
        }
    }

    public final void b() {
        this.f6346c = true;
    }
}
