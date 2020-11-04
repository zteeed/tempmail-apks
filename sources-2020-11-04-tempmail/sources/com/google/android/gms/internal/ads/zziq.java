package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zziq {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private zzig[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final zzid f8946a = null;
    private int a0;

    /* renamed from: b  reason: collision with root package name */
    private final gb0 f8947b;
    private boolean b0;

    /* renamed from: c  reason: collision with root package name */
    private final zzjg f8948c;
    private boolean c0;

    /* renamed from: d  reason: collision with root package name */
    private final zzig[] f8949d;
    private long d0;

    /* renamed from: e  reason: collision with root package name */
    private final zziw f8950e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConditionVariable f8951f;
    private final long[] g;
    private final eb0 h;
    private final LinkedList<fb0> i;
    private AudioTrack j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private zzhw s;
    private zzhw t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;

    public zziq(zzid zzid, zzig[] zzigArr, zziw zziw) {
        this.f8950e = zziw;
        this.f8951f = new ConditionVariable(true);
        if (zzpo.f9178a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzpo.f9178a >= 19) {
            this.h = new db0();
        } else {
            this.h = new eb0((cb0) null);
        }
        this.f8947b = new gb0();
        this.f8948c = new zzjg();
        zzig[] zzigArr2 = new zzig[(zzigArr.length + 3)];
        this.f8949d = zzigArr2;
        zzigArr2[0] = new lb0();
        zzig[] zzigArr3 = this.f8949d;
        zzigArr3[1] = this.f8947b;
        System.arraycopy(zzigArr, 0, zzigArr3, 2, zzigArr.length);
        this.f8949d[zzigArr.length + 2] = this.f8948c;
        this.g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.a0 = 0;
        this.t = zzhw.f8921d;
        this.X = -1;
        this.R = new zzig[0];
        this.S = new ByteBuffer[0];
        this.i = new LinkedList<>();
    }

    private final long A() {
        return this.p ? this.K : this.J / ((long) this.I);
    }

    private final void B() {
        this.A = 0;
        this.z = 0;
        this.y = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
    }

    private final boolean C() {
        if (zzpo.f9178a >= 23) {
            return false;
        }
        int i2 = this.n;
        return i2 == 5 || i2 == 6;
    }

    private final boolean a() {
        return this.j != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L_0x002a;
                case 187078296: goto L_0x0020;
                case 1504578661: goto L_0x0016;
                case 1505942594: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            if (r5 == r3) goto L_0x0041
            if (r5 == r2) goto L_0x003e
            return r1
        L_0x003e:
            r5 = 8
            return r5
        L_0x0041:
            r5 = 7
            return r5
        L_0x0043:
            r5 = 6
            return r5
        L_0x0045:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziq.k(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zziy {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.U
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.android.gms.internal.ads.zzpb.a(r0)
            goto L_0x003b
        L_0x0018:
            r8.U = r9
            int r0 = com.google.android.gms.internal.ads.zzpo.f9178a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.V
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.V = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.V
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.W = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.zzpo.f9178a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.J
            com.google.android.gms.internal.ads.eb0 r2 = r8.h
            long r4 = r2.g()
            int r2 = r8.I
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.q
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.j
            byte[] r2 = r8.V
            int r4 = r8.W
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f0
            int r11 = r8.W
            int r11 = r11 + r10
            r8.W = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f0
        L_0x0076:
            r10 = 0
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r8.b0
            if (r2 == 0) goto L_0x00ea
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.google.android.gms.internal.ads.zzpb.e(r2)
            android.media.AudioTrack r2 = r8.j
            java.nio.ByteBuffer r4 = r8.w
            if (r4 != 0) goto L_0x00a7
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.w = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.w
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a7:
            int r4 = r8.x
            if (r4 != 0) goto L_0x00c3
            java.nio.ByteBuffer r4 = r8.w
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.w
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.w
            r10.position(r3)
            r8.x = r0
        L_0x00c3:
            java.nio.ByteBuffer r10 = r8.w
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00da
            java.nio.ByteBuffer r11 = r8.w
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d7
            r8.x = r3
            r10 = r11
            goto L_0x00f0
        L_0x00d7:
            if (r11 >= r10) goto L_0x00da
            goto L_0x0076
        L_0x00da:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e3
            r8.x = r3
            goto L_0x00e8
        L_0x00e3:
            int r10 = r8.x
            int r10 = r10 - r9
            r8.x = r10
        L_0x00e8:
            r10 = r9
            goto L_0x00f0
        L_0x00ea:
            android.media.AudioTrack r10 = r8.j
            int r10 = r10.write(r9, r0, r1)
        L_0x00f0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.d0 = r4
            if (r10 < 0) goto L_0x0115
            boolean r9 = r8.p
            if (r9 != 0) goto L_0x0102
            long r4 = r8.J
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.J = r4
        L_0x0102:
            if (r10 != r0) goto L_0x0114
            boolean r9 = r8.p
            if (r9 == 0) goto L_0x0110
            long r9 = r8.K
            int r11 = r8.L
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.K = r9
        L_0x0110:
            r9 = 0
            r8.U = r9
            return r1
        L_0x0114:
            return r3
        L_0x0115:
            com.google.android.gms.internal.ads.zziy r9 = new com.google.android.gms.internal.ads.zziy
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziq.n(java.nio.ByteBuffer, long):boolean");
    }

    private final void o(long j2) throws zziy {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.S[i2 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = zzig.f8943a;
                }
            }
            if (i2 == length) {
                n(byteBuffer, j2);
            } else {
                zzig zzig = this.R[i2];
                zzig.d(byteBuffer);
                ByteBuffer c2 = zzig.c();
                this.S[i2] = c2;
                if (c2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private final long p(long j2) {
        return (j2 * 1000000) / ((long) this.k);
    }

    private final long q(long j2) {
        return (j2 * ((long) this.k)) / 1000000;
    }

    private final void s() {
        ArrayList arrayList = new ArrayList();
        for (zzig zzig : this.f8949d) {
            if (zzig.isActive()) {
                arrayList.add(zzig);
            } else {
                zzig.flush();
            }
        }
        int size = arrayList.size();
        this.R = (zzig[]) arrayList.toArray(new zzig[size]);
        this.S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzig zzig2 = this.R[i2];
            zzig2.flush();
            this.S[i2] = zzig2.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean v() throws com.google.android.gms.internal.ads.zziy {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.p
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzig[] r0 = r9.R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.X = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.X
            com.google.android.gms.internal.ads.zzig[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.g()
        L_0x0028:
            r9.o(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.X
            int r0 = r0 + r2
            r9.X = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0044
            r9.n(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziq.v():boolean");
    }

    private final void z() {
        if (!a()) {
            return;
        }
        if (zzpo.f9178a >= 21) {
            this.j.setVolume(this.Q);
            return;
        }
        AudioTrack audioTrack = this.j;
        float f2 = this.Q;
        audioTrack.setStereoVolume(f2, f2);
    }

    public final long D(boolean z2) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (!(a() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.j.getPlayState() == 3) {
            long h2 = this.h.h();
            if (h2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.B >= 30000) {
                    long[] jArr = this.g;
                    int i2 = this.y;
                    jArr[i2] = h2 - nanoTime;
                    this.y = (i2 + 1) % 10;
                    int i3 = this.z;
                    if (i3 < 10) {
                        this.z = i3 + 1;
                    }
                    this.B = nanoTime;
                    this.A = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.A += this.g[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!C() && nanoTime - this.D >= 500000) {
                    boolean d2 = this.h.d();
                    this.C = d2;
                    if (d2) {
                        long e2 = this.h.e() / 1000;
                        long f2 = this.h.f();
                        if (e2 < this.O) {
                            this.C = false;
                        } else if (Math.abs(e2 - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f2);
                            sb.append(", ");
                            sb.append(e2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(h2);
                            Log.w("AudioTrack", sb.toString());
                            this.C = false;
                        } else if (Math.abs(p(f2) - h2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f2);
                            sb2.append(", ");
                            sb2.append(e2);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(h2);
                            Log.w("AudioTrack", sb2.toString());
                            this.C = false;
                        }
                    }
                    Method method = this.E;
                    if (method != null && !this.p) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.j, (Object[]) null)).intValue()) * 1000) - this.r;
                            this.P = intValue;
                            long max = Math.max(intValue, 0);
                            this.P = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.P = 0;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            j2 = p(this.h.f() + q(nanoTime2 - (this.h.e() / 1000)));
        } else {
            if (this.z == 0) {
                j2 = this.h.h();
            } else {
                j2 = nanoTime2 + this.A;
            }
            if (!z2) {
                j2 -= this.P;
            }
        }
        long j6 = this.N;
        while (!this.i.isEmpty() && j2 >= this.i.getFirst().f3965c) {
            fb0 remove = this.i.remove();
            this.t = remove.f3963a;
            this.v = remove.f3965c;
            this.u = remove.f3964b - this.N;
        }
        if (this.t.f8922a == 1.0f) {
            j3 = (j2 + this.u) - this.v;
        } else {
            if (!this.i.isEmpty() || this.f8948c.l() < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                j4 = this.u;
                j5 = (long) (((double) this.t.f8922a) * ((double) (j2 - this.v)));
            } else {
                j4 = this.u;
                j5 = zzpo.c(j2 - this.v, this.f8948c.k(), this.f8948c.l());
            }
            j3 = j5 + j4;
        }
        return j6 + j3;
    }

    public final void E(int i2) {
        zzpb.e(zzpo.f9178a >= 21);
        if (!this.b0 || this.a0 != i2) {
            this.b0 = true;
            this.a0 = i2;
            e();
        }
    }

    public final void b() {
        this.Z = false;
        if (a()) {
            B();
            this.h.a();
        }
    }

    public final void c() {
        this.Z = true;
        if (a()) {
            this.O = System.nanoTime() / 1000;
            this.j.play();
        }
    }

    public final void d() {
        e();
        for (zzig a2 : this.f8949d) {
            a2.a();
        }
        this.a0 = 0;
        this.Z = false;
    }

    public final void e() {
        if (a()) {
            this.G = 0;
            this.H = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            zzhw zzhw = this.s;
            if (zzhw != null) {
                this.t = zzhw;
                this.s = null;
            } else if (!this.i.isEmpty()) {
                this.t = this.i.getLast().f3963a;
            }
            this.i.clear();
            this.u = 0;
            this.v = 0;
            this.T = null;
            this.U = null;
            int i2 = 0;
            while (true) {
                zzig[] zzigArr = this.R;
                if (i2 >= zzigArr.length) {
                    break;
                }
                zzig zzig = zzigArr[i2];
                zzig.flush();
                this.S[i2] = zzig.c();
                i2++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0;
            B();
            if (this.j.getPlayState() == 3) {
                this.j.pause();
            }
            AudioTrack audioTrack = this.j;
            this.j = null;
            this.h.b((AudioTrack) null, false);
            this.f8951f.close();
            new cb0(this, audioTrack).start();
        }
    }

    public final void f(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (!this.b0) {
                e();
                this.a0 = 0;
            }
        }
    }

    public final void g(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            z();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zziu {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = k(r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004a
            int r11 = com.google.android.gms.internal.ads.zzpo.r(r11, r9)
            r7.F = r11
            com.google.android.gms.internal.ads.gb0 r11 = r7.f8947b
            r11.i(r13)
            com.google.android.gms.internal.ads.zzig[] r11 = r7.f8949d
            int r13 = r11.length
            r2 = 0
            r3 = 0
        L_0x0023:
            if (r2 >= r13) goto L_0x0044
            r4 = r11[r2]
            boolean r5 = r4.f(r10, r9, r8)     // Catch:{ zzif -> 0x003d }
            r3 = r3 | r5
            boolean r5 = r4.isActive()
            if (r5 == 0) goto L_0x003a
            int r9 = r4.h()
            int r8 = r4.e()
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003d:
            r8 = move-exception
            com.google.android.gms.internal.ads.zziu r9 = new com.google.android.gms.internal.ads.zziu
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            r7.s()
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            r11 = 252(0xfc, float:3.53E-43)
            r13 = 12
            switch(r9) {
                case 1: goto L_0x0080;
                case 2: goto L_0x007d;
                case 3: goto L_0x007a;
                case 4: goto L_0x0077;
                case 5: goto L_0x0074;
                case 6: goto L_0x0071;
                case 7: goto L_0x006e;
                case 8: goto L_0x006b;
                default: goto L_0x0052;
            }
        L_0x0052:
            com.google.android.gms.internal.ads.zziu r8 = new com.google.android.gms.internal.ads.zziu
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x006b:
            int r2 = com.google.android.gms.internal.ads.zzhc.f8902a
            goto L_0x0081
        L_0x006e:
            r2 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0081
        L_0x0071:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x0081
        L_0x0074:
            r2 = 220(0xdc, float:3.08E-43)
            goto L_0x0081
        L_0x0077:
            r2 = 204(0xcc, float:2.86E-43)
            goto L_0x0081
        L_0x007a:
            r2 = 28
            goto L_0x0081
        L_0x007d:
            r2 = 12
            goto L_0x0081
        L_0x0080:
            r2 = 4
        L_0x0081:
            int r4 = com.google.android.gms.internal.ads.zzpo.f9178a
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00a8
            java.lang.String r4 = com.google.android.gms.internal.ads.zzpo.f9179b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = com.google.android.gms.internal.ads.zzpo.f9180c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00a8
            r4 = 3
            if (r9 == r4) goto L_0x00a9
            if (r9 == r6) goto L_0x00a9
            r11 = 7
            if (r9 == r11) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            int r11 = com.google.android.gms.internal.ads.zzhc.f8902a
            goto L_0x00a9
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            int r2 = com.google.android.gms.internal.ads.zzpo.f9178a
            r4 = 25
            if (r2 > r4) goto L_0x00be
            java.lang.String r2 = com.google.android.gms.internal.ads.zzpo.f9179b
            java.lang.String r4 = "fugu"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00be
            if (r12 == 0) goto L_0x00be
            if (r9 != r0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r13 = r11
        L_0x00bf:
            if (r3 != 0) goto L_0x00d4
            boolean r11 = r7.a()
            if (r11 == 0) goto L_0x00d4
            int r11 = r7.m
            if (r11 != r8) goto L_0x00d4
            int r11 = r7.k
            if (r11 != r10) goto L_0x00d4
            int r11 = r7.l
            if (r11 != r13) goto L_0x00d4
            return
        L_0x00d4:
            r7.e()
            r7.m = r8
            r7.p = r12
            r7.k = r10
            r7.l = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r8 = 2
        L_0x00e4:
            r7.n = r8
            int r8 = com.google.android.gms.internal.ads.zzpo.r(r11, r9)
            r7.I = r8
            if (r12 == 0) goto L_0x00fd
            int r8 = r7.n
            if (r8 == r6) goto L_0x00fa
            r9 = 6
            if (r8 != r9) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0133
        L_0x00fa:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0133
        L_0x00fd:
            int r8 = r7.n
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.q(r10)
            int r11 = (int) r10
            int r10 = r7.I
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.q(r2)
            int r8 = r7.I
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x012f
            r8 = r10
            goto L_0x0133
        L_0x012f:
            if (r9 <= r8) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r8 = r9
        L_0x0133:
            r7.q = r8
            if (r12 == 0) goto L_0x013d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0145
        L_0x013d:
            int r9 = r7.I
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.p(r8)
        L_0x0145:
            r7.r = r8
            com.google.android.gms.internal.ads.zzhw r8 = r7.t
            r7.l(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziq.i(java.lang.String, int, int, int, int, int[]):void");
    }

    public final boolean j(String str) {
        zzid zzid = this.f8946a;
        return zzid != null && zzid.a(k(str));
    }

    public final zzhw l(zzhw zzhw) {
        if (this.p) {
            zzhw zzhw2 = zzhw.f8921d;
            this.t = zzhw2;
            return zzhw2;
        }
        float i2 = this.f8948c.i(zzhw.f8922a);
        zzjg zzjg = this.f8948c;
        float f2 = zzhw.f8923b;
        zzjg.j(f2);
        zzhw zzhw3 = new zzhw(i2, f2);
        zzhw zzhw4 = this.s;
        if (zzhw4 == null) {
            if (!this.i.isEmpty()) {
                zzhw4 = this.i.getLast().f3963a;
            } else {
                zzhw4 = this.t;
            }
        }
        if (!zzhw3.equals(zzhw4)) {
            if (a()) {
                this.s = zzhw3;
            } else {
                this.t = zzhw3;
            }
        }
        return this.t;
    }

    public final boolean m(ByteBuffer byteBuffer, long j2) throws zzit, zziy {
        int i2;
        int i3;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j2;
        ByteBuffer byteBuffer3 = this.T;
        zzpb.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!a()) {
            this.f8951f.block();
            if (this.b0) {
                this.j = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.l).setEncoding(this.n).setSampleRate(this.k).build(), this.q, 1, this.a0);
            } else if (this.a0 == 0) {
                this.j = new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1);
            } else {
                this.j = new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1, this.a0);
            }
            int state = this.j.getState();
            if (state == 1) {
                int audioSessionId = this.j.getAudioSessionId();
                if (this.a0 != audioSessionId) {
                    this.a0 = audioSessionId;
                    this.f8950e.b(audioSessionId);
                }
                this.h.b(this.j, C());
                z();
                this.c0 = false;
                if (this.Z) {
                    c();
                }
            } else {
                try {
                    this.j.release();
                } catch (Exception unused) {
                } finally {
                    this.j = null;
                }
                throw new zzit(state, this.k, this.l, this.q);
            }
        }
        if (C()) {
            if (this.j.getPlayState() == 2) {
                this.c0 = false;
                return false;
            } else if (this.j.getPlayState() == 1 && this.h.g() != 0) {
                return false;
            }
        }
        boolean z2 = this.c0;
        boolean w2 = w();
        this.c0 = w2;
        if (z2 && !w2 && this.j.getPlayState() != 1) {
            this.f8950e.c(this.q, zzhc.a(this.r), SystemClock.elapsedRealtime() - this.d0);
        }
        if (this.T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p && this.L == 0) {
                int i4 = this.n;
                if (i4 == 7 || i4 == 8) {
                    i3 = zzja.a(byteBuffer);
                } else if (i4 == 5) {
                    i3 = zzie.c();
                } else if (i4 == 6) {
                    i3 = zzie.d(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i4);
                    throw new IllegalStateException(sb.toString());
                }
                this.L = i3;
            }
            if (this.s != null) {
                if (!v()) {
                    return false;
                }
                LinkedList<fb0> linkedList = this.i;
                fb0 fb0 = r11;
                fb0 fb02 = new fb0(this.s, Math.max(0, j3), p(A()), (cb0) null);
                linkedList.add(fb0);
                this.s = null;
                s();
            }
            if (this.M == 0) {
                this.N = Math.max(0, j3);
                this.M = 1;
            } else {
                long p2 = this.N + p(this.p ? this.H : this.G / ((long) this.F));
                if (this.M != 1 || Math.abs(p2 - j3) <= 200000) {
                    i2 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(p2);
                    sb2.append(", got ");
                    sb2.append(j3);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i2 = 2;
                    this.M = 2;
                }
                if (this.M == i2) {
                    this.N += j3 - p2;
                    this.M = 1;
                    this.f8950e.a();
                }
            }
            if (this.p) {
                this.H += (long) this.L;
            } else {
                this.G += (long) byteBuffer.remaining();
            }
            this.T = byteBuffer2;
        }
        if (this.p) {
            n(this.T, j3);
        } else {
            o(j3);
        }
        if (this.T.hasRemaining()) {
            return false;
        }
        this.T = null;
        return true;
    }

    public final boolean r() {
        if (a()) {
            return this.Y && !w();
        }
        return true;
    }

    public final void t() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void u() throws zziy {
        if (!this.Y && a() && v()) {
            this.h.c(A());
            this.x = 0;
            this.Y = true;
        }
    }

    public final boolean w() {
        if (a()) {
            if (A() <= this.h.g()) {
                if (C() && this.j.getPlayState() == 2 && this.j.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final zzhw x() {
        return this.t;
    }

    public final void y() {
        if (this.b0) {
            this.b0 = false;
            this.a0 = 0;
            e();
        }
    }
}
