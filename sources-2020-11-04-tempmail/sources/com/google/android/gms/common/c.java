package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class c extends zzj {

    /* renamed from: b  reason: collision with root package name */
    private int f3108b;

    protected c(byte[] bArr) {
        Preconditions.a(bArr.length == 25);
        this.f3108b = Arrays.hashCode(bArr);
    }

    protected static byte[] h0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] V();

    public final IObjectWrapper b() {
        return ObjectWrapper.h0(V());
    }

    public final int c() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        IObjectWrapper b2;
        if (obj != null && (obj instanceof zzi)) {
            try {
                zzi zzi = (zzi) obj;
                if (zzi.c() != hashCode() || (b2 = zzi.b()) == null) {
                    return false;
                }
                return Arrays.equals(V(), (byte[]) ObjectWrapper.V(b2));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f3108b;
    }
}
