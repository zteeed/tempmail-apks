package b.c.a.e.a.a;

import android.content.Context;
import java.io.File;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2454a;

    o(Context context) {
        this.f2454a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b2 : listFiles) {
                j += b(b2);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return b(new File(this.f2454a.getFilesDir(), "assetpacks"));
    }
}
