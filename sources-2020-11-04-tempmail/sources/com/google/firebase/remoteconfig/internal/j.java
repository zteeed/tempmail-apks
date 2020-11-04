package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.k;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class j implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final k.a f12045a;

    private j(k.a aVar) {
        this.f12045a = aVar;
    }

    public static SuccessContinuation a(k.a aVar) {
        return new j(aVar);
    }

    public Task then(Object obj) {
        return Tasks.e(this.f12045a);
    }
}
