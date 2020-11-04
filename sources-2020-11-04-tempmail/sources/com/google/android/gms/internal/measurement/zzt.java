package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzt extends zzz {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Bundle> f10006b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f10007c;

    public static <T> T B(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e2);
            throw e2;
        }
    }

    public final void E(Bundle bundle) {
        synchronized (this.f10006b) {
            try {
                this.f10006b.set(bundle);
                this.f10007c = true;
                this.f10006b.notify();
            } catch (Throwable th) {
                this.f10006b.notify();
                throw th;
            }
        }
    }

    public final String H(long j) {
        return (String) B(V(j), String.class);
    }

    public final Bundle V(long j) {
        Bundle bundle;
        synchronized (this.f10006b) {
            if (!this.f10007c) {
                try {
                    this.f10006b.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f10006b.get();
        }
        return bundle;
    }
}
