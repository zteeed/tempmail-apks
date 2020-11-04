package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class eb0 {

    /* renamed from: a  reason: collision with root package name */
    protected AudioTrack f3709a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3710b;

    /* renamed from: c  reason: collision with root package name */
    private int f3711c;

    /* renamed from: d  reason: collision with root package name */
    private long f3712d;

    /* renamed from: e  reason: collision with root package name */
    private long f3713e;

    /* renamed from: f  reason: collision with root package name */
    private long f3714f;
    private long g;
    private long h;
    private long i;

    private eb0() {
    }

    public final void a() {
        if (this.g == -9223372036854775807L) {
            this.f3709a.pause();
        }
    }

    public void b(AudioTrack audioTrack, boolean z) {
        this.f3709a = audioTrack;
        this.f3710b = z;
        this.g = -9223372036854775807L;
        this.f3712d = 0;
        this.f3713e = 0;
        this.f3714f = 0;
        if (audioTrack != null) {
            this.f3711c = audioTrack.getSampleRate();
        }
    }

    public final void c(long j) {
        this.h = g();
        this.g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f3709a.stop();
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
            return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * ((long) this.f3711c)) / 1000000));
        }
        int playState = this.f3709a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f3709a.getPlaybackHeadPosition());
        if (this.f3710b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f3714f = this.f3712d;
            }
            playbackHeadPosition += this.f3714f;
        }
        if (this.f3712d > playbackHeadPosition) {
            this.f3713e++;
        }
        this.f3712d = playbackHeadPosition;
        return playbackHeadPosition + (this.f3713e << 32);
    }

    public final long h() {
        return (g() * 1000000) / ((long) this.f3711c);
    }

    /* synthetic */ eb0(cb0 cb0) {
        this();
    }
}
