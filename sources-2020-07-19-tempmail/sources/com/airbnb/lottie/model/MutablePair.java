package com.airbnb.lottie.model;

import a.h.j.d;

public class MutablePair<T> {
    T first;
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!objectsEqual(dVar.f352a, this.first) || !objectsEqual(dVar.f353b, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.first;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.second;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public void set(T t, T t2) {
        this.first = t;
        this.second = t2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
    }
}
