package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrm {
    private static final HashMap<String, Class<?>> g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final Context f8348a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdrl f8349b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdpm f8350c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpk f8351d;

    /* renamed from: e  reason: collision with root package name */
    private az f8352e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f8353f = new Object();

    public zzdrm(Context context, zzdrl zzdrl, zzdpm zzdpm, zzdpk zzdpk) {
        this.f8348a = context;
        this.f8349b = zzdrl;
        this.f8350c = zzdpm;
        this.f8351d = zzdpk;
    }

    private final synchronized Class<?> a(zzdrc zzdrc) throws zzdrj {
        if (zzdrc.b() != null) {
            String R = zzdrc.b().R();
            Class<?> cls = g.get(R);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.f8351d.a(zzdrc.c())) {
                    File d2 = zzdrc.d();
                    if (!d2.exists()) {
                        d2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzdrc.c().getAbsolutePath(), d2.getAbsolutePath(), (String) null, this.f8348a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    g.put(R, loadClass);
                    return loadClass;
                }
                throw new zzdrj(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e2) {
                throw new zzdrj(2026, (Throwable) e2);
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e3) {
                throw new zzdrj(2008, e3);
            }
        } else {
            throw new zzdrj(4010, "mc");
        }
    }

    private final Object b(Class<?> cls, zzdrc zzdrc) throws zzdrj {
        try {
            return cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f8348a, "msa-r", zzdrc.e(), null, new Bundle(), 2});
        } catch (Exception e2) {
            throw new zzdrj(2004, (Throwable) e2);
        }
    }

    public final zzdpp c() {
        az azVar;
        synchronized (this.f8353f) {
            azVar = this.f8352e;
        }
        return azVar;
    }

    public final zzdrc d() {
        synchronized (this.f8353f) {
            if (this.f8352e == null) {
                return null;
            }
            zzdrc f2 = this.f8352e.f();
            return f2;
        }
    }

    public final void e(zzdrc zzdrc) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            az azVar = new az(b(a(zzdrc), zzdrc), zzdrc, this.f8349b, this.f8350c);
            if (azVar.g()) {
                int h = azVar.h();
                if (h == 0) {
                    synchronized (this.f8353f) {
                        if (this.f8352e != null) {
                            try {
                                this.f8352e.e();
                            } catch (zzdrj e2) {
                                this.f8350c.b(e2.a(), -1, e2);
                            }
                        }
                        this.f8352e = azVar;
                    }
                    this.f8350c.h(3000, System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(h);
                throw new zzdrj(4001, sb.toString());
            }
            throw new zzdrj(4000, "init failed");
        } catch (zzdrj e3) {
            this.f8350c.b(e3.a(), System.currentTimeMillis() - currentTimeMillis, e3);
        } catch (Exception e4) {
            this.f8350c.b(4010, System.currentTimeMillis() - currentTimeMillis, e4);
        }
    }
}
