package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class i0 extends ContentObserver {
    i0(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzcg.f9578e.set(true);
    }
}
