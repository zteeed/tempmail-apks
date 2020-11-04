package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.n;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private z2 f11366a;

    /* synthetic */ q0(byte[] bArr) {
    }

    public final d a() {
        z2 z2Var = this.f11366a;
        if (z2Var != null) {
            return new r0(z2Var);
        }
        throw new IllegalStateException(String.valueOf(z2.class.getCanonicalName()).concat(" must be set"));
    }

    public final void b(z2 z2Var) {
        n.b(z2Var);
        this.f11366a = z2Var;
    }
}
