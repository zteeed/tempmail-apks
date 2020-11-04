package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzq;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclv implements AppEventListener, zzbsl, zzbsq, zzbtd, zzbtg, zzbua, zzbva, zzdpa, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f7407b;

    /* renamed from: c  reason: collision with root package name */
    private final zzclj f7408c;

    /* renamed from: d  reason: collision with root package name */
    private long f7409d;

    public zzclv(zzclj zzclj, zzbif zzbif) {
        this.f7408c = zzclj;
        this.f7407b = Collections.singletonList(zzbif);
    }

    private final void g(Class<?> cls, String str, Object... objArr) {
        zzclj zzclj = this.f7408c;
        List<Object> list = this.f7407b;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzclj.a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    public final void B(zzdkw zzdkw) {
    }

    public final void C(zzasm zzasm) {
        this.f7409d = zzq.zzld().b();
        g(zzbva.class, "onAdRequest", new Object[0]);
    }

    public final void a(zzdor zzdor, String str) {
        g(zzdos.class, "onTaskCreated", str);
    }

    public final void b(zzdor zzdor, String str) {
        g(zzdos.class, "onTaskStarted", str);
    }

    public final void c(zzdor zzdor, String str) {
        g(zzdos.class, "onTaskSucceeded", str);
    }

    @ParametersAreNonnullByDefault
    public final void d(zzatg zzatg, String str, String str2) {
        g(zzbsl.class, "onRewarded", zzatg, str, str2);
    }

    public final void e(zzdor zzdor, String str, Throwable th) {
        g(zzdos.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void f(Context context) {
        g(zzbtg.class, "onDestroy", context);
    }

    public final void k(Context context) {
        g(zzbtg.class, "onResume", context);
    }

    public final void onAdClicked() {
        g(zzuu.class, "onAdClicked", new Object[0]);
    }

    public final void onAdClosed() {
        g(zzbsl.class, "onAdClosed", new Object[0]);
    }

    public final void onAdFailedToLoad(int i) {
        g(zzbsq.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    public final void onAdImpression() {
        g(zzbtd.class, "onAdImpression", new Object[0]);
    }

    public final void onAdLeftApplication() {
        g(zzbsl.class, "onAdLeftApplication", new Object[0]);
    }

    public final void onAdLoaded() {
        long b2 = zzq.zzld().b() - this.f7409d;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b2);
        zzaxv.m(sb.toString());
        g(zzbua.class, "onAdLoaded", new Object[0]);
    }

    public final void onAdOpened() {
        g(zzbsl.class, "onAdOpened", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        g(AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void onRewardedVideoCompleted() {
        g(zzbsl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void onRewardedVideoStarted() {
        g(zzbsl.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void r(Context context) {
        g(zzbtg.class, "onPause", context);
    }
}
