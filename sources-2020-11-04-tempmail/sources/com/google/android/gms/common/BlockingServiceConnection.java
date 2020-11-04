package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2839a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<IBinder> f2840b = new LinkedBlockingQueue();

    @KeepForSdk
    public IBinder a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f2839a) {
            this.f2839a = true;
            IBinder poll = this.f2840b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2840b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
