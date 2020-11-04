package android.org.apache.commons.lang3.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: ExceptionUtils */
public class c {
    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }
}
