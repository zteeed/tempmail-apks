package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final /* synthetic */ class o implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f11977a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11978b;

    o(k kVar, Intent intent) {
        this.f11977a = kVar;
        this.f11978b = intent;
    }

    public final void a(Task task) {
        this.f11977a.b(this.f11978b, task);
    }
}
