package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class RemoteCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3380a;

    /* renamed from: b  reason: collision with root package name */
    private T f3381b;

    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(String str) {
        this.f3380a = str;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final T b(Context context) throws RemoteCreatorException {
        if (this.f3381b == null) {
            Preconditions.k(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f3381b = a((IBinder) remoteContext.getClassLoader().loadClass(this.f3380a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new RemoteCreatorException("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new RemoteCreatorException("Could not access creator.", e4);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f3381b;
    }
}
