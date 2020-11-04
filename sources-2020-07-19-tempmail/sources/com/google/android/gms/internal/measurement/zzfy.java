package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public enum zzfy {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeg.class, zzeg.class, zzeg.f9608c),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f9645b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f9646c;

    private zzfy(Class<?> cls, Class<?> cls2, Object obj) {
        this.f9645b = cls2;
        this.f9646c = obj;
    }

    public final Class<?> f() {
        return this.f9645b;
    }
}
