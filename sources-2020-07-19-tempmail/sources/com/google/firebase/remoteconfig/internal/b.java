package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class b implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final e f11471a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11472b;

    /* renamed from: c  reason: collision with root package name */
    private final f f11473c;

    private b(e eVar, boolean z, f fVar) {
        this.f11471a = eVar;
        this.f11472b = z;
        this.f11473c = fVar;
    }

    public static SuccessContinuation a(e eVar, boolean z, f fVar) {
        return new b(eVar, z, fVar);
    }

    public Task then(Object obj) {
        return e.h(this.f11471a, this.f11472b, this.f11473c, (Void) obj);
    }
}
