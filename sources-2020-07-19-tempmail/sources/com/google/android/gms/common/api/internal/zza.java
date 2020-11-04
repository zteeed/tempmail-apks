package com.google.android.gms.common.api.internal;

import a.e.a;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zza extends Fragment implements LifecycleFragment {

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<zza>> f2913e = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, LifecycleCallback> f2914b = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f2915c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2916d;

    public static zza b(Activity activity) {
        zza zza;
        WeakReference weakReference = f2913e.get(activity);
        if (weakReference != null && (zza = (zza) weakReference.get()) != null) {
            return zza;
        }
        try {
            zza zza2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zza2 == null || zza2.isRemoving()) {
                zza2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zza2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f2913e.put(activity, new WeakReference(zza2));
            return zza2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f2914b.containsKey(str)) {
            this.f2914b.put(str, lifecycleCallback);
            if (this.f2915c > 0) {
                new zze(Looper.getMainLooper()).post(new t0(this, lifecycleCallback, str));
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

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.f2914b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final <T extends LifecycleCallback> T k(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f2914b.get(str));
    }

    public final Activity l() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e2 : this.f2914b.values()) {
            e2.e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2915c = 1;
        this.f2916d = bundle;
        for (Map.Entry next : this.f2914b.entrySet()) {
            ((LifecycleCallback) next.getValue()).f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2915c = 5;
        for (LifecycleCallback g : this.f2914b.values()) {
            g.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2915c = 3;
        for (LifecycleCallback h : this.f2914b.values()) {
            h.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2914b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2915c = 2;
        for (LifecycleCallback j : this.f2914b.values()) {
            j.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2915c = 4;
        for (LifecycleCallback k : this.f2914b.values()) {
            k.k();
        }
    }
}
