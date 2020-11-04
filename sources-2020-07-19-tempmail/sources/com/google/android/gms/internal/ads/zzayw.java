package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzayw {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6062a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f6063b = 1.0f;

    public static float c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean f() {
        return this.f6063b >= 0.0f;
    }

    public final synchronized void a(boolean z) {
        this.f6062a = z;
    }

    public final synchronized void b(float f2) {
        this.f6063b = f2;
    }

    public final synchronized float d() {
        if (!f()) {
            return 1.0f;
        }
        return this.f6063b;
    }

    public final synchronized boolean e() {
        return this.f6062a;
    }
}
