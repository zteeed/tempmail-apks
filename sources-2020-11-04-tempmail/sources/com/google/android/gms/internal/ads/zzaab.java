package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaab extends zzym {

    /* renamed from: b  reason: collision with root package name */
    private final VideoController.VideoLifecycleCallbacks f5699b;

    public zzaab(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f5699b = videoLifecycleCallbacks;
    }

    public final void Y() {
        this.f5699b.onVideoEnd();
    }

    public final void onVideoPause() {
        this.f5699b.onVideoPause();
    }

    public final void onVideoPlay() {
        this.f5699b.onVideoPlay();
    }

    public final void onVideoStart() {
        this.f5699b.onVideoStart();
    }

    public final void t0(boolean z) {
        this.f5699b.onVideoMute(z);
    }
}
