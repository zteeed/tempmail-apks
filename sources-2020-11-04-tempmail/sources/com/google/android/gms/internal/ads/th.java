package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class th implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdw f5169a;

    /* renamed from: b  reason: collision with root package name */
    private final View f5170b;

    /* renamed from: c  reason: collision with root package name */
    private final WindowManager f5171c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f5172d;

    th(zzcdw zzcdw, View view, WindowManager windowManager, zzdkk zzdkk) {
        this.f5169a = zzcdw;
        this.f5170b = view;
        this.f5171c = windowManager;
        this.f5172d = zzdkk;
    }

    public final void a(Object obj, Map map) {
        this.f5169a.b(this.f5170b, this.f5171c, this.f5172d, (zzbfn) obj, map);
    }
}
