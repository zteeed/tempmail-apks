package android.org.apache.commons.lang3;

/* compiled from: Validate */
public class d {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
