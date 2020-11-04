package com.google.zxing;

import java.util.List;

/* compiled from: DecodeHintType */
public enum d {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(p.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f11669b;

    private d(Class<?> cls) {
        this.f11669b = cls;
    }

    public Class<?> f() {
        return this.f11669b;
    }
}
