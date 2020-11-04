package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zaj extends zal {
    private final SparseArray<a> g;

    private class a implements GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: b  reason: collision with root package name */
        public final int f3080b;

        /* renamed from: c  reason: collision with root package name */
        public final GoogleApiClient f3081c;

        /* renamed from: d  reason: collision with root package name */
        public final GoogleApiClient.OnConnectionFailedListener f3082d;

        /* renamed from: e  reason: collision with root package name */
        private final /* synthetic */ zaj f3083e;

        public final void h0(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            this.f3083e.n(connectionResult, this.f3080b);
        }
    }

    private final a r(int i) {
        if (this.g.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.g;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.g.size(); i++) {
            a r = r(i);
            if (r != null) {
                printWriter.append(str).append("GoogleApiClient #").print(r.f3080b);
                printWriter.println(":");
                r.f3081c.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public void j() {
        super.j();
        boolean z = this.f3089c;
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f3090d.get() == null) {
            for (int i = 0; i < this.g.size(); i++) {
                a r = r(i);
                if (r != null) {
                    r.f3081c.d();
                }
            }
        }
    }

    public void k() {
        super.k();
        for (int i = 0; i < this.g.size(); i++) {
            a r = r(i);
            if (r != null) {
                r.f3081c.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void m(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.g.get(i);
        if (aVar != null) {
            q(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = aVar.f3082d;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.h0(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        for (int i = 0; i < this.g.size(); i++) {
            a r = r(i);
            if (r != null) {
                r.f3081c.d();
            }
        }
    }

    public final void q(int i) {
        a aVar = this.g.get(i);
        this.g.remove(i);
        if (aVar != null) {
            aVar.f3081c.g(aVar);
            aVar.f3081c.e();
        }
    }
}
