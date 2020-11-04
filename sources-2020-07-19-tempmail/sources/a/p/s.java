package a.p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f584a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f585b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f586c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f585b == sVar.f585b && this.f584a.equals(sVar.f584a);
    }

    public int hashCode() {
        return (this.f585b.hashCode() * 31) + this.f584a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f585b + "\n") + "    values:";
        for (String next : this.f584a.keySet()) {
            str = str + "    " + next + ": " + this.f584a.get(next) + "\n";
        }
        return str;
    }
}
