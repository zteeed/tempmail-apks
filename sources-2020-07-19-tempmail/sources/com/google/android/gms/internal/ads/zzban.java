package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzban {

    /* renamed from: a  reason: collision with root package name */
    private final View f6106a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f6107b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6108c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6109d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6110e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f6111f;

    public zzban(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f6107b = activity;
        this.f6106a = view;
        this.f6111f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver d(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        ViewTreeObserver d2;
        if (!this.f6108c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6111f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f6107b;
                if (!(activity == null || (d2 = d(activity)) == null)) {
                    d2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                zzq.zzlt();
                zzbbv.a(this.f6106a, this.f6111f);
            }
            this.f6108c = true;
        }
    }

    private final void h() {
        ViewTreeObserver d2;
        Activity activity = this.f6107b;
        if (activity != null && this.f6108c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6111f;
            if (!(onGlobalLayoutListener == null || (d2 = d(activity)) == null)) {
                zzq.zzky();
                d2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f6108c = false;
        }
    }

    public final void a() {
        this.f6109d = true;
        if (this.f6110e) {
            g();
        }
    }

    public final void b() {
        this.f6109d = false;
        h();
    }

    public final void c(Activity activity) {
        this.f6107b = activity;
    }

    public final void e() {
        this.f6110e = true;
        if (this.f6109d) {
            g();
        }
    }

    public final void f() {
        this.f6110e = false;
        h();
    }
}
