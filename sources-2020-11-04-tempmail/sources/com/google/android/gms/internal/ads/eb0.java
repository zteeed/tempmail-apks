package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class eb0 {

    /* renamed from: a  reason: collision with root package name */
    protected AudioTrack f3892a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3893b;

    /* renamed from: c  reason: collision with root package name */
    private int f3894c;

    /* renamed from: d  reason: collision with root package name */
    private long f3895d;

    /* renamed from: e  reason: collision with root package name */
    private long f3896e;

    /* renamed from: f  reason: collision with root package name */
    private long f3897f;
    private long g;
    private long h;
    private long i;

    private eb0() {
    }

    public final void a() {
        if (this.g == -9223372036854775807L) {
            this.f3892a.pause();
        }
    }

    public void b(AudioTrack audioTrack, boolean z) {
        this.f3892a = audioTrack;
        this.f3893b = z;
        this.g = -9223372036854775807L;
        this.f3895d = 0;
        this.f3896e = 0;
        this.f3897f = 0;
        if (audioTrack != null) {
            this.f3894c = audioTrack.getSampleRate();
        }
    }

    public final void c(long j) {
        this.h = g();
        this.g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f3892a.stop();
    }

    public boolean d() {
        return false;
    }

    public long e() {
        throw new UnsupportedOperationException();
    }

    public long f() {
        throw new UnsupportedOperationException();
    }

    public final long g() {
        if (this.g != -9223372036854775807L) {
            return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * ((long) this.f3894c)) / 1000000));
        }
        int playState = this.f3892a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f3892a.getPlaybackHeadPosition());
        if (this.f3893b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f3897f = this.f3895d;
            }
            playbackHeadPosition += this.f3897f;
        }
        if (this.f3895d > playbackHeadPosition) {
            this.f3896e++;
        }
        this.f3895d = playbackHeadPosition;
        return playbackHeadPosition + (this.f3896e << 32);
    }

    public final long h() {
        return (g() * 1000000) / ((long) this.f3894c);
    }

    /* synthetic */ eb0(cb0 cb0) {
        this();
    }
}
