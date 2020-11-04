package a.h.j;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
public class b extends Writer {

    /* renamed from: b  reason: collision with root package name */
    private final String f350b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f351c = new StringBuilder(128);

    public b(String str) {
        this.f350b = str;
    }

    private void a() {
        if (this.f351c.length() > 0) {
            Log.d(this.f350b, this.f351c.toString());
            StringBuilder sb = this.f351c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                a();
            } else {
                this.f351c.append(c2);
            }
        }
    }
}
