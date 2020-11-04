package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import com.tempmail.m.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class az implements zzdpp {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3591a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdrc f3592b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdrl f3593c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpm f3594d;

    az(Object obj, zzdrc zzdrc, zzdrl zzdrl, zzdpm zzdpm) {
        this.f3591a = obj;
        this.f3592b = zzdrc;
        this.f3593c = zzdrl;
        this.f3594d = zzdpm;
    }

    private final synchronized byte[] i(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.f3594d.b(2007, System.currentTimeMillis() - currentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.f3591a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f3591a, new Object[]{null, map2});
    }

    private static String j(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzcf.zzf.zza M = zzcf.zzf.M();
        M.w(zzcm.DG);
        M.x(zzeer.U(bArr));
        return Base64.encodeToString(((zzcf.zzf) ((zzegb) M.O())).g(), 11);
    }

    public final synchronized void a(String str, MotionEvent motionEvent) throws zzdrj {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f3591a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f3591a, new Object[]{hashMap});
            this.f3594d.h(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzdrj(2005, (Throwable) e2);
        }
    }

    public final synchronized String b(Context context, String str) {
        Map<String, Object> a2;
        a2 = this.f3593c.a();
        a2.put("f", "q");
        a2.put("ctx", context);
        a2.put("aid", (Object) null);
        return j(i((Map<String, String>) null, a2));
    }

    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> c2;
        c2 = this.f3593c.c();
        c2.put("f", c.f12927e);
        c2.put("ctx", context);
        c2.put("cs", str2);
        c2.put("aid", (Object) null);
        c2.put("view", view);
        c2.put("act", activity);
        return j(i((Map<String, String>) null, c2));
    }

    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map<String, Object> b2;
        b2 = this.f3593c.b();
        b2.put("f", "v");
        b2.put("ctx", context);
        b2.put("aid", (Object) null);
        b2.put("view", view);
        b2.put("act", activity);
        return j(i((Map<String, String>) null, b2));
    }

    public final synchronized void e() throws zzdrj {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f3591a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f3591a, new Object[0]);
            this.f3594d.h(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzdrj(2003, (Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzdrc f() {
        return this.f3592b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g() throws zzdrj {
        try {
        } catch (Exception e2) {
            throw new zzdrj(2001, (Throwable) e2);
        }
        return ((Boolean) this.f3591a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f3591a, new Object[0])).booleanValue();
    }

    public final synchronized int h() throws zzdrj {
        try {
        } catch (Exception e2) {
            throw new zzdrj(2006, (Throwable) e2);
        }
        return ((Integer) this.f3591a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f3591a, new Object[0])).intValue();
    }
}
