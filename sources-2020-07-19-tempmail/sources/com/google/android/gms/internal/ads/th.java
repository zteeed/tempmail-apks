package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class th implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdw f4986a;

    /* renamed from: b  reason: collision with root package name */
    private final View f4987b;

    /* renamed from: c  reason: collision with root package name */
    private final WindowManager f4988c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4989d;

    th(zzcdw zzcdw, View view, WindowManager windowManager, zzdkk zzdkk) {
        this.f4986a = zzcdw;
        this.f4987b = view;
        this.f4988c = windowManager;
        this.f4989d = zzdkk;
    }

    public final void a(Object obj, Map map) {
        this.f4986a.b(this.f4987b, this.f4988c, this.f4989d, (zzbfn) obj, map);
    }
}
