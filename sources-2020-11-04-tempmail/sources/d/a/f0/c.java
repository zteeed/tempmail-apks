package d.a.f0;

import d.a.l;
import d.a.s;

/* compiled from: Subject */
public abstract class c<T> extends l<T> implements s<T> {
    public final c<T> d() {
        if (this instanceof b) {
            return this;
        }
        return new b(this);
    }
}
