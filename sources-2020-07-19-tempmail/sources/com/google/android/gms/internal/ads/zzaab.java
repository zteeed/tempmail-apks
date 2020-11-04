package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaab extends zzym {

    /* renamed from: b  reason: collision with root package name */
    private final VideoController.VideoLifecycleCallbacks f5516b;

    public zzaab(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f5516b = videoLifecycleCallbacks;
    }

    public final void S() {
        this.f5516b.onVideoEnd();
    }

    public final void n0(boolean z) {
        this.f5516b.onVideoMute(z);
    }

    public final void onVideoPause() {
        this.f5516b.onVideoPause();
    }

    public final void onVideoPlay() {
        this.f5516b.onVideoPlay();
    }

    public final void onVideoStart() {
        this.f5516b.onVideoStart();
    }
}
