package b.c.a.b.i;

import android.content.Context;
import b.c.a.b.i.w.j.c;
import dagger.BindsInstance;
import dagger.Component;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Singleton
@Component
/* compiled from: TransportRuntimeComponent */
abstract class s implements Closeable {

    @Component.Builder
    /* compiled from: TransportRuntimeComponent */
    interface a {
        s h();

        @BindsInstance
        a i(Context context);
    }

    s() {
    }

    /* access modifiers changed from: package-private */
    public abstract c a();

    /* access modifiers changed from: package-private */
    public abstract r b();

    public void close() throws IOException {
        a().close();
    }
}
