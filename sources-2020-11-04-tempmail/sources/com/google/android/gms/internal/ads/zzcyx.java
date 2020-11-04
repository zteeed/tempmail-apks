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
    private final zzdvi f7902a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7903b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f7904c;

    /* renamed from: d  reason: collision with root package name */
    private final View f7905d;

    public zzcyx(zzdvi zzdvi, Context context, zzdla zzdla, ViewGroup viewGroup) {
        this.f7902a = zzdvi;
        this.f7903b = context;
        this.f7904c = zzdla;
        this.f7905d = viewGroup;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyy a() throws Exception {
        Context context = this.f7903b;
        zzvh zzvh = this.f7904c.f8350e;
        ArrayList arrayList = new ArrayList();
        View view = this.f7905d;
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
        return this.f7902a.f(new er(this));
    }
}
