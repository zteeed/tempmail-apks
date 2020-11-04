package com.google.android.gms.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.gcm.zzj;

final class e extends zzj {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaf f3450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(zzaf zzaf, Looper looper) {
        super(looper);
        this.f3450a = zzaf;
    }

    public final void handleMessage(Message message) {
        this.f3450a.f(message);
    }
}
