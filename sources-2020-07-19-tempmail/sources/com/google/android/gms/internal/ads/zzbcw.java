package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbcw {

    /* renamed from: a  reason: collision with root package name */
    private final long f6161a = TimeUnit.MILLISECONDS.toNanos(((Long) zzwg.e().c(zzaav.v)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f6162b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6163c = true;

    zzbcw() {
    }

    public final void a(SurfaceTexture surfaceTexture, zzbcj zzbcj) {
        if (zzbcj != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f6163c || Math.abs(timestamp - this.f6162b) >= this.f6161a) {
                this.f6163c = false;
                this.f6162b = timestamp;
                zzaye.h.post(new n7(this, zzbcj));
            }
        }
    }

    public final void b() {
        this.f6163c = true;
    }
}
