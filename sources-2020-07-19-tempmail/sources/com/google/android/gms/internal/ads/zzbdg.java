package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f6182a;

    /* renamed from: b  reason: collision with root package name */
    private final s7 f6183b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6184c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6185d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6186e;

    /* renamed from: f  reason: collision with root package name */
    private float f6187f = 1.0f;

    public zzbdg(Context context, s7 s7Var) {
        this.f6182a = (AudioManager) context.getSystemService("audio");
        this.f6183b = s7Var;
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f6185d && !this.f6186e && this.f6187f > 0.0f;
        if (z4 && !(z2 = this.f6184c)) {
            AudioManager audioManager = this.f6182a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f6184c = z3;
            }
            this.f6183b.c();
        } else if (!z4 && (z = this.f6184c)) {
            AudioManager audioManager2 = this.f6182a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f6184c = z3;
            }
            this.f6183b.c();
        }
    }

    public final float a() {
        float f2 = this.f6186e ? 0.0f : this.f6187f;
        if (this.f6184c) {
            return f2;
        }
        return 0.0f;
    }

    public final void b(boolean z) {
        this.f6186e = z;
        f();
    }

    public final void c(float f2) {
        this.f6187f = f2;
        f();
    }

    public final void d() {
        this.f6185d = true;
        f();
    }

    public final void e() {
        this.f6185d = false;
        f();
    }

    public final void onAudioFocusChange(int i) {
        this.f6184c = i > 0;
        this.f6183b.c();
    }
}
