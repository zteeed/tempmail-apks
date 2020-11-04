package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaq;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzaa<T> implements Comparable<zzaa<T>> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzaq.a f5508b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5509c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5510d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5511e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f5512f;
    private zzai g;
    private Integer h;
    private zzae i;
    private boolean j;
    private boolean k;
    private zzan l;
    private zzn m;
    private s n;

    public zzaa(int i2, String str, zzai zzai) {
        Uri parse;
        String host;
        this.f5508b = zzaq.a.f5857c ? new zzaq.a() : null;
        this.f5512f = new Object();
        this.j = true;
        int i3 = 0;
        this.k = false;
        this.m = null;
        this.f5509c = i2;
        this.f5510d = str;
        this.g = zzai;
        this.l = new zzq();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.f5511e = i3;
    }

    /* access modifiers changed from: package-private */
    public final void A(int i2) {
        zzae zzae = this.i;
        if (zzae != null) {
            zzae.b(this, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(String str) {
        zzae zzae = this.i;
        if (zzae != null) {
            zzae.d(this);
        }
        if (zzaq.a.f5857c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new t(this, str, id));
                return;
            }
            this.f5508b.a(str, id);
            this.f5508b.b(toString());
        }
    }

    public final zzaa<?> D(int i2) {
        this.h = Integer.valueOf(i2);
        return this;
    }

    public final String E() {
        String str = this.f5510d;
        int i2 = this.f5509c;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String num = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final zzn G() {
        return this.m;
    }

    public byte[] H() throws zzl {
        return null;
    }

    public final boolean I() {
        return this.j;
    }

    public final int J() {
        return this.l.b();
    }

    public final zzan K() {
        return this.l;
    }

    public final void L() {
        synchronized (this.f5512f) {
            this.k = true;
        }
    }

    public final boolean N() {
        boolean z;
        synchronized (this.f5512f) {
            z = this.k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void O() {
        s sVar;
        synchronized (this.f5512f) {
            sVar = this.n;
        }
        if (sVar != null) {
            sVar.b(this);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        zzaf zzaf = zzaf.NORMAL;
        return this.h.intValue() - ((zzaa) obj).h.intValue();
    }

    public Map<String, String> f() throws zzl {
        return Collections.emptyMap();
    }

    public final int g() {
        return this.f5509c;
    }

    public final String h() {
        return this.f5510d;
    }

    public final boolean k() {
        synchronized (this.f5512f) {
        }
        return false;
    }

    public final zzaa<?> m(zzae zzae) {
        this.i = zzae;
        return this;
    }

    public final zzaa<?> n(zzn zzn) {
        this.m = zzn;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzaj<T> o(zzy zzy);

    /* access modifiers changed from: package-private */
    public final void p(s sVar) {
        synchronized (this.f5512f) {
            this.n = sVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(zzaj<?> zzaj) {
        s sVar;
        synchronized (this.f5512f) {
            sVar = this.n;
        }
        if (sVar != null) {
            sVar.a(this, zzaj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void r(T t);

    public final void t(zzao zzao) {
        zzai zzai;
        synchronized (this.f5512f) {
            zzai = this.g;
        }
        if (zzai != null) {
            zzai.a(zzao);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f5511e));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        k();
        String str = this.f5510d;
        String valueOf2 = String.valueOf(zzaf.NORMAL);
        String valueOf3 = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public final void u(String str) {
        if (zzaq.a.f5857c) {
            this.f5508b.a(str, Thread.currentThread().getId());
        }
    }

    public final int v() {
        return this.f5511e;
    }
}
