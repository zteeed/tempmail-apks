package com.google.firebase.j;

import javax.annotation.Nonnull;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f11359a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11360b;

    a(String str, String str2) {
        if (str != null) {
            this.f11359a = str;
            if (str2 != null) {
                this.f11360b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    public String b() {
        return this.f11359a;
    }

    @Nonnull
    public String c() {
        return this.f11360b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f11359a.equals(fVar.b()) || !this.f11360b.equals(fVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f11359a.hashCode() ^ 1000003) * 1000003) ^ this.f11360b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f11359a + ", version=" + this.f11360b + "}";
    }
}
