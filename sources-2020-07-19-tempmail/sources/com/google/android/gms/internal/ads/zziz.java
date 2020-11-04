package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zziz extends zzls implements zzpf {
    /* access modifiers changed from: private */
    public final zzih V;
    private final zziq W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int a0;
    private int b0;
    private long c0;
    /* access modifiers changed from: private */
    public boolean d0;

    public zziz(zzlu zzlu) {
        this(zzlu, (zzjq<zzjs>) null, true);
    }

    private final boolean c0(String str) {
        return this.W.j(str);
    }

    protected static void d0(int i, long j, long j2) {
    }

    protected static void e0() {
    }

    protected static void f0(int i) {
    }

    /* access modifiers changed from: protected */
    public final void A(long j, boolean z) throws zzhb {
        super.A(j, z);
        this.W.e();
        this.c0 = j;
        this.d0 = true;
    }

    /* access modifiers changed from: protected */
    public final void D(boolean z) throws zzhb {
        super.D(z);
        this.V.c(this.T);
        int i = F().f8743a;
        if (i != 0) {
            this.W.E(i);
        } else {
            this.W.y();
        }
    }

    /* access modifiers changed from: protected */
    public final void E() {
        try {
            this.W.d();
            try {
                super.E();
            } finally {
                this.T.a();
                this.V.f(this.T);
            }
        } catch (Throwable th) {
            super.E();
            throw th;
        } finally {
            this.T.a();
            this.V.f(this.T);
        }
    }

    /* access modifiers changed from: protected */
    public final void H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhb {
        int[] iArr;
        int i;
        boolean z = this.Z != null;
        String string = z ? this.Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.Y || integer != 6 || (i = this.b0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.b0; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.W.i(string, integer, integer2, this.a0, 0, iArr);
        } catch (zziu e2) {
            throw zzhb.b(e2, w());
        }
    }

    /* access modifiers changed from: protected */
    public final int I(zzlu zzlu, zzhq zzhq) throws zzma {
        int i;
        int i2;
        String str = zzhq.g;
        boolean z = false;
        if (!zzpe.a(str)) {
            return 0;
        }
        int i3 = zzpo.f8995a >= 21 ? 16 : 0;
        int i4 = 3;
        if (c0(str) && zzlu.b() != null) {
            return i3 | 4 | 3;
        }
        zzlt a2 = zzlu.a(str, false);
        if (a2 == null) {
            return 1;
        }
        if (zzpo.f8995a < 21 || (((i = zzhq.t) == -1 || a2.d(i)) && ((i2 = zzhq.s) == -1 || a2.e(i2)))) {
            z = true;
        }
        if (!z) {
            i4 = 2;
        }
        return i3 | 4 | i4;
    }

    /* access modifiers changed from: protected */
    public final zzlt J(zzlu zzlu, zzhq zzhq, boolean z) throws zzma {
        zzlt b2;
        if (!c0(zzhq.g) || (b2 = zzlu.b()) == null) {
            this.X = false;
            return super.J(zzlu, zzhq, z);
        }
        this.X = true;
        return b2;
    }

    /* access modifiers changed from: protected */
    public final void L(zzlt zzlt, MediaCodec mediaCodec, zzhq zzhq, MediaCrypto mediaCrypto) {
        this.Y = zzpo.f8995a < 24 && "OMX.SEC.aac.dec".equals(zzlt.f8846a) && "samsung".equals(zzpo.f8997c) && (zzpo.f8996b.startsWith("zeroflte") || zzpo.f8996b.startsWith("herolte") || zzpo.f8996b.startsWith("heroqlte"));
        if (this.X) {
            MediaFormat o = zzhq.o();
            this.Z = o;
            o.setString("mime", "audio/raw");
            mediaCodec.configure(this.Z, (Surface) null, (MediaCrypto) null, 0);
            this.Z.setString("mime", zzhq.g);
            return;
        }
        mediaCodec.configure(zzhq.o(), (Surface) null, (MediaCrypto) null, 0);
        this.Z = null;
    }

    /* access modifiers changed from: protected */
    public final boolean N(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhb {
        if (this.X && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.T.f8785e++;
            this.W.t();
            return true;
        } else {
            try {
                if (!this.W.m(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.T.f8784d++;
                return true;
            } catch (zzit | zziy e2) {
                throw zzhb.b(e2, w());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void Q(String str, long j, long j2) {
        this.V.d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void R(zzhq zzhq) throws zzhb {
        super.R(zzhq);
        this.V.e(zzhq);
        this.a0 = "audio/raw".equals(zzhq.g) ? zzhq.u : 2;
        this.b0 = zzhq.s;
    }

    /* access modifiers changed from: protected */
    public final void T() throws zzhb {
        try {
            this.W.u();
        } catch (zziy e2) {
            throw zzhb.b(e2, w());
        }
    }

    public final boolean b() {
        return super.b() && this.W.r();
    }

    public final void i(int i, Object obj) throws zzhb {
        if (i == 2) {
            this.W.g(((Float) obj).floatValue());
        } else if (i != 3) {
            super.i(i, obj);
        } else {
            this.W.f(((Integer) obj).intValue());
        }
    }

    public final boolean isReady() {
        return this.W.w() || super.isReady();
    }

    public final zzhw k(zzhw zzhw) {
        return this.W.l(zzhw);
    }

    public final zzpf l() {
        return this;
    }

    public final long t() {
        long D = this.W.D(b());
        if (D != Long.MIN_VALUE) {
            if (!this.d0) {
                D = Math.max(this.c0, D);
            }
            this.c0 = D;
            this.d0 = false;
        }
        return this.c0;
    }

    public final zzhw u() {
        return this.W.x();
    }

    /* access modifiers changed from: protected */
    public final void x() {
        super.x();
        this.W.c();
    }

    /* access modifiers changed from: protected */
    public final void y() {
        this.W.b();
        super.y();
    }

    private zziz(zzlu zzlu, zzjq<zzjs> zzjq, boolean z) {
        this(zzlu, (zzjq<zzjs>) null, true, (Handler) null, (zzii) null);
    }

    private zziz(zzlu zzlu, zzjq<zzjs> zzjq, boolean z, Handler handler, zzii zzii) {
        this(zzlu, (zzjq<zzjs>) null, true, (Handler) null, (zzii) null, (zzid) null, new zzig[0]);
    }

    private zziz(zzlu zzlu, zzjq<zzjs> zzjq, boolean z, Handler handler, zzii zzii, zzid zzid, zzig... zzigArr) {
        super(1, zzlu, zzjq, z);
        this.W = new zziq((zzid) null, zzigArr, new ib0(this));
        this.V = new zzih((Handler) null, (zzii) null);
    }
}
