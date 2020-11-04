package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzbcm extends TextureView implements s7 {

    /* renamed from: b  reason: collision with root package name */
    protected final zzbcw f6150b = new zzbcw();

    /* renamed from: c  reason: collision with root package name */
    protected final zzbdg f6151c;

    public zzbcm(Context context) {
        super(context);
        this.f6151c = new zzbdg(context, this);
    }

    public abstract void c();

    public abstract void d();

    public abstract void g();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void h(int i);

    public abstract void i();

    public abstract void j(float f2, float f3);

    public abstract void k(zzbcj zzbcj);

    public void l(String str, String[] strArr) {
        setVideoPath(str);
    }

    public void m(int i) {
    }

    public void n(int i) {
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public void q(int i) {
    }

    public abstract String r();

    public abstract void setVideoPath(String str);
}
