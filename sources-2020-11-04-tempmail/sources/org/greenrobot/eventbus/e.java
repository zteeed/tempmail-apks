package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: HandlerPoster */
public class e extends Handler implements k {

    /* renamed from: b  reason: collision with root package name */
    private final j f15020b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final int f15021c;

    /* renamed from: d  reason: collision with root package name */
    private final c f15022d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15023e;

    protected e(c cVar, Looper looper, int i) {
        super(looper);
        this.f15022d = cVar;
        this.f15021c = i;
    }

    public void a(p pVar, Object obj) {
        i a2 = i.a(pVar, obj);
        synchronized (this) {
            this.f15020b.a(a2);
            if (!this.f15023e) {
                this.f15023e = true;
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
                i b2 = this.f15020b.b();
                if (b2 == null) {
                    synchronized (this) {
                        b2 = this.f15020b.b();
                        if (b2 == null) {
                            this.f15023e = false;
                            this.f15023e = false;
                            return;
                        }
                    }
                }
                this.f15022d.g(b2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f15021c));
            if (sendMessage(obtainMessage())) {
                this.f15023e = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f15023e = false;
            throw th;
        }
    }
}
