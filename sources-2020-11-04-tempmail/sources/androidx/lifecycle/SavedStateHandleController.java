package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;

final class SavedStateHandleController implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f1656a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1657b = false;

    /* renamed from: c  reason: collision with root package name */
    private final u f1658c;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        public void a(b bVar) {
            if (bVar instanceof z) {
                y B = ((z) bVar).B();
                SavedStateRegistry I = bVar.I();
                for (String b2 : B.c()) {
                    SavedStateHandleController.e(B.b(b2), I, bVar.c());
                }
                if (!B.c().isEmpty()) {
                    I.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, u uVar) {
        this.f1656a = str;
        this.f1658c = uVar;
    }

    static void e(w wVar, SavedStateRegistry savedStateRegistry, g gVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) wVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.l()) {
            savedStateHandleController.h(savedStateRegistry, gVar);
            m(savedStateRegistry, gVar);
        }
    }

    static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, g gVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, u.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.h(savedStateRegistry, gVar);
        m(savedStateRegistry, gVar);
        return savedStateHandleController;
    }

    private static void m(final SavedStateRegistry savedStateRegistry, final g gVar) {
        g.b b2 = gVar.b();
        if (b2 == g.b.INITIALIZED || b2.f(g.b.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            gVar.a(new i() {
                public void c(k kVar, g.a aVar) {
                    if (aVar == g.a.ON_START) {
                        gVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    public void c(k kVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            this.f1657b = false;
            kVar.c().c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(SavedStateRegistry savedStateRegistry, g gVar) {
        if (!this.f1657b) {
            this.f1657b = true;
            gVar.a(this);
            savedStateRegistry.d(this.f1656a, this.f1658c.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    public u k() {
        return this.f1658c;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f1657b;
    }
}
