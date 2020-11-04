package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzgk {

    /* renamed from: a  reason: collision with root package name */
    private final zzex f8693a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8694b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8695c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Method f8696d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?>[] f8697e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f8698f = new CountDownLatch(1);

    public zzgk(zzex zzex, String str, String str2, Class<?>... clsArr) {
        this.f8693a = zzex;
        this.f8694b = str;
        this.f8695c = str2;
        this.f8697e = clsArr;
        zzex.r().submit(new ma0(this));
    }

    private final String b(byte[] bArr, String str) throws zzeh, UnsupportedEncodingException {
        return new String(this.f8693a.t().b(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    public final void c() {
        try {
            Class loadClass = this.f8693a.s().loadClass(b(this.f8693a.u(), this.f8694b));
            if (loadClass != null) {
                this.f8696d = loadClass.getMethod(b(this.f8693a.u(), this.f8695c), this.f8697e);
                if (this.f8696d == null) {
                    this.f8698f.countDown();
                } else {
                    this.f8698f.countDown();
                }
            }
        } catch (zzeh unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f8698f.countDown();
        }
    }

    public final Method d() {
        if (this.f8696d != null) {
            return this.f8696d;
        }
        try {
            if (!this.f8698f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f8696d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
