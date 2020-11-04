package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class l0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture f11220a;

    l0(ScheduledFuture scheduledFuture) {
        this.f11220a = scheduledFuture;
    }

    public final void a(Task task) {
        this.f11220a.cancel(false);
    }
}
