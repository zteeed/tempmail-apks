package androidx.databinding.i.b;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f1442a = new SparseIntArray(0);

    public List<c> a() {
        return new ArrayList(0);
    }

    public ViewDataBinding b(e eVar, View view, int i) {
        if (f1442a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f1442a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
