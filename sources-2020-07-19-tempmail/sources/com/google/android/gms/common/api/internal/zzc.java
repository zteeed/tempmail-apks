package com.google.android.gms.common.api.internal;

import a.e.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.j;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements LifecycleFragment {
    private static WeakHashMap<c, WeakReference<zzc>> c0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> Z = new a();
    /* access modifiers changed from: private */
    public int a0 = 0;
    /* access modifiers changed from: private */
    public Bundle b0;

    public static zzc i2(c cVar) {
        zzc zzc;
        WeakReference weakReference = c0.get(cVar);
        if (weakReference != null && (zzc = (zzc) weakReference.get()) != null) {
            return zzc;
        }
        try {
            zzc zzc2 = (zzc) cVar.k0().f("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.x0()) {
                zzc2 = new zzc();
                j b2 = cVar.k0().b();
                b2.c(zzc2, "SupportLifecycleFragmentImpl");
                b2.g();
            }
            c0.put(cVar, new WeakReference(zzc2));
            return zzc2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        for (LifecycleCallback e2 : this.Z.values()) {
            e2.e(i, i2, intent);
        }
    }

    public final void J0(Bundle bundle) {
        super.J0(bundle);
        this.a0 = 1;
        this.b0 = bundle;
        for (Map.Entry next : this.Z.entrySet()) {
            ((LifecycleCallback) next.getValue()).f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void O0() {
        super.O0();
        this.a0 = 5;
        for (LifecycleCallback g : this.Z.values()) {
            g.g();
        }
    }

    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Z.containsKey(str)) {
            this.Z.put(str, lifecycleCallback);
            if (this.a0 > 0) {
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

    public final void f1() {
        super.f1();
        this.a0 = 3;
        for (LifecycleCallback h : this.Z.values()) {
            h.h();
        }
    }

    public final void g1(Bundle bundle) {
        super.g1(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.Z.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void h1() {
        super.h1();
        this.a0 = 2;
        for (LifecycleCallback j : this.Z.values()) {
            j.j();
        }
    }

    public final void i1() {
        super.i1();
        this.a0 = 4;
        for (LifecycleCallback k : this.Z.values()) {
            k.k();
        }
    }

    public final <T extends LifecycleCallback> T k(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.Z.get(str));
    }

    public final /* synthetic */ Activity l() {
        return u();
    }

    public final void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.r(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.Z.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
