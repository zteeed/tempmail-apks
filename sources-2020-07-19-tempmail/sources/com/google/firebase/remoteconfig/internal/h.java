package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f11492a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f11493b;

    private h(k kVar, Date date) {
        this.f11492a = kVar;
        this.f11493b = date;
    }

    public static Continuation a(k kVar, Date date) {
        return new h(kVar, date);
    }

    public Object then(Task task) {
        return k.n(this.f11492a, this.f11493b, task);
    }
}
