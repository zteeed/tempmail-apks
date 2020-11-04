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
        public final int f2892b;

        /* renamed from: c  reason: collision with root package name */
        public final GoogleApiClient f2893c;

        /* renamed from: d  reason: collision with root package name */
        public final GoogleApiClient.OnConnectionFailedListener f2894d;

        /* renamed from: e  reason: collision with root package name */
        private final /* synthetic */ zaj f2895e;

        public final void b0(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            this.f2895e.n(connectionResult, this.f2892b);
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
                printWriter.append(str).append("GoogleApiClient #").print(r.f2892b);
                printWriter.println(":");
                r.f2893c.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public void j() {
        super.j();
        boolean z = this.f2901c;
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f2902d.get() == null) {
            for (int i = 0; i < this.g.size(); i++) {
                a r = r(i);
                if (r != null) {
                    r.f2893c.d();
                }
            }
        }
    }

    public void k() {
        super.k();
        for (int i = 0; i < this.g.size(); i++) {
            a r = r(i);
            if (r != null) {
                r.f2893c.e();
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
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = aVar.f2894d;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.b0(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        for (int i = 0; i < this.g.size(); i++) {
            a r = r(i);
            if (r != null) {
                r.f2893c.d();
            }
        }
    }

    public final void q(int i) {
        a aVar = this.g.get(i);
        this.g.remove(i);
        if (aVar != null) {
            aVar.f2893c.g(aVar);
            aVar.f2893c.e();
        }
    }
}
