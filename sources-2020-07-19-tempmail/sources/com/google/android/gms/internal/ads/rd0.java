package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzow;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class rd0<T extends zzow> extends Handler implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final T f4816b;

    /* renamed from: c  reason: collision with root package name */
    private final zzou<T> f4817c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4818d;

    /* renamed from: e  reason: collision with root package name */
    private final long f4819e;

    /* renamed from: f  reason: collision with root package name */
    private IOException f4820f;
    private int g;
    private volatile Thread h;
    private volatile boolean i;
    private final /* synthetic */ zzov j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd0(zzov zzov, Looper looper, T t, zzou<T> zzou, int i2, long j2) {
        super(looper);
        this.j = zzov;
        this.f4816b = t;
        this.f4817c = zzou;
        this.f4818d = i2;
        this.f4819e = j2;
    }

    private final void a() {
        this.f4820f = null;
        this.j.f8964a.execute(this.j.f8965b);
    }

    private final void b() {
        rd0 unused = this.j.f8965b = null;
    }

    public final void c(int i2) throws IOException {
        IOException iOException = this.f4820f;
        if (iOException != null && this.g > i2) {
            throw iOException;
        }
    }

    public final void d(long j2) {
        zzpb.e(this.j.f8965b == null);
        rd0 unused = this.j.f8965b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            a();
        }
    }

    public final void e(boolean z) {
        this.i = z;
        this.f4820f = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f4816b.b();
            if (this.h != null) {
                this.h.interrupt();
            }
        }
        if (z) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f4817c.h(this.f4816b, elapsedRealtime, elapsedRealtime - this.f4819e, true);
        }
    }

    public final void handleMessage(Message message) {
        int i2;
        if (!this.i) {
            int i3 = message.what;
            if (i3 == 0) {
                a();
            } else if (i3 != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f4819e;
                if (this.f4816b.a()) {
                    this.f4817c.h(this.f4816b, elapsedRealtime, j2, false);
                    return;
                }
                int i4 = message.what;
                if (i4 == 1) {
                    this.f4817c.h(this.f4816b, elapsedRealtime, j2, false);
                } else if (i4 == 2) {
                    this.f4817c.k(this.f4816b, elapsedRealtime, j2);
                } else if (i4 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f4820f = iOException;
                    int c2 = this.f4817c.c(this.f4816b, elapsedRealtime, j2, iOException);
                    if (c2 == 3) {
                        IOException unused = this.j.f8966c = this.f4820f;
                    } else if (c2 != 2) {
                        if (c2 == 1) {
                            i2 = 1;
                        } else {
                            i2 = this.g + 1;
                        }
                        this.g = i2;
                        d((long) Math.min((i2 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.h = Thread.currentThread();
            if (!this.f4816b.a()) {
                String valueOf = String.valueOf(this.f4816b.getClass().getSimpleName());
                zzpp.a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.f4816b.c();
                zzpp.b();
            }
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.i) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzpb.e(this.f4816b.a());
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.i) {
                obtainMessage(3, new zzoz(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.i) {
                obtainMessage(3, new zzoz(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.i) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            zzpp.b();
            throw th;
        }
    }
}