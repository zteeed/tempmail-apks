package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pc0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4817a = {zzpo.l("isom"), zzpo.l("iso2"), zzpo.l("iso3"), zzpo.l("iso4"), zzpo.l("iso5"), zzpo.l("iso6"), zzpo.l("avc1"), zzpo.l("hvc1"), zzpo.l("hev1"), zzpo.l("mp41"), zzpo.l("mp42"), zzpo.l("3g2a"), zzpo.l("3g2b"), zzpo.l("3gr6"), zzpo.l("3gs6"), zzpo.l("3ge6"), zzpo.l("3gg6"), zzpo.l("M4V "), zzpo.l("M4A "), zzpo.l("f4v "), zzpo.l("kddi"), zzpo.l("M4VP"), zzpo.l("qt  "), zzpo.l("MSNV")};

    private static boolean a(zzjw zzjw, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        zzjw zzjw2 = zzjw;
        long e2 = zzjw.e();
        if (e2 == -1 || e2 > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            e2 = 4096;
        }
        int i = (int) e2;
        zzpi zzpi = new zzpi(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            zzpi.j(8);
            zzjw2.a(zzpi.f9163a, 0, 8);
            long s = zzpi.s();
            int d2 = zzpi.d();
            int i3 = 16;
            if (s == 1) {
                zzjw2.a(zzpi.f9163a, 8, 8);
                zzpi.k(16);
                s = zzpi.w();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (s >= j) {
                i2 += i3;
                if (d2 != bc0.C) {
                    if (d2 != bc0.L && d2 != bc0.N) {
                        if ((((long) i2) + s) - j >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (s - j);
                        i2 += i4;
                        if (d2 == bc0.f3635b) {
                            if (i4 < 8) {
                                return false;
                            }
                            zzpi.j(i4);
                            zzjw2.a(zzpi.f9163a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    zzpi.m(4);
                                } else {
                                    int d3 = zzpi.d();
                                    if ((d3 >>> 8) != zzpo.l("3gp")) {
                                        int[] iArr = f4817a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                z3 = false;
                                                break;
                                            } else if (iArr[i7] == d3) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (z3) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            zzjw2.f(i4);
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (!z4 || z != z2) {
            return false;
        }
        return true;
    }

    public static boolean b(zzjw zzjw) throws IOException, InterruptedException {
        return a(zzjw, true);
    }

    public static boolean c(zzjw zzjw) throws IOException, InterruptedException {
        return a(zzjw, false);
    }
}
