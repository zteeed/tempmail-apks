package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class yd0 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzpz f5566a;

    private yd0(zzpz zzpz, MediaCodec mediaCodec) {
        this.f5566a = zzpz;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        zzpz zzpz = this.f5566a;
        if (this == zzpz.y0) {
            zzpz.k0();
        }
    }
}
