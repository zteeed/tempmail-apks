package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cb0 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AudioTrack f3538b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zziq f3539c;

    cb0(zziq zziq, AudioTrack audioTrack) {
        this.f3539c = zziq;
        this.f3538b = audioTrack;
    }

    public final void run() {
        try {
            this.f3538b.flush();
            this.f3538b.release();
        } finally {
            this.f3539c.f8768f.open();
        }
    }
}
