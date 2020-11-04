package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class bc0 {
    public static final int A = zzpo.l("trun");
    public static final int A0 = zzpo.l("udta");
    public static final int B = zzpo.l("sidx");
    public static final int B0 = zzpo.l("meta");
    public static final int C = zzpo.l("moov");
    public static final int C0 = zzpo.l("ilst");
    public static final int D = zzpo.l("mvhd");
    public static final int D0 = zzpo.l("mean");
    public static final int E = zzpo.l("trak");
    public static final int E0 = zzpo.l("name");
    public static final int F = zzpo.l("mdia");
    public static final int F0 = zzpo.l("data");
    public static final int G = zzpo.l("minf");
    public static final int G0 = zzpo.l("emsg");
    public static final int H = zzpo.l("stbl");
    public static final int H0 = zzpo.l("st3d");
    public static final int I = zzpo.l("avcC");
    public static final int I0 = zzpo.l("sv3d");
    public static final int J = zzpo.l("hvcC");
    public static final int J0 = zzpo.l("proj");
    public static final int K = zzpo.l("esds");
    public static final int K0 = zzpo.l("vp08");
    public static final int L = zzpo.l("moof");
    public static final int L0 = zzpo.l("vp09");
    public static final int M = zzpo.l("traf");
    public static final int M0 = zzpo.l("vpcC");
    public static final int N = zzpo.l("mvex");
    public static final int N0 = zzpo.l("camm");
    public static final int O = zzpo.l("mehd");
    public static final int O0 = zzpo.l("alac");
    public static final int P = zzpo.l("tkhd");
    public static final int Q = zzpo.l("edts");
    public static final int R = zzpo.l("elst");
    public static final int S = zzpo.l("mdhd");
    public static final int T = zzpo.l("hdlr");
    public static final int U = zzpo.l("stsd");
    public static final int V = zzpo.l("pssh");
    public static final int W = zzpo.l("sinf");
    public static final int X = zzpo.l("schm");
    public static final int Y = zzpo.l("schi");
    public static final int Z = zzpo.l("tenc");
    public static final int a0 = zzpo.l("encv");

    /* renamed from: b  reason: collision with root package name */
    public static final int f3635b = zzpo.l("ftyp");
    public static final int b0 = zzpo.l("enca");

    /* renamed from: c  reason: collision with root package name */
    public static final int f3636c = zzpo.l("avc1");
    public static final int c0 = zzpo.l("frma");

    /* renamed from: d  reason: collision with root package name */
    public static final int f3637d = zzpo.l("avc3");
    public static final int d0 = zzpo.l("saiz");

    /* renamed from: e  reason: collision with root package name */
    public static final int f3638e = zzpo.l("hvc1");
    public static final int e0 = zzpo.l("saio");

    /* renamed from: f  reason: collision with root package name */
    public static final int f3639f = zzpo.l("hev1");
    public static final int f0 = zzpo.l("sbgp");
    public static final int g = zzpo.l("s263");
    public static final int g0 = zzpo.l("sgpd");
    public static final int h = zzpo.l("d263");
    public static final int h0 = zzpo.l("uuid");
    public static final int i = zzpo.l("mdat");
    public static final int i0 = zzpo.l("senc");
    public static final int j = zzpo.l("mp4a");
    public static final int j0 = zzpo.l("pasp");
    public static final int k = zzpo.l(".mp3");
    public static final int k0 = zzpo.l("TTML");
    public static final int l = zzpo.l("wave");
    public static final int l0 = zzpo.l("mp4v");
    public static final int m = zzpo.l("lpcm");
    public static final int m0 = zzpo.l("stts");
    public static final int n = zzpo.l("sowt");
    public static final int n0 = zzpo.l("stss");
    public static final int o = zzpo.l("ac-3");
    public static final int o0 = zzpo.l("ctts");
    public static final int p = zzpo.l("dac3");
    public static final int p0 = zzpo.l("stsc");
    public static final int q = zzpo.l("ec-3");
    public static final int q0 = zzpo.l("stsz");
    public static final int r = zzpo.l("dec3");
    public static final int r0 = zzpo.l("stz2");
    public static final int s = zzpo.l("dtsc");
    public static final int s0 = zzpo.l("stco");
    public static final int t = zzpo.l("dtsh");
    public static final int t0 = zzpo.l("co64");
    public static final int u = zzpo.l("dtsl");
    public static final int u0 = zzpo.l("tx3g");
    public static final int v = zzpo.l("dtse");
    public static final int v0 = zzpo.l("wvtt");
    public static final int w = zzpo.l("ddts");
    public static final int w0 = zzpo.l("stpp");
    public static final int x = zzpo.l("tfdt");
    public static final int x0 = zzpo.l("c608");
    public static final int y = zzpo.l("tfhd");
    public static final int y0 = zzpo.l("samr");
    public static final int z = zzpo.l("trex");
    public static final int z0 = zzpo.l("sawb");

    /* renamed from: a  reason: collision with root package name */
    public final int f3640a;

    static {
        zzpo.l("vmhd");
    }

    public bc0(int i2) {
        this.f3640a = i2;
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.f3640a);
    }
}
