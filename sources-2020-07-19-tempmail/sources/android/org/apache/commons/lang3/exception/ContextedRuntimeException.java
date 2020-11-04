package android.org.apache.commons.lang3.exception;

public class ContextedRuntimeException extends RuntimeException implements b {
    private static final long serialVersionUID = 20110706;

    /* renamed from: b  reason: collision with root package name */
    private final b f655b = new a();

    public String a(String str) {
        return this.f655b.a(str);
    }

    public String getMessage() {
        return a(super.getMessage());
    }
}
