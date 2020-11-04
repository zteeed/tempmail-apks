package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: HandlerPoster */
public class e extends Handler implements k {

    /* renamed from: b  reason: collision with root package name */
    private final j f14462b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final int f14463c;

    /* renamed from: d  reason: collision with root package name */
    private final c f14464d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14465e;

    protected e(c cVar, Looper looper, int i) {
        super(looper);
        this.f14464d = cVar;
        this.f14463c = i;
    }

    public void a(p pVar, Object obj) {
        i a2 = i.a(pVar, obj);
        synchronized (this) {
            this.f14462b.a(a2);
            if (!this.f14465e) {
                this.f14465e = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b2 = this.f14462b.b();
                if (b2 == null) {
                    synchronized (this) {
                        b2 = this.f14462b.b();
                        if (b2 == null) {
                            this.f14465e = false;
                            this.f14465e = false;
                            return;
                        }
                    }
                }
                this.f14464d.g(b2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f14463c));
            if (sendMessage(obtainMessage())) {
                this.f14465e = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f14465e = false;
            throw th;
        }
    }
}
