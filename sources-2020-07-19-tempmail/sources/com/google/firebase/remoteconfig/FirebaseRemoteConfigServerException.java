package com.google.firebase.remoteconfig;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: b  reason: collision with root package name */
    private final int f11440b;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f11440b = i;
    }

    public int a() {
        return this.f11440b;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th) {
        super(str, th);
        this.f11440b = i;
    }
}
