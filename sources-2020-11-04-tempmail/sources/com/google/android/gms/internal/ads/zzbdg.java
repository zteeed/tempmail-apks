package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f6365a;

    /* renamed from: b  reason: collision with root package name */
    private final s7 f6366b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6367c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6368d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6369e;

    /* renamed from: f  reason: collision with root package name */
    private float f6370f = 1.0f;

    public zzbdg(Context context, s7 s7Var) {
        this.f6365a = (AudioManager) context.getSystemService("audio");
        this.f6366b = s7Var;
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f6368d && !this.f6369e && this.f6370f > 0.0f;
        if (z4 && !(z2 = this.f6367c)) {
            AudioManager audioManager = this.f6365a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f6367c = z3;
            }
            this.f6366b.c();
        } else if (!z4 && (z = this.f6367c)) {
            AudioManager audioManager2 = this.f6365a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f6367c = z3;
            }
            this.f6366b.c();
        }
    }

    public final float a() {
        float f2 = this.f6369e ? 0.0f : this.f6370f;
        if (this.f6367c) {
            return f2;
        }
        return 0.0f;
    }

    public final void b(boolean z) {
        this.f6369e = z;
        f();
    }

    public final void c(float f2) {
        this.f6370f = f2;
        f();
    }

    public final void d() {
        this.f6368d = true;
        f();
    }

    public final void e() {
        this.f6368d = false;
        f();
    }

    public final void onAudioFocusChange(int i) {
        this.f6367c = i > 0;
        this.f6366b.c();
    }
}
