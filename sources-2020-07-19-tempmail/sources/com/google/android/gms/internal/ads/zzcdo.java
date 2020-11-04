package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdo {

    /* renamed from: a  reason: collision with root package name */
    private final zzchw f6894a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcgr f6895b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbmh f6896c;

    /* renamed from: d  reason: collision with root package name */
    private final zzccs f6897d;

    public zzcdo(zzchw zzchw, zzcgr zzcgr, zzbmh zzbmh, zzccs zzccs) {
        this.f6894a = zzchw;
        this.f6895b = zzcgr;
        this.f6896c = zzbmh;
        this.f6897d = zzccs;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzbfn zzbfn, Map map) {
        zzbba.h("Hiding native ads overlay.");
        zzbfn.getView().setVisibility(8);
        this.f6896c.s(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f6895b.e("sendMessageToNativeJs", hashMap);
    }

    public final View c() throws zzbfz {
        zzbfn a2 = this.f6894a.a(zzvh.B(), false);
        a2.getView().setVisibility(8);
        a2.c("/sendMessageToSdk", new kh(this));
        a2.c("/adMuted", new jh(this));
        this.f6895b.f(new WeakReference(a2), "/loadHtml", new mh(this));
        this.f6895b.f(new WeakReference(a2), "/showOverlay", new lh(this));
        this.f6895b.f(new WeakReference(a2), "/hideOverlay", new oh(this));
        return a2.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbfn zzbfn, Map map) {
        zzbba.h("Showing native ads overlay.");
        zzbfn.getView().setVisibility(0);
        this.f6896c.s(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzbfn zzbfn, Map map) {
        this.f6897d.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(zzbfn zzbfn, Map map) {
        this.f6895b.e("sendMessageToNativeJs", map);
    }
}
