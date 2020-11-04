package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzme;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class nc0 {
    private static final int A = zzpo.l("sosn");
    private static final int B = zzpo.l("tvsh");
    private static final int C = zzpo.l("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    private static final int f4657a = zzpo.l("nam");

    /* renamed from: b  reason: collision with root package name */
    private static final int f4658b = zzpo.l("trk");

    /* renamed from: c  reason: collision with root package name */
    private static final int f4659c = zzpo.l("cmt");

    /* renamed from: d  reason: collision with root package name */
    private static final int f4660d = zzpo.l("day");

    /* renamed from: e  reason: collision with root package name */
    private static final int f4661e = zzpo.l("ART");

    /* renamed from: f  reason: collision with root package name */
    private static final int f4662f = zzpo.l("too");
    private static final int g = zzpo.l("alb");
    private static final int h = zzpo.l("com");
    private static final int i = zzpo.l("wrt");
    private static final int j = zzpo.l("lyr");
    private static final int k = zzpo.l("gen");
    private static final int l = zzpo.l("covr");
    private static final int m = zzpo.l("gnre");
    private static final int n = zzpo.l("grp");
    private static final int o = zzpo.l("disk");
    private static final int p = zzpo.l("trkn");
    private static final int q = zzpo.l("tmpo");
    private static final int r = zzpo.l("cpil");
    private static final int s = zzpo.l("aART");
    private static final int t = zzpo.l("sonm");
    private static final int u = zzpo.l("soal");
    private static final int v = zzpo.l("soar");
    private static final int w = zzpo.l("soaa");
    private static final int x = zzpo.l("soco");
    private static final int y = zzpo.l("rtng");
    private static final int z = zzpo.l("pgap");

    private static zzmk a(int i2, String str, zzpi zzpi) {
        int d2 = zzpi.d();
        if (zzpi.d() == bc0.F0) {
            zzpi.m(8);
            return new zzmk(str, (String) null, zzpi.n(d2 - 16));
        }
        String valueOf = String.valueOf(bc0.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzml b(int i2, String str, zzpi zzpi, boolean z2, boolean z3) {
        int e2 = e(zzpi);
        if (z3) {
            e2 = Math.min(1, e2);
        }
        if (e2 < 0) {
            String valueOf = String.valueOf(bc0.c(i2));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z2) {
            return new zzmk(str, (String) null, Integer.toString(e2));
        } else {
            return new zzmg("und", str, Integer.toString(e2));
        }
    }

    private static zzmk c(int i2, String str, zzpi zzpi) {
        int d2 = zzpi.d();
        if (zzpi.d() == bc0.F0 && d2 >= 22) {
            zzpi.m(10);
            int h2 = zzpi.h();
            if (h2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(h2);
                String sb2 = sb.toString();
                int h3 = zzpi.h();
                if (h3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(h3);
                    sb2 = sb3.toString();
                }
                return new zzmk(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(bc0.c(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static zzme.zza d(zzpi zzpi) {
        int b2 = zzpi.b() + zzpi.d();
        int d2 = zzpi.d();
        int i2 = d2 >>> 24;
        zzml zzml = null;
        if (i2 == 169 || i2 == 65533) {
            int i3 = 16777215 & d2;
            if (i3 == f4659c) {
                int d3 = zzpi.d();
                if (zzpi.d() == bc0.F0) {
                    zzpi.m(8);
                    String n2 = zzpi.n(d3 - 16);
                    zzml = new zzmg("und", n2, n2);
                } else {
                    String valueOf = String.valueOf(bc0.c(d2));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                zzpi.l(b2);
                return zzml;
            }
            if (i3 != f4657a) {
                if (i3 != f4658b) {
                    if (i3 != h) {
                        if (i3 != i) {
                            if (i3 == f4660d) {
                                zzmk a2 = a(d2, "TDRC", zzpi);
                                zzpi.l(b2);
                                return a2;
                            } else if (i3 == f4661e) {
                                zzmk a3 = a(d2, "TPE1", zzpi);
                                zzpi.l(b2);
                                return a3;
                            } else if (i3 == f4662f) {
                                zzmk a4 = a(d2, "TSSE", zzpi);
                                zzpi.l(b2);
                                return a4;
                            } else if (i3 == g) {
                                zzmk a5 = a(d2, "TALB", zzpi);
                                zzpi.l(b2);
                                return a5;
                            } else if (i3 == j) {
                                zzmk a6 = a(d2, "USLT", zzpi);
                                zzpi.l(b2);
                                return a6;
                            } else if (i3 == k) {
                                zzmk a7 = a(d2, "TCON", zzpi);
                                zzpi.l(b2);
                                return a7;
                            } else if (i3 == n) {
                                zzmk a8 = a(d2, "TIT1", zzpi);
                                zzpi.l(b2);
                                return a8;
                            }
                        }
                    }
                    zzmk a9 = a(d2, "TCOM", zzpi);
                    zzpi.l(b2);
                    return a9;
                }
            }
            zzmk a10 = a(d2, "TIT2", zzpi);
            zzpi.l(b2);
            return a10;
        }
        try {
            if (d2 == m) {
                int e2 = e(zzpi);
                String str = (e2 <= 0 || e2 > D.length) ? null : D[e2 - 1];
                if (str != null) {
                    zzml = new zzmk("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzml;
            } else if (d2 == o) {
                zzmk c2 = c(d2, "TPOS", zzpi);
                zzpi.l(b2);
                return c2;
            } else if (d2 == p) {
                zzmk c3 = c(d2, "TRCK", zzpi);
                zzpi.l(b2);
                return c3;
            } else if (d2 == q) {
                zzml b3 = b(d2, "TBPM", zzpi, true, false);
                zzpi.l(b2);
                return b3;
            } else if (d2 == r) {
                zzml b4 = b(d2, "TCMP", zzpi, true, true);
                zzpi.l(b2);
                return b4;
            } else if (d2 == l) {
                int d4 = zzpi.d();
                if (zzpi.d() == bc0.F0) {
                    int b5 = bc0.b(zzpi.d());
                    String str2 = b5 == 13 ? "image/jpeg" : b5 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(b5);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzpi.m(4);
                        int i4 = d4 - 16;
                        byte[] bArr = new byte[i4];
                        zzpi.p(bArr, 0, i4);
                        zzml = new zzmf(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                zzpi.l(b2);
                return zzml;
            } else if (d2 == s) {
                zzmk a11 = a(d2, "TPE2", zzpi);
                zzpi.l(b2);
                return a11;
            } else if (d2 == t) {
                zzmk a12 = a(d2, "TSOT", zzpi);
                zzpi.l(b2);
                return a12;
            } else if (d2 == u) {
                zzmk a13 = a(d2, "TSO2", zzpi);
                zzpi.l(b2);
                return a13;
            } else if (d2 == v) {
                zzmk a14 = a(d2, "TSOA", zzpi);
                zzpi.l(b2);
                return a14;
            } else if (d2 == w) {
                zzmk a15 = a(d2, "TSOP", zzpi);
                zzpi.l(b2);
                return a15;
            } else if (d2 == x) {
                zzmk a16 = a(d2, "TSOC", zzpi);
                zzpi.l(b2);
                return a16;
            } else if (d2 == y) {
                zzml b6 = b(d2, "ITUNESADVISORY", zzpi, false, false);
                zzpi.l(b2);
                return b6;
            } else if (d2 == z) {
                zzml b7 = b(d2, "ITUNESGAPLESS", zzpi, false, true);
                zzpi.l(b2);
                return b7;
            } else if (d2 == A) {
                zzmk a17 = a(d2, "TVSHOWSORT", zzpi);
                zzpi.l(b2);
                return a17;
            } else if (d2 == B) {
                zzmk a18 = a(d2, "TVSHOW", zzpi);
                zzpi.l(b2);
                return a18;
            } else if (d2 == C) {
                String str3 = null;
                String str4 = null;
                int i5 = -1;
                int i6 = -1;
                while (zzpi.b() < b2) {
                    int b8 = zzpi.b();
                    int d5 = zzpi.d();
                    int d6 = zzpi.d();
                    zzpi.m(4);
                    if (d6 == bc0.D0) {
                        str3 = zzpi.n(d5 - 12);
                    } else if (d6 == bc0.E0) {
                        str4 = zzpi.n(d5 - 12);
                    } else {
                        if (d6 == bc0.F0) {
                            i5 = b8;
                            i6 = d5;
                        }
                        zzpi.m(d5 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4)) {
                    if (i5 != -1) {
                        zzpi.l(i5);
                        zzpi.m(16);
                        zzml = new zzmg("und", str4, zzpi.n(i6 - 16));
                    }
                }
                zzpi.l(b2);
                return zzml;
            }
        } finally {
            zzpi.l(b2);
        }
        String valueOf2 = String.valueOf(bc0.c(d2));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        zzpi.l(b2);
        return null;
    }

    private static int e(zzpi zzpi) {
        zzpi.m(4);
        if (zzpi.d() == bc0.F0) {
            zzpi.m(8);
            return zzpi.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
