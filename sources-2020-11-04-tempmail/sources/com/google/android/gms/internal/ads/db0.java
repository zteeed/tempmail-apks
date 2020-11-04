package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class db0 extends eb0 {
    private final AudioTimestamp j = new AudioTimestamp();
    private long k;
    private long l;
    private long m;

    public db0() {
        super((cb0) null);
    }

    public final void b(AudioTrack audioTrack, boolean z) {
        super.b(audioTrack, z);
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    public final boolean d() {
        boolean timestamp = this.f3892a.getTimestamp(this.j);
        if (timestamp) {
            long j2 = this.j.framePosition;
            if (this.l > j2) {
                this.k++;
            }
            this.l = j2;
            this.m = j2 + (this.k << 32);
        }
        return timestamp;
    }

    public final long e() {
        return this.j.nanoTime;
    }

    public final long f() {
        return this.m;
    }
}
