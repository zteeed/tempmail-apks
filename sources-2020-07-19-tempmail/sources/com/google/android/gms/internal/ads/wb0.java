package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wb0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    /* access modifiers changed from: private */
    public String N;
    public zzke O;
    public int P;

    /* renamed from: a  reason: collision with root package name */
    public String f5217a;

    /* renamed from: b  reason: collision with root package name */
    public int f5218b;

    /* renamed from: c  reason: collision with root package name */
    public int f5219c;

    /* renamed from: d  reason: collision with root package name */
    public int f5220d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5221e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5222f;
    public zzkh g;
    public byte[] h;
    public zzjl i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    private wb0() {
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = 0;
        this.o = null;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 1000;
        this.v = 200;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = 1;
        this.H = -1;
        this.I = 8000;
        this.J = 0;
        this.K = 0;
        this.M = true;
        this.N = "eng";
    }

    private static List<byte[]> b(zzpi zzpi) throws zzht {
        try {
            zzpi.m(16);
            if (zzpi.t() != 826496599) {
                return null;
            }
            byte[] bArr = zzpi.f8980a;
            for (int b2 = zzpi.b() + 20; b2 < bArr.length - 4; b2++) {
                if (bArr[b2] == 0 && bArr[b2 + 1] == 0 && bArr[b2 + 2] == 1 && bArr[b2 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, b2, bArr.length));
                }
            }
            throw new zzht("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzht("Error parsing FourCC VC1 codec private");
        }
    }

    private static boolean d(zzpi zzpi) throws zzht {
        try {
            int r2 = zzpi.r();
            if (r2 == 1) {
                return true;
            }
            if (r2 == 65534) {
                zzpi.l(24);
                return zzpi.e() == zzkn.b0.getMostSignificantBits() && zzpi.e() == zzkn.b0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzht("Error parsing MS/ACM codec private");
        }
    }

    private static List<byte[]> e(byte[] bArr) throws zzht {
        try {
            if (bArr[0] == 2) {
                int i2 = 1;
                int i3 = 0;
                while (bArr[i2] == -1) {
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + bArr[i2];
                int i6 = 0;
                while (bArr[i4] == -1) {
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + bArr[i4];
                if (bArr[i7] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i7, bArr2, 0, i5);
                    int i9 = i7 + i5;
                    if (bArr[i9] == 3) {
                        int i10 = i9 + i8;
                        if (bArr[i10] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i10)];
                            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzht("Error parsing vorbis codec private");
                    }
                    throw new zzht("Error parsing vorbis codec private");
                }
                throw new zzht("Error parsing vorbis codec private");
            }
            throw new zzht("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzht("Error parsing vorbis codec private");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023c, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0244, code lost:
        r1 = r14;
        r3 = null;
        r25 = -1;
        r30 = com.google.firebase.crashlytics.internal.proto.CodedOutputStream.DEFAULT_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0255, code lost:
        r3 = r1;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ac, code lost:
        r41 = r3;
        r3 = r1;
        r1 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c5, code lost:
        r25 = -1;
        r30 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0311, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0313, code lost:
        r25 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0315, code lost:
        r30 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0317, code lost:
        r5 = r0.M | false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x031c, code lost:
        if (r0.L == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031e, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0320, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0321, code lost:
        r5 = r5 | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0326, code lost:
        if (com.google.android.gms.internal.ads.zzpe.a(r1) == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0328, code lost:
        r1 = com.google.android.gms.internal.ads.zzhq.e(java.lang.Integer.toString(r44), r1, (java.lang.String) null, -1, r30, r0.G, r0.I, r25, r3, r0.i, r5 ? 1 : 0, r0.N);
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
        if (com.google.android.gms.internal.ads.zzpe.b(r1) == false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0357, code lost:
        if (r0.n != 0) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0359, code lost:
        r2 = r0.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035b, code lost:
        if (r2 != -1) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035d, code lost:
        r2 = r0.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035f, code lost:
        r0.l = r2;
        r2 = r0.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0363, code lost:
        if (r2 != -1) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0365, code lost:
        r2 = r0.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0367, code lost:
        r0.m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0369, code lost:
        r2 = r0.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x036d, code lost:
        if (r2 == -1) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x036f, code lost:
        r5 = r0.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0371, code lost:
        if (r5 == -1) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0373, code lost:
        r36 = ((float) (r0.k * r2)) / ((float) (r0.j * r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0381, code lost:
        r36 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0385, code lost:
        if (r0.q == false) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038b, code lost:
        if (r0.w == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0391, code lost:
        if (r0.x == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0397, code lost:
        if (r0.y == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x039d, code lost:
        if (r0.z == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a3, code lost:
        if (r0.A == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a9, code lost:
        if (r0.B == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03af, code lost:
        if (r0.C == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b5, code lost:
        if (r0.D == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03bb, code lost:
        if (r0.E == -1.0f) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03c1, code lost:
        if (r0.F != -1.0f) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c5, code lost:
        r2 = new byte[25];
        r4 = java.nio.ByteBuffer.wrap(r2);
        r4.put((byte) 0);
        r4.putShort((short) ((int) ((r0.w * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.x * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.y * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.z * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.A * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.B * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.C * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r0.D * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) (r0.E + 0.5f)));
        r4.putShort((short) ((int) (r0.F + 0.5f)));
        r4.putShort((short) r0.u);
        r4.putShort((short) r0.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0442, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0444, code lost:
        r39 = new com.google.android.gms.internal.ads.zzpt(r0.r, r0.t, r0.s, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0452, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0454, code lost:
        r1 = com.google.android.gms.internal.ads.zzhq.d(java.lang.Integer.toString(r44), r1, (java.lang.String) null, -1, r30, r0.j, r0.k, -1.0f, r3, -1, r36, r0.o, r0.p, r39, r0.i);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0482, code lost:
        if ("application/x-subrip".equals(r1) == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0484, code lost:
        r1 = com.google.android.gms.internal.ads.zzhq.h(java.lang.Integer.toString(r44), r1, (java.lang.String) null, -1, r5 ? 1 : 0, r0.N, r0.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x049c, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a2, code lost:
        if ("application/vobsub".equals(r1) != false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04a8, code lost:
        if ("application/pgs".equals(r1) != false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ae, code lost:
        if ("application/dvbsubs".equals(r1) == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b8, code lost:
        throw new com.google.android.gms.internal.ads.zzht("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b9, code lost:
        r1 = com.google.android.gms.internal.ads.zzhq.j(java.lang.Integer.toString(r44), r1, (java.lang.String) null, -1, r3, r0.N, r0.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d2, code lost:
        r2 = r43.e(r0.f5218b, r6);
        r0.O = r2;
        r2.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        r1 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cd, code lost:
        r25 = r1;
        r1 = "audio/raw";
        r3 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.internal.ads.zzjz r43, int r44) throws com.google.android.gms.internal.ads.zzht {
        /*
            r42 = this;
            r0 = r42
            java.lang.String r1 = r0.f5217a
            int r2 = r1.hashCode()
            r4 = 4
            r5 = 8
            r6 = 1
            r7 = 2
            r8 = 0
            r9 = 3
            r10 = -1
            switch(r2) {
                case -2095576542: goto L_0x014a;
                case -2095575984: goto L_0x0140;
                case -1985379776: goto L_0x0135;
                case -1784763192: goto L_0x012a;
                case -1730367663: goto L_0x011f;
                case -1482641358: goto L_0x0114;
                case -1482641357: goto L_0x0109;
                case -1373388978: goto L_0x00fe;
                case -933872740: goto L_0x00f3;
                case -538363189: goto L_0x00e8;
                case -538363109: goto L_0x00dd;
                case -425012669: goto L_0x00d1;
                case -356037306: goto L_0x00c5;
                case 62923557: goto L_0x00b9;
                case 62923603: goto L_0x00ad;
                case 62927045: goto L_0x00a1;
                case 82338133: goto L_0x0096;
                case 82338134: goto L_0x008b;
                case 99146302: goto L_0x007f;
                case 444813526: goto L_0x0073;
                case 542569478: goto L_0x0067;
                case 725957860: goto L_0x005b;
                case 855502857: goto L_0x0050;
                case 1422270023: goto L_0x0044;
                case 1809237540: goto L_0x0039;
                case 1950749482: goto L_0x002d;
                case 1950789798: goto L_0x0021;
                case 1951062397: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0154
        L_0x0015:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 11
            goto L_0x0155
        L_0x0021:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 21
            goto L_0x0155
        L_0x002d:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 16
            goto L_0x0155
        L_0x0039:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 2
            goto L_0x0155
        L_0x0044:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 24
            goto L_0x0155
        L_0x0050:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 7
            goto L_0x0155
        L_0x005b:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 23
            goto L_0x0155
        L_0x0067:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 19
            goto L_0x0155
        L_0x0073:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 9
            goto L_0x0155
        L_0x007f:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 26
            goto L_0x0155
        L_0x008b:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 1
            goto L_0x0155
        L_0x0096:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 0
            goto L_0x0155
        L_0x00a1:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 18
            goto L_0x0155
        L_0x00ad:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 15
            goto L_0x0155
        L_0x00b9:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 12
            goto L_0x0155
        L_0x00c5:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 20
            goto L_0x0155
        L_0x00d1:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 25
            goto L_0x0155
        L_0x00dd:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 6
            goto L_0x0155
        L_0x00e8:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 4
            goto L_0x0155
        L_0x00f3:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 27
            goto L_0x0155
        L_0x00fe:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 8
            goto L_0x0155
        L_0x0109:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 14
            goto L_0x0155
        L_0x0114:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 13
            goto L_0x0155
        L_0x011f:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 10
            goto L_0x0155
        L_0x012a:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 17
            goto L_0x0155
        L_0x0135:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 22
            goto L_0x0155
        L_0x0140:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 3
            goto L_0x0155
        L_0x014a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0154
            r1 = 5
            goto L_0x0155
        L_0x0154:
            r1 = -1
        L_0x0155:
            java.lang.String r2 = "application/dvbsubs"
            java.lang.String r11 = "application/pgs"
            java.lang.String r12 = "application/vobsub"
            java.lang.String r13 = "application/x-subrip"
            java.lang.String r14 = "audio/raw"
            java.lang.String r16 = "video/x-unknown"
            java.lang.String r15 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            r17 = 0
            switch(r1) {
                case 0: goto L_0x030f;
                case 1: goto L_0x030c;
                case 2: goto L_0x0309;
                case 3: goto L_0x02fb;
                case 4: goto L_0x02fb;
                case 5: goto L_0x02fb;
                case 6: goto L_0x02e7;
                case 7: goto L_0x02d3;
                case 8: goto L_0x02b6;
                case 9: goto L_0x02b3;
                case 10: goto L_0x029e;
                case 11: goto L_0x0259;
                case 12: goto L_0x024d;
                case 13: goto L_0x0242;
                case 14: goto L_0x023f;
                case 15: goto L_0x023a;
                case 16: goto L_0x0237;
                case 17: goto L_0x0234;
                case 18: goto L_0x0231;
                case 19: goto L_0x0231;
                case 20: goto L_0x022e;
                case 21: goto L_0x0225;
                case 22: goto L_0x01d4;
                case 23: goto L_0x019e;
                case 24: goto L_0x019b;
                case 25: goto L_0x0191;
                case 26: goto L_0x018e;
                case 27: goto L_0x0172;
                default: goto L_0x016a;
            }
        L_0x016a:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x0172:
            byte[] r1 = new byte[r4]
            byte[] r3 = r0.h
            byte r4 = r3[r8]
            r1[r8] = r4
            byte r4 = r3[r6]
            r1[r6] = r4
            byte r4 = r3[r7]
            r1[r7] = r4
            byte r3 = r3[r9]
            r1[r9] = r3
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r3 = r1
            r1 = r2
            goto L_0x0313
        L_0x018e:
            r1 = r11
            goto L_0x0311
        L_0x0191:
            byte[] r1 = r0.h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r3 = r1
            r1 = r12
            goto L_0x0313
        L_0x019b:
            r1 = r13
            goto L_0x0311
        L_0x019e:
            int r1 = r0.H
            int r1 = com.google.android.gms.internal.ads.zzpo.n(r1)
            if (r1 != 0) goto L_0x01cd
            int r1 = r0.H
            int r4 = r15.length()
            int r4 = r4 + 60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
        L_0x01ca:
            r1 = r15
            goto L_0x0311
        L_0x01cd:
            r25 = r1
            r1 = r14
            r3 = r17
            goto L_0x0315
        L_0x01d4:
            com.google.android.gms.internal.ads.zzpi r1 = new com.google.android.gms.internal.ads.zzpi
            byte[] r4 = r0.h
            r1.<init>((byte[]) r4)
            boolean r1 = d(r1)
            if (r1 == 0) goto L_0x020e
            int r1 = r0.H
            int r1 = com.google.android.gms.internal.ads.zzpo.n(r1)
            if (r1 != 0) goto L_0x01cd
            int r1 = r0.H
            int r4 = r15.length()
            int r4 = r4 + 60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
            goto L_0x01ca
        L_0x020e:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            int r4 = r15.length()
            if (r4 == 0) goto L_0x021b
            java.lang.String r1 = r1.concat(r15)
            goto L_0x0221
        L_0x021b:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            r1 = r4
        L_0x0221:
            android.util.Log.w(r3, r1)
            goto L_0x01ca
        L_0x0225:
            byte[] r1 = r0.h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r14 = "audio/x-flac"
            goto L_0x0255
        L_0x022e:
            java.lang.String r14 = "audio/vnd.dts.hd"
            goto L_0x023c
        L_0x0231:
            java.lang.String r14 = "audio/vnd.dts"
            goto L_0x023c
        L_0x0234:
            java.lang.String r14 = "audio/true-hd"
            goto L_0x023c
        L_0x0237:
            java.lang.String r14 = "audio/eac3"
            goto L_0x023c
        L_0x023a:
            java.lang.String r14 = "audio/ac3"
        L_0x023c:
            r1 = r14
            goto L_0x0311
        L_0x023f:
            java.lang.String r14 = "audio/mpeg"
            goto L_0x0244
        L_0x0242:
            java.lang.String r14 = "audio/mpeg-L2"
        L_0x0244:
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = 4096(0x1000, float:5.74E-42)
            goto L_0x0317
        L_0x024d:
            byte[] r1 = r0.h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r14 = "audio/mp4a-latm"
        L_0x0255:
            r3 = r1
            r1 = r14
            goto L_0x0313
        L_0x0259:
            r15 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            byte[] r3 = r0.h
            r1.add(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r4)
            long r6 = r0.J
            java.nio.ByteBuffer r3 = r3.putLong(r6)
            byte[] r3 = r3.array()
            r1.add(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r5)
            long r5 = r0.K
            java.nio.ByteBuffer r3 = r3.putLong(r5)
            byte[] r3 = r3.array()
            r1.add(r3)
            java.lang.String r3 = "audio/opus"
            r25 = -1
            r30 = 5760(0x1680, float:8.071E-42)
            goto L_0x02ac
        L_0x029e:
            r15 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = r0.h
            java.util.List r1 = e(r1)
            java.lang.String r3 = "audio/vorbis"
            r25 = -1
            r30 = 8192(0x2000, float:1.14794E-41)
        L_0x02ac:
            r41 = r3
            r3 = r1
            r1 = r41
            goto L_0x0317
        L_0x02b3:
            r1 = r16
            goto L_0x0311
        L_0x02b6:
            com.google.android.gms.internal.ads.zzpi r1 = new com.google.android.gms.internal.ads.zzpi
            byte[] r5 = r0.h
            r1.<init>((byte[]) r5)
            java.util.List r1 = b(r1)
            if (r1 == 0) goto L_0x02ca
            java.lang.String r3 = "video/wvc1"
        L_0x02c5:
            r25 = -1
            r30 = -1
            goto L_0x02ac
        L_0x02ca:
            java.lang.String r5 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r3, r5)
            r3 = r1
            r1 = r16
            goto L_0x0313
        L_0x02d3:
            com.google.android.gms.internal.ads.zzpi r1 = new com.google.android.gms.internal.ads.zzpi
            byte[] r3 = r0.h
            r1.<init>((byte[]) r3)
            com.google.android.gms.internal.ads.zzpw r1 = com.google.android.gms.internal.ads.zzpw.a(r1)
            java.util.List<byte[]> r3 = r1.f9012a
            int r1 = r1.f9013b
            r0.P = r1
            java.lang.String r1 = "video/hevc"
            goto L_0x0313
        L_0x02e7:
            com.google.android.gms.internal.ads.zzpi r1 = new com.google.android.gms.internal.ads.zzpi
            byte[] r3 = r0.h
            r1.<init>((byte[]) r3)
            com.google.android.gms.internal.ads.zzpq r1 = com.google.android.gms.internal.ads.zzpq.a(r1)
            java.util.List<byte[]> r3 = r1.f9000a
            int r1 = r1.f9001b
            r0.P = r1
            java.lang.String r1 = "video/avc"
            goto L_0x0313
        L_0x02fb:
            byte[] r1 = r0.h
            if (r1 != 0) goto L_0x0302
            r1 = r17
            goto L_0x0306
        L_0x0302:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0306:
            java.lang.String r3 = "video/mp4v-es"
            goto L_0x02c5
        L_0x0309:
            java.lang.String r1 = "video/mpeg2"
            goto L_0x0311
        L_0x030c:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x0311
        L_0x030f:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
        L_0x0311:
            r3 = r17
        L_0x0313:
            r25 = -1
        L_0x0315:
            r30 = -1
        L_0x0317:
            boolean r5 = r0.M
            r5 = r5 | r8
            boolean r6 = r0.L
            if (r6 == 0) goto L_0x0320
            r6 = 2
            goto L_0x0321
        L_0x0320:
            r6 = 0
        L_0x0321:
            r5 = r5 | r6
            boolean r6 = com.google.android.gms.internal.ads.zzpe.a(r1)
            if (r6 == 0) goto L_0x034f
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            int r2 = r0.G
            int r6 = r0.I
            com.google.android.gms.internal.ads.zzjl r7 = r0.i
            java.lang.String r8 = r0.N
            r19 = r1
            r22 = r30
            r23 = r2
            r24 = r6
            r26 = r3
            r27 = r7
            r28 = r5
            r29 = r8
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.e(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = 1
            goto L_0x04d2
        L_0x034f:
            boolean r4 = com.google.android.gms.internal.ads.zzpe.b(r1)
            if (r4 == 0) goto L_0x047e
            int r2 = r0.n
            if (r2 != 0) goto L_0x0369
            int r2 = r0.l
            if (r2 != r10) goto L_0x035f
            int r2 = r0.j
        L_0x035f:
            r0.l = r2
            int r2 = r0.m
            if (r2 != r10) goto L_0x0367
            int r2 = r0.k
        L_0x0367:
            r0.m = r2
        L_0x0369:
            int r2 = r0.l
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r10) goto L_0x0381
            int r5 = r0.m
            if (r5 == r10) goto L_0x0381
            int r6 = r0.k
            int r6 = r6 * r2
            float r2 = (float) r6
            int r6 = r0.j
            int r6 = r6 * r5
            float r5 = (float) r6
            float r2 = r2 / r5
            r36 = r2
            goto L_0x0383
        L_0x0381:
            r36 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0383:
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x0452
            float r2 = r0.w
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.x
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.A
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.B
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.C
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.D
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.E
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0442
            float r2 = r0.F
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03c5
            goto L_0x0442
        L_0x03c5:
            r2 = 25
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r2)
            r4.put(r8)
            float r5 = r0.w
            r6 = 1195593728(0x47435000, float:50000.0)
            float r5 = r5 * r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.x
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.y
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.z
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.A
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.B
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.C
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.D
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.E
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.F
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r0.u
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r0.v
            short r5 = (short) r5
            r4.putShort(r5)
            goto L_0x0444
        L_0x0442:
            r2 = r17
        L_0x0444:
            com.google.android.gms.internal.ads.zzpt r4 = new com.google.android.gms.internal.ads.zzpt
            int r5 = r0.r
            int r6 = r0.t
            int r7 = r0.s
            r4.<init>(r5, r6, r7, r2)
            r39 = r4
            goto L_0x0454
        L_0x0452:
            r39 = r17
        L_0x0454:
            java.lang.String r26 = java.lang.Integer.toString(r44)
            r28 = 0
            r29 = -1
            int r2 = r0.j
            int r4 = r0.k
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = -1
            byte[] r5 = r0.o
            int r6 = r0.p
            com.google.android.gms.internal.ads.zzjl r7 = r0.i
            r27 = r1
            r31 = r2
            r32 = r4
            r34 = r3
            r37 = r5
            r38 = r6
            r40 = r7
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.d(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r6 = 2
            goto L_0x04d2
        L_0x047e:
            boolean r4 = r13.equals(r1)
            if (r4 == 0) goto L_0x049e
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            java.lang.String r2 = r0.N
            com.google.android.gms.internal.ads.zzjl r3 = r0.i
            r19 = r1
            r22 = r5
            r23 = r2
            r24 = r3
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.h(r18, r19, r20, r21, r22, r23, r24)
        L_0x049c:
            r6 = 3
            goto L_0x04d2
        L_0x049e:
            boolean r4 = r12.equals(r1)
            if (r4 != 0) goto L_0x04b9
            boolean r4 = r11.equals(r1)
            if (r4 != 0) goto L_0x04b9
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x04b1
            goto L_0x04b9
        L_0x04b1:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x04b9:
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            java.lang.String r2 = r0.N
            com.google.android.gms.internal.ads.zzjl r4 = r0.i
            r19 = r1
            r22 = r3
            r23 = r2
            r24 = r4
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.j(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x049c
        L_0x04d2:
            int r2 = r0.f5218b
            r3 = r43
            com.google.android.gms.internal.ads.zzke r2 = r3.e(r2, r6)
            r0.O = r2
            r2.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wb0.c(com.google.android.gms.internal.ads.zzjz, int):void");
    }

    /* synthetic */ wb0(vb0 vb0) {
        this();
    }
}
