package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class l0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture f11770a;

    l0(ScheduledFuture scheduledFuture) {
        this.f11770a = scheduledFuture;
    }

    public final void a(Task task) {
        this.f11770a.cancel(false);
    }
}
