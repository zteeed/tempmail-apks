package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f1696a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry.b f1697b;

    /* compiled from: SavedStateHandle */
    class a implements SavedStateRegistry.b {
        a() {
        }

        public Bundle a() {
            Set<String> keySet = u.this.f1696a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String next : keySet) {
                arrayList.add(next);
                arrayList2.add(u.this.f1696a.get(next));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class cls = Double.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        Class<Binder> cls4 = Binder.class;
        Class<Bundle> cls5 = Bundle.class;
        Class cls6 = Byte.TYPE;
        Class cls7 = Character.TYPE;
        Class<CharSequence> cls8 = CharSequence.class;
        Class<CharSequence[]> cls9 = CharSequence[].class;
        Class<ArrayList> cls10 = ArrayList.class;
        Class cls11 = Float.TYPE;
        Class<Parcelable> cls12 = Parcelable.class;
        Class<Parcelable[]> cls13 = Parcelable[].class;
        Class<Serializable> cls14 = Serializable.class;
        Class cls15 = Short.TYPE;
        Class<SparseArray> cls16 = SparseArray.class;
        if (Build.VERSION.SDK_INT >= 21) {
            Class<Size> cls17 = Size.class;
        } else {
            Class cls18 = Integer.TYPE;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Class<SizeF> cls19 = SizeF.class;
        } else {
            Class cls20 = Integer.TYPE;
        }
    }

    public u(Map<String, Object> map) {
        new HashMap();
        this.f1697b = new a();
        this.f1696a = new HashMap(map);
    }

    static u a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new u();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new u(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new u(hashMap);
    }

    /* access modifiers changed from: package-private */
    public SavedStateRegistry.b b() {
        return this.f1697b;
    }

    public u() {
        new HashMap();
        this.f1697b = new a();
        this.f1696a = new HashMap();
    }
}
