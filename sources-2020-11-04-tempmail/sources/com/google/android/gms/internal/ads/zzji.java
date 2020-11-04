package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzji {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f8958a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f8959b;

    /* renamed from: c  reason: collision with root package name */
    private int f8960c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f8961d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f8962e;

    /* renamed from: f  reason: collision with root package name */
    private int f8963f;
    private final MediaCodec.CryptoInfo g;
    private final nb0 h;

    public zzji() {
        nb0 nb0 = null;
        MediaCodec.CryptoInfo cryptoInfo = zzpo.f9178a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.g = cryptoInfo;
        this.h = zzpo.f9178a >= 24 ? new nb0(cryptoInfo) : nb0;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f8963f = i;
        this.f8961d = iArr;
        this.f8962e = iArr2;
        this.f8959b = bArr;
        this.f8958a = bArr2;
        this.f8960c = i2;
        int i3 = zzpo.f9178a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i2;
            if (i3 >= 24) {
                this.h.a(0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return this.g;
    }
}