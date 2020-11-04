package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

final class m extends zac {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<zaak> f2991b;

    m(zaak zaak) {
        this.f2991b = new WeakReference<>(zaak);
    }

    public final void b1(zaj zaj) {
        zaak zaak = (zaak) this.f2991b.get();
        if (zaak != null) {
            zaak.f3025a.d(new n(this, zaak, zaak, zaj));
        }
    }
}
