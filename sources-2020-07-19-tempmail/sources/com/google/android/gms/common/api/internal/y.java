package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.BaseGmsClient;

final class y implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GoogleApiManager.zaa f2830a;

    y(GoogleApiManager.zaa zaa) {
        this.f2830a = zaa;
    }

    public final void a() {
        GoogleApiManager.this.n.post(new z(this));
    }
}
