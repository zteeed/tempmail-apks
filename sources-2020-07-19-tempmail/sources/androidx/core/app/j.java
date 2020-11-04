package androidx.core.app;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* compiled from: RemoteInput */
public final class j {
    static RemoteInput a(j jVar) {
        return new RemoteInput.Builder(jVar.h()).setLabel(jVar.g()).setChoices(jVar.e()).setAllowFreeFormInput(jVar.c()).addExtras(jVar.f()).build();
    }

    static RemoteInput[] b(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jVarArr.length];
        for (int i = 0; i < jVarArr.length; i++) {
            remoteInputArr[i] = a(jVarArr[i]);
        }
        return remoteInputArr;
    }

    public abstract boolean c();

    public abstract Set<String> d();

    public abstract CharSequence[] e();

    public abstract Bundle f();

    public abstract CharSequence g();

    public abstract String h();
}
