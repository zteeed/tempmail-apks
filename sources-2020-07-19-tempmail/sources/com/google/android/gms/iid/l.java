package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private final KeyPair f3280a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f3281b;

    @VisibleForTesting
    l(KeyPair keyPair, long j) {
        this.f3280a = keyPair;
        this.f3281b = j;
    }

    /* access modifiers changed from: private */
    public final String e() {
        return Base64.encodeToString(this.f3280a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String f() {
        return Base64.encodeToString(this.f3280a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    public final KeyPair a() {
        return this.f3280a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3281b != lVar.f3281b || !this.f3280a.getPublic().equals(lVar.f3280a.getPublic()) || !this.f3280a.getPrivate().equals(lVar.f3280a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.b(this.f3280a.getPublic(), this.f3280a.getPrivate(), Long.valueOf(this.f3281b));
    }
}
