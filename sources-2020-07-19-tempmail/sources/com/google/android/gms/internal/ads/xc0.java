package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xc0 implements vc0 {
    private xc0() {
    }

    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return MediaCodecList.getCodecCount();
    }

    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
