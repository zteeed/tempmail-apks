package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

final class i extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IBinder f11488c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f11489d;

    i(k kVar, IBinder iBinder) {
        this.f11489d = kVar;
        this.f11488c = iBinder;
    }

    public final void a() {
        l lVar = this.f11489d.f11491a;
        lVar.k = (IInterface) lVar.g.a(this.f11488c);
        l.n(this.f11489d.f11491a);
        this.f11489d.f11491a.f11496e = false;
        for (Runnable run : this.f11489d.f11491a.f11495d) {
            run.run();
        }
        this.f11489d.f11491a.f11495d.clear();
    }
}
