package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

/* compiled from: PushObserver */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f14426a = new a();

    /* compiled from: PushObserver */
    class a implements k {
        a() {
        }

        public boolean a(int i, List<b> list) {
            return true;
        }

        public boolean b(int i, List<b> list, boolean z) {
            return true;
        }

        public void c(int i, a aVar) {
        }

        public boolean d(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }
    }

    boolean a(int i, List<b> list);

    boolean b(int i, List<b> list, boolean z);

    void c(int i, a aVar);

    boolean d(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;
}
