package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gc extends zzbnc {
    private final Context h;
    private final View i;
    private final zzbfn j;
    private final zzdkj k;
    private final zzboy l;
    private final zzccv m;
    private final zzbyk n;
    private final zzeku<zzcwo> o;
    private final Executor p;
    private zzvh q;

    gc(zzbpa zzbpa, Context context, zzdkj zzdkj, View view, zzbfn zzbfn, zzboy zzboy, zzccv zzccv, zzbyk zzbyk, zzeku<zzcwo> zzeku, Executor executor) {
        super(zzbpa);
        this.h = context;
        this.i = view;
        this.j = zzbfn;
        this.k = zzdkj;
        this.l = zzboy;
        this.m = zzccv;
        this.n = zzbyk;
        this.o = zzeku;
        this.p = executor;
    }

    public final void b() {
        this.p.execute(new hc(this));
        super.b();
    }

    public final zzyi g() {
        try {
            return this.l.getVideoController();
        } catch (zzdlg unused) {
            return null;
        }
    }

    public final void h(ViewGroup viewGroup, zzvh zzvh) {
        zzbfn zzbfn;
        if (viewGroup != null && (zzbfn = this.j) != null) {
            zzbfn.X(zzbhg.i(zzvh));
            viewGroup.setMinimumHeight(zzvh.f9374d);
            viewGroup.setMinimumWidth(zzvh.g);
            this.q = zzvh;
        }
    }

    public final zzdkj i() {
        boolean z;
        zzvh zzvh = this.q;
        if (zzvh != null) {
            return zzdld.c(zzvh);
        }
        zzdkk zzdkk = this.f6673b;
        if (zzdkk.U) {
            Iterator<String> it = zzdkk.f8314a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdkj(this.i.getWidth(), this.i.getHeight(), false);
            }
        }
        return zzdld.a(this.f6673b.o, this.k);
    }

    public final View j() {
        return this.i;
    }

    public final zzdkj k() {
        return this.k;
    }

    public final int l() {
        return this.f6672a.f8345b.f8340b.f8322c;
    }

    public final void m() {
        this.n.C0();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        if (this.m.d() != null) {
            try {
                this.m.d().M6(this.o.get(), ObjectWrapper.h0(this.h));
            } catch (RemoteException e2) {
                zzbba.c("RemoteException when notifyAdLoad is called", e2);
            }
        }
    }
}
