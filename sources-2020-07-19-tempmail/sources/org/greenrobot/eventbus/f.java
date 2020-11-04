package org.greenrobot.eventbus;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

/* compiled from: Logger */
public interface f {

    /* compiled from: Logger */
    public static class a implements f {

        /* renamed from: b  reason: collision with root package name */
        static final boolean f14466b;

        /* renamed from: a  reason: collision with root package name */
        private final String f14467a;

        static {
            boolean z = false;
            try {
                if (Class.forName("android.util.Log") != null) {
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            }
            f14466b = z;
        }

        public a(String str) {
            this.f14467a = str;
        }

        public static boolean c() {
            return f14466b;
        }

        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f14467a, str);
            }
        }

        public void b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                int d2 = d(level);
                String str2 = this.f14467a;
                Log.println(d2, str2, str + "\n" + Log.getStackTraceString(th));
            }
        }

        /* access modifiers changed from: protected */
        public int d(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }
    }

    /* compiled from: Logger */
    public static class b implements f {
        public void a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        public void b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}
