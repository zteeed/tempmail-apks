package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

final class g0 implements IBinder.DeathRecipient, h0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<BasePendingResult<?>> f2783a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<zac> f2784b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<IBinder> f2785c;

    private g0(BasePendingResult<?> basePendingResult, zac zac, IBinder iBinder) {
        this.f2784b = new WeakReference<>(zac);
        this.f2783a = new WeakReference<>(basePendingResult);
        this.f2785c = new WeakReference<>(iBinder);
    }

    private final void b() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f2783a.get();
        zac zac = (zac) this.f2784b.get();
        if (!(zac == null || basePendingResult == null)) {
            zac.a(basePendingResult.o().intValue());
        }
        IBinder iBinder = (IBinder) this.f2785c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    public final void a(BasePendingResult<?> basePendingResult) {
        b();
    }

    public final void binderDied() {
        b();
    }

    /* synthetic */ g0(BasePendingResult basePendingResult, zac zac, IBinder iBinder, f0 f0Var) {
        this(basePendingResult, (zac) null, iBinder);
    }
}
