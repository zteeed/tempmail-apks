package a.q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f588a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f589b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f590c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f589b == sVar.f589b && this.f588a.equals(sVar.f588a);
    }

    public int hashCode() {
        return (this.f589b.hashCode() * 31) + this.f588a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f589b + "\n") + "    values:";
        for (String next : this.f588a.keySet()) {
            str = str + "    " + next + ": " + this.f588a.get(next) + "\n";
        }
        return str;
    }
}
