package com.google.android.gms.common.api.internal;

import a.e.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.q;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements LifecycleFragment {
    private static WeakHashMap<c, WeakReference<zzc>> b0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> Y = new a();
    /* access modifiers changed from: private */
    public int Z = 0;
    /* access modifiers changed from: private */
    public Bundle a0;

    public static zzc o2(c cVar) {
        zzc zzc;
        WeakReference weakReference = b0.get(cVar);
        if (weakReference != null && (zzc = (zzc) weakReference.get()) != null) {
            return zzc;
        }
        try {
            zzc zzc2 = (zzc) cVar.k0().Z("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.A0()) {
                zzc2 = new zzc();
                q j = cVar.k0().j();
                j.d(zzc2, "SupportLifecycleFragmentImpl");
                j.i();
            }
            b0.put(cVar, new WeakReference(zzc2));
            return zzc2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final void H0(int i, int i2, Intent intent) {
        super.H0(i, i2, intent);
        for (LifecycleCallback e2 : this.Y.values()) {
            e2.e(i, i2, intent);
        }
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        this.Z = 1;
        this.a0 = bundle;
        for (Map.Entry next : this.Y.entrySet()) {
            ((LifecycleCallback) next.getValue()).f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void R0() {
        super.R0();
        this.Z = 5;
        for (LifecycleCallback g : this.Y.values()) {
            g.g();
        }
    }

    public final void e(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Y.containsKey(str)) {
            this.Y.put(str, lifecycleCallback);
            if (this.Z > 0) {
                new zze(Looper.getMainLooper()).post(new u0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void i1() {
        super.i1();
        this.Z = 3;
        for (LifecycleCallback h : this.Y.values()) {
            h.h();
        }
    }

    public final void k1(Bundle bundle) {
        super.k1(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.Y.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void l1() {
        super.l1();
        this.Z = 2;
        for (LifecycleCallback j : this.Y.values()) {
            j.j();
        }
    }

    public final <T extends LifecycleCallback> T m(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.Y.get(str));
    }

    public final void m1() {
        super.m1();
        this.Z = 4;
        for (LifecycleCallback k : this.Y.values()) {
            k.k();
        }
    }

    public final /* synthetic */ Activity n() {
        return z();
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.t(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.Y.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
