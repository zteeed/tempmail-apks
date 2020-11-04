package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hh implements zzadh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcee f4157a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ViewGroup f4158b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcdg f4159c;

    hh(zzcdg zzcdg, zzcee zzcee, ViewGroup viewGroup) {
        this.f4159c = zzcdg;
        this.f4157a = zzcee;
        this.f4158b = viewGroup;
    }

    public final void a() {
        if (zzcdg.e(this.f4157a, zzcde.o)) {
            this.f4157a.onClick(this.f4158b);
        }
    }

    public final void b(MotionEvent motionEvent) {
        this.f4157a.onTouch((View) null, motionEvent);
    }
}
