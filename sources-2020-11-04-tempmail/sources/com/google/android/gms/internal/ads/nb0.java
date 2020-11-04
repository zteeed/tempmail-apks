package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class nb0 {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f4654a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f4655b;

    private nb0(MediaCodec.CryptoInfo cryptoInfo) {
        this.f4654a = cryptoInfo;
        this.f4655b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    public final void a(int i, int i2) {
        this.f4655b.set(i, i2);
        this.f4654a.setPattern(this.f4655b);
    }
}
