package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hh implements zzadh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcee f3974a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ViewGroup f3975b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcdg f3976c;

    hh(zzcdg zzcdg, zzcee zzcee, ViewGroup viewGroup) {
        this.f3976c = zzcdg;
        this.f3974a = zzcee;
        this.f3975b = viewGroup;
    }

    public final void a() {
        if (zzcdg.e(this.f3974a, zzcde.o)) {
            this.f3974a.onClick(this.f3975b);
        }
    }

    public final void b(MotionEvent motionEvent) {
        this.f3974a.onTouch((View) null, motionEvent);
    }
}
