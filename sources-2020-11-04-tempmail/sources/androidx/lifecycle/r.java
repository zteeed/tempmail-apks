package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: OnLifecycleEvent */
public @interface r {
    g.a value();
}
