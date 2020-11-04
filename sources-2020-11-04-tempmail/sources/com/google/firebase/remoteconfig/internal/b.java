package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class b implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final e f12020a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12021b;

    /* renamed from: c  reason: collision with root package name */
    private final f f12022c;

    private b(e eVar, boolean z, f fVar) {
        this.f12020a = eVar;
        this.f12021b = z;
        this.f12022c = fVar;
    }

    public static SuccessContinuation a(e eVar, boolean z, f fVar) {
        return new b(eVar, z, fVar);
    }

    public Task then(Object obj) {
        return e.h(this.f12020a, this.f12021b, this.f12022c, (Void) obj);
    }
}
