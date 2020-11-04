package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class n0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11773a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11774b;

    n0(Context context, Intent intent) {
        this.f11773a = context;
        this.f11774b = intent;
    }

    public final Object then(Task task) {
        return c.b(this.f11773a, this.f11774b, task);
    }
}
