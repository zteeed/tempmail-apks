package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wc0 implements vc0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f5407a;

    /* renamed from: b  reason: collision with root package name */
    private MediaCodecInfo[] f5408b;

    public wc0(boolean z) {
        this.f5407a = z ? 1 : 0;
    }

    private final void e() {
        if (this.f5408b == null) {
            this.f5408b = new MediaCodecList(this.f5407a).getCodecInfos();
        }
    }

    public final MediaCodecInfo a(int i) {
        e();
        return this.f5408b[i];
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        e();
        return this.f5408b.length;
    }

    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
