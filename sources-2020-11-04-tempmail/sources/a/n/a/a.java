package a.n.a;

import androidx.lifecycle.k;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends k & z> a b(T t) {
        return new b(t, ((z) t).B());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
