package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

/* compiled from: AndroidViewModel */
public class a extends w {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private Application f1662c;

    public a(Application application) {
        this.f1662c = application;
    }

    public <T extends Application> T f() {
        return this.f1662c;
    }
}
