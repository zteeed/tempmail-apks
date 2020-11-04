package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbcu {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6157a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbdb f6158b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f6159c;

    /* renamed from: d  reason: collision with root package name */
    private zzbco f6160d;

    public zzbcu(Context context, ViewGroup viewGroup, zzbfn zzbfn) {
        this(context, viewGroup, zzbfn, (zzbco) null);
    }

    public final void a() {
        Preconditions.f("onDestroy must be called from the UI thread.");
        zzbco zzbco = this.f6160d;
        if (zzbco != null) {
            zzbco.j();
            this.f6159c.removeView(this.f6160d);
            this.f6160d = null;
        }
    }

    public final void b() {
        Preconditions.f("onPause must be called from the UI thread.");
        zzbco zzbco = this.f6160d;
        if (zzbco != null) {
            zzbco.k();
        }
    }

    public final void c(int i, int i2, int i3, int i4, int i5, boolean z, zzbdc zzbdc) {
        if (this.f6160d == null) {
            zzabd.a(this.f6158b.i().c(), this.f6158b.p0(), "vpr2");
            Context context = this.f6157a;
            zzbdb zzbdb = this.f6158b;
            zzbco zzbco = new zzbco(context, zzbdb, i5, z, zzbdb.i().c(), zzbdc);
            this.f6160d = zzbco;
            this.f6159c.addView(zzbco, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f6160d.u(i, i2, i3, i4);
            this.f6158b.y(false);
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        Preconditions.f("The underlay may only be modified from the UI thread.");
        zzbco zzbco = this.f6160d;
        if (zzbco != null) {
            zzbco.u(i, i2, i3, i4);
        }
    }

    public final zzbco e() {
        Preconditions.f("getAdVideoUnderlay must be called from the UI thread.");
        return this.f6160d;
    }

    @VisibleForTesting
    private zzbcu(Context context, ViewGroup viewGroup, zzbdb zzbdb, zzbco zzbco) {
        this.f6157a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6159c = viewGroup;
        this.f6158b = zzbdb;
        this.f6160d = null;
    }
}
