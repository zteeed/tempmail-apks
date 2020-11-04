package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzlt {

    /* renamed from: a  reason: collision with root package name */
    public final String f8846a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8847b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8848c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8849d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8850e;

    /* renamed from: f  reason: collision with root package name */
    private final MediaCodecInfo.CodecCapabilities f8851f;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if ((com.google.android.gms.internal.ads.zzpo.f8995a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzlt(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzpb.d(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f8846a = r2
            r1.f8850e = r3
            r1.f8851f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0029
            if (r4 == 0) goto L_0x0029
            int r5 = com.google.android.gms.internal.ads.zzpo.f8995a
            r0 = 19
            if (r5 < r0) goto L_0x0024
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            r1.f8847b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0043
            int r0 = com.google.android.gms.internal.ads.zzpo.f8995a
            if (r0 < r5) goto L_0x003e
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r1.f8848c = r0
            if (r6 != 0) goto L_0x005d
            if (r4 == 0) goto L_0x005c
            int r6 = com.google.android.gms.internal.ads.zzpo.f8995a
            if (r6 < r5) goto L_0x0058
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            r1.f8849d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlt.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public static zzlt a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzlt(str, str2, codecCapabilities, z, z2);
    }

    @TargetApi(21)
    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        if (d2 == -1.0d || d2 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }

    public static zzlt f(String str) {
        return new zzlt(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    private final void h(String str) {
        String str2 = this.f8846a;
        String str3 = this.f8850e;
        String str4 = zzpo.f8999e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    public final boolean b(int i, int i2, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8851f;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        } else if (c(videoCapabilities, i, i2, d2)) {
            return true;
        } else {
            if (i >= i2 || !c(videoCapabilities, i2, i, d2)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d2);
                h(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d2);
            String sb3 = sb2.toString();
            String str = this.f8846a;
            String str2 = this.f8850e;
            String str3 = zzpo.f8999e;
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    @TargetApi(21)
    public final boolean d(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8851f;
        if (codecCapabilities == null) {
            h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            h(sb.toString());
            return false;
        }
    }

    @TargetApi(21)
    public final boolean e(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8851f;
        if (codecCapabilities == null) {
            h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            h(sb.toString());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 == 0) goto L_0x015b
            java.lang.String r1 = r11.f8850e
            if (r1 != 0) goto L_0x0009
            goto L_0x015b
        L_0x0009:
            if (r12 == 0) goto L_0x00c3
            java.lang.String r1 = r12.trim()
            java.lang.String r2 = "avc1"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00c0
            java.lang.String r2 = "avc3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0021
            goto L_0x00c0
        L_0x0021:
            java.lang.String r2 = "hev1"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00bd
            java.lang.String r2 = "hvc1"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0033
            goto L_0x00bd
        L_0x0033:
            java.lang.String r2 = "vp9"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x003f
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x00c4
        L_0x003f:
            java.lang.String r2 = "vp8"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x00c4
        L_0x004b:
            java.lang.String r2 = "mp4a"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0057
            java.lang.String r1 = "audio/mp4a-latm"
            goto L_0x00c4
        L_0x0057:
            java.lang.String r2 = "ac-3"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r2 = "dac3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0068
            goto L_0x00ba
        L_0x0068:
            java.lang.String r2 = "ec-3"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b7
            java.lang.String r2 = "dec3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x00b7
        L_0x0079:
            java.lang.String r2 = "dtsc"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b4
            java.lang.String r2 = "dtse"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x008a
            goto L_0x00b4
        L_0x008a:
            java.lang.String r2 = "dtsh"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "dtsl"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x009b
            goto L_0x00b1
        L_0x009b:
            java.lang.String r2 = "opus"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00a6
            java.lang.String r1 = "audio/opus"
            goto L_0x00c4
        L_0x00a6:
            java.lang.String r2 = "vorbis"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = "audio/vorbis"
            goto L_0x00c4
        L_0x00b1:
            java.lang.String r1 = "audio/vnd.dts.hd"
            goto L_0x00c4
        L_0x00b4:
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r1 = "audio/eac3"
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r1 = "audio/ac3"
            goto L_0x00c4
        L_0x00bd:
            java.lang.String r1 = "video/hevc"
            goto L_0x00c4
        L_0x00c0:
            java.lang.String r1 = "video/avc"
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 != 0) goto L_0x00c7
            return r0
        L_0x00c7:
            java.lang.String r2 = r11.f8850e
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = ", "
            r4 = 0
            if (r2 != 0) goto L_0x0100
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            int r0 = r0 + 13
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "codec.mime "
            r2.append(r0)
            r2.append(r12)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r12 = r2.toString()
            r11.h(r12)
            return r4
        L_0x0100:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzlw.d(r12)
            if (r2 != 0) goto L_0x0107
            return r0
        L_0x0107:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r11.j()
            int r6 = r5.length
            r7 = 0
        L_0x010d:
            if (r7 >= r6) goto L_0x012d
            r8 = r5[r7]
            int r9 = r8.profile
            java.lang.Object r10 = r2.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L_0x012a
            int r8 = r8.level
            java.lang.Object r9 = r2.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 < r9) goto L_0x012a
            return r0
        L_0x012a:
            int r7 = r7 + 1
            goto L_0x010d
        L_0x012d:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            int r0 = r0 + 22
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "codec.profileLevel, "
            r2.append(r0)
            r2.append(r12)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r12 = r2.toString()
            r11.h(r12)
            return r4
        L_0x015b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlt.g(java.lang.String):boolean");
    }

    @TargetApi(21)
    public final Point i(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8851f;
        if (codecCapabilities == null) {
            h("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzpo.q(i, widthAlignment) * widthAlignment, zzpo.q(i2, heightAlignment) * heightAlignment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] j() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f8851f
            if (r0 == 0) goto L_0x000a
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlt.j():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
