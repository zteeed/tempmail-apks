package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final /* synthetic */ class o implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f11428a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11429b;

    o(k kVar, Intent intent) {
        this.f11428a = kVar;
        this.f11429b = intent;
    }

    public final void a(Task task) {
        this.f11428a.b(this.f11429b, task);
    }
}
