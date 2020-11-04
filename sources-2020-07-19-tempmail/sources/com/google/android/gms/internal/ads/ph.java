package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ph implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdw f4642a;

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager f4643b;

    /* renamed from: c  reason: collision with root package name */
    private final View f4644c;

    ph(zzcdw zzcdw, WindowManager windowManager, View view) {
        this.f4642a = zzcdw;
        this.f4643b = windowManager;
        this.f4644c = view;
    }

    public final void a(Object obj, Map map) {
        this.f4642a.c(this.f4643b, this.f4644c, (zzbfn) obj, map);
    }
}
