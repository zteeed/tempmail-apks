package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;

/* compiled from: SavedStateRegistryController */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f1958a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f1959b = new SavedStateRegistry();

    private a(b bVar) {
        this.f1958a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f1959b;
    }

    public void c(Bundle bundle) {
        g c2 = this.f1958a.c();
        if (c2.b() == g.b.INITIALIZED) {
            c2.a(new Recreator(this.f1958a));
            this.f1959b.b(c2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f1959b.c(bundle);
    }
}
