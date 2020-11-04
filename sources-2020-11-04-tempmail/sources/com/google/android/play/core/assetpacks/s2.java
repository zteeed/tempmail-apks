package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.b;
import java.util.List;

final /* synthetic */ class s2 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11389a;

    private s2(b0 b0Var) {
        this.f11389a = b0Var;
    }

    static b a(b0 b0Var) {
        return new s2(b0Var);
    }

    public final void onSuccess(Object obj) {
        this.f11389a.g((List) obj);
    }
}
