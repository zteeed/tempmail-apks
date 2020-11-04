package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.m;

final class p extends l<Void> {

    /* renamed from: d  reason: collision with root package name */
    final int f11352d;

    /* renamed from: e  reason: collision with root package name */
    final String f11353e;

    /* renamed from: f  reason: collision with root package name */
    final int f11354f;
    final /* synthetic */ q g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(q qVar, m<Void> mVar, int i, String str, int i2) {
        super(qVar, mVar);
        this.g = qVar;
        this.f11352d = i;
        this.f11353e = str;
        this.f11354f = i2;
    }

    public final void l(Bundle bundle) {
        this.g.f11363c.b();
        int i = bundle.getInt("error_code");
        q.f11360f.e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f11354f;
        if (i2 > 0) {
            this.g.f(this.f11352d, this.f11353e, i2 - 1);
        }
    }
}
