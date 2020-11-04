package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class n0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11223a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11224b;

    n0(Context context, Intent intent) {
        this.f11223a = context;
        this.f11224b = intent;
    }

    public final Object then(Task task) {
        return c.b(this.f11223a, this.f11224b, task);
    }
}
