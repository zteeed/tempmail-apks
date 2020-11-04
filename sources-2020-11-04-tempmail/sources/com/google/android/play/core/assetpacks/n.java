package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.m;
import java.util.List;

final class n extends l<List<String>> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f11336d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(q qVar, m<List<String>> mVar) {
        super(qVar, mVar);
        this.f11336d = qVar;
    }

    public final void K(List<Bundle> list) {
        super.K(list);
        this.f11320b.e(q.e(this.f11336d, list));
    }
}
