package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private final KeyPair f3463a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f3464b;

    @VisibleForTesting
    l(KeyPair keyPair, long j) {
        this.f3463a = keyPair;
        this.f3464b = j;
    }

    /* access modifiers changed from: private */
    public final String e() {
        return Base64.encodeToString(this.f3463a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String f() {
        return Base64.encodeToString(this.f3463a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    public final KeyPair a() {
        return this.f3463a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3464b != lVar.f3464b || !this.f3463a.getPublic().equals(lVar.f3463a.getPublic()) || !this.f3463a.getPrivate().equals(lVar.f3463a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.b(this.f3463a.getPublic(), this.f3463a.getPrivate(), Long.valueOf(this.f3464b));
    }
}
