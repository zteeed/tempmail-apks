package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public enum zzegn {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeer.class, zzeer.class, zzeer.f8716c),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f8763b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8764c;

    private zzegn(Class<?> cls, Class<?> cls2, Object obj) {
        this.f8763b = cls2;
        this.f8764c = obj;
    }

    public final Class<?> f() {
        return this.f8763b;
    }
}
