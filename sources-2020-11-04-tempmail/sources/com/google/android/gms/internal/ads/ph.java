package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ph implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdw f4825a;

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager f4826b;

    /* renamed from: c  reason: collision with root package name */
    private final View f4827c;

    ph(zzcdw zzcdw, WindowManager windowManager, View view) {
        this.f4825a = zzcdw;
        this.f4826b = windowManager;
        this.f4827c = view;
    }

    public final void a(Object obj, Map map) {
        this.f4825a.c(this.f4826b, this.f4827c, (zzbfn) obj, map);
    }
}
