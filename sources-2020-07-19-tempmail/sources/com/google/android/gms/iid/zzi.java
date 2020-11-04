package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class zzi extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zze f3316b;

    zzi(zze zze) {
        this.f3316b = zze;
    }

    public final void b(h hVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f3316b.f3311b.execute(new j(this, hVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
