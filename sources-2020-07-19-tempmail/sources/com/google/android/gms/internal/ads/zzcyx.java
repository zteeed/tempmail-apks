package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyx implements zzdec<zzcyy> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7719a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7720b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f7721c;

    /* renamed from: d  reason: collision with root package name */
    private final View f7722d;

    public zzcyx(zzdvi zzdvi, Context context, zzdla zzdla, ViewGroup viewGroup) {
        this.f7719a = zzdvi;
        this.f7720b = context;
        this.f7721c = zzdla;
        this.f7722d = viewGroup;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyy a() throws Exception {
        Context context = this.f7720b;
        zzvh zzvh = this.f7721c.f8167e;
        ArrayList arrayList = new ArrayList();
        View view = this.f7722d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzcyy(context, zzvh, arrayList);
    }

    public final zzdvf<zzcyy> b() {
        return this.f7719a.f(new er(this));
    }
}
