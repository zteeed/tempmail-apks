package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrc {

    /* renamed from: a  reason: collision with root package name */
    private final int f9046a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9047b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9048c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9049d;

    /* renamed from: e  reason: collision with root package name */
    private final zzrr f9050e;

    /* renamed from: f  reason: collision with root package name */
    private final zzry f9051f;
    private final Object g = new Object();
    private ArrayList<String> h = new ArrayList<>();
    private ArrayList<String> i = new ArrayList<>();
    private ArrayList<zzrp> j = new ArrayList<>();
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int n;
    private String o = "";
    private String p = "";
    private String q = "";

    public zzrc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.f9046a = i2;
        this.f9047b = i3;
        this.f9048c = i4;
        this.f9049d = z;
        this.f9050e = new zzrr(i5);
        this.f9051f = new zzry(i6, i7, i8);
    }

    private static String b(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    private final void f(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null && str.length() >= this.f9048c) {
            synchronized (this.g) {
                this.h.add(str);
                this.k += str.length();
                if (z) {
                    this.i.add(str);
                    this.j.add(new zzrp(f2, f3, f4, f5, this.i.size() - 1));
                }
            }
        }
    }

    @VisibleForTesting
    private final int g(int i2, int i3) {
        if (this.f9049d) {
            return this.f9047b;
        }
        return (i2 * this.f9046a) + (i3 * this.f9047b);
    }

    public final int a() {
        return this.n;
    }

    public final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        f(str, z, f2, f3, f4, f5);
        synchronized (this.g) {
            if (this.m < 0) {
                zzbba.f("ActivityContent: negative number of WebViews.");
            }
            p();
        }
    }

    public final void d(String str, boolean z, float f2, float f3, float f4, float f5) {
        f(str, z, f2, f3, f4, f5);
    }

    public final void e(int i2) {
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzrc) obj).o;
        return str != null && str.equals(this.o);
    }

    public final boolean h() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String i() {
        return this.o;
    }

    public final String j() {
        return this.p;
    }

    public final String k() {
        return this.q;
    }

    public final void l() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void m() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void n() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final void o() {
        synchronized (this.g) {
            int g2 = g(this.k, this.l);
            if (g2 > this.n) {
                this.n = g2;
            }
        }
    }

    public final void p() {
        synchronized (this.g) {
            int g2 = g(this.k, this.l);
            if (g2 > this.n) {
                this.n = g2;
                if (!zzq.zzla().r().w()) {
                    this.o = this.f9050e.a(this.h);
                    this.p = this.f9050e.a(this.i);
                }
                if (!zzq.zzla().r().q()) {
                    this.q = this.f9051f.a(this.i, this.j);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int q() {
        return this.k;
    }

    public final String toString() {
        int i2 = this.l;
        int i3 = this.n;
        int i4 = this.k;
        String b2 = b(this.h, 100);
        String b3 = b(this.i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 165 + String.valueOf(b3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(b2);
        sb.append("\n viewableText");
        sb.append(b3);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
