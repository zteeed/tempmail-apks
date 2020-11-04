package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.b<String, b> f1952a = new a.b.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1953b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1954c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f1955d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1956e = true;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.f1954c) {
            Bundle bundle = this.f1953b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1953b.remove(str);
            if (this.f1953b.isEmpty()) {
                this.f1953b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void b(g gVar, Bundle bundle) {
        if (!this.f1954c) {
            if (bundle != null) {
                this.f1953b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            gVar.a(new i() {
                public void c(k kVar, g.a aVar) {
                    if (aVar == g.a.ON_START) {
                        SavedStateRegistry.this.f1956e = true;
                    } else if (aVar == g.a.ON_STOP) {
                        SavedStateRegistry.this.f1956e = false;
                    }
                }
            });
            this.f1954c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1953b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.b.a.b.b<K, V>.d i = this.f1952a.i();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.f1952a.m(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.f1956e) {
            if (this.f1955d == null) {
                this.f1955d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1955d.b(cls.getName());
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
