package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxg {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Clock f6193a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaxs f6194b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<x4> f6195c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6196d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final String f6197e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6198f;
    @GuardedBy("lock")
    private long g = -1;
    @GuardedBy("lock")
    private long h = -1;
    @GuardedBy("lock")
    private long i = -1;
    @GuardedBy("lock")
    private long j = 0;
    @GuardedBy("lock")
    private long k = -1;
    @GuardedBy("lock")
    private long l = -1;

    zzaxg(Clock clock, zzaxs zzaxs, String str, String str2) {
        this.f6193a = clock;
        this.f6194b = zzaxs;
        this.f6197e = str;
        this.f6198f = str2;
        this.f6195c = new LinkedList<>();
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f6196d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6197e);
            bundle.putString("slotid", this.f6198f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.k);
            bundle.putLong("tresponse", this.l);
            bundle.putLong("timp", this.h);
            bundle.putLong("tload", this.i);
            bundle.putLong("pcc", this.j);
            bundle.putLong("tfetch", this.g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6195c.iterator();
            while (it.hasNext()) {
                arrayList.add(((x4) it.next()).a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void c(boolean z) {
        synchronized (this.f6196d) {
            if (this.l != -1) {
                this.i = this.f6193a.b();
            }
        }
    }

    public final void d(zzve zzve) {
        synchronized (this.f6196d) {
            long b2 = this.f6193a.b();
            this.k = b2;
            this.f6194b.d(zzve, b2);
        }
    }

    public final void e(long j2) {
        synchronized (this.f6196d) {
            this.l = j2;
            if (j2 != -1) {
                this.f6194b.e(this);
            }
        }
    }

    public final void f() {
        synchronized (this.f6196d) {
            if (this.l != -1 && this.h == -1) {
                this.h = this.f6193a.b();
                this.f6194b.e(this);
            }
            this.f6194b.g();
        }
    }

    public final void g() {
        synchronized (this.f6196d) {
            if (this.l != -1) {
                x4 x4Var = new x4(this);
                x4Var.d();
                this.f6195c.add(x4Var);
                this.j++;
                this.f6194b.h();
                this.f6194b.e(this);
            }
        }
    }

    public final void h() {
        synchronized (this.f6196d) {
            if (this.l != -1 && !this.f6195c.isEmpty()) {
                x4 last = this.f6195c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f6194b.e(this);
                }
            }
        }
    }

    public final String i() {
        return this.f6197e;
    }
}
