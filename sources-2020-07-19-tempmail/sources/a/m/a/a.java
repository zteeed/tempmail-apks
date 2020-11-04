package a.m.a;

import androidx.lifecycle.g;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends g & s> a b(T t) {
        return new b(t, ((s) t).C());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
