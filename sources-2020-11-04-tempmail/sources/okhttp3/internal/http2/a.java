package okhttp3.internal.http2;

/* compiled from: ErrorCode */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: b  reason: collision with root package name */
    public final int f14871b;

    private a(int i) {
        this.f14871b = i;
    }

    public static a f(int i) {
        for (a aVar : values()) {
            if (aVar.f14871b == i) {
                return aVar;
            }
        }
        return null;
    }
}
