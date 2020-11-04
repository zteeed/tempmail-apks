package com.google.firebase.j;

import javax.annotation.Nonnull;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f11908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11909b;

    a(String str, String str2) {
        if (str != null) {
            this.f11908a = str;
            if (str2 != null) {
                this.f11909b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    public String b() {
        return this.f11908a;
    }

    @Nonnull
    public String c() {
        return this.f11909b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f11908a.equals(fVar.b()) || !this.f11909b.equals(fVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f11908a.hashCode() ^ 1000003) * 1000003) ^ this.f11909b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f11908a + ", version=" + this.f11909b + "}";
    }
}
