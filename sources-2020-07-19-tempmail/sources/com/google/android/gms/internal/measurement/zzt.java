package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzt extends zzz {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Bundle> f9823b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f9824c;

    public static <T> T y(Bundle bundle, Class<T> cls) {
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

    public final void B(Bundle bundle) {
        synchronized (this.f9823b) {
            try {
                this.f9823b.set(bundle);
                this.f9824c = true;
                this.f9823b.notify();
            } catch (Throwable th) {
                this.f9823b.notify();
                throw th;
            }
        }
    }

    public final String E(long j) {
        return (String) y(P(j), String.class);
    }

    public final Bundle P(long j) {
        Bundle bundle;
        synchronized (this.f9823b) {
            if (!this.f9824c) {
                try {
                    this.f9823b.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f9823b.get();
        }
        return bundle;
    }
}
