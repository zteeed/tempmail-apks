package a.i.a;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f445a;

    /* compiled from: CursorFilter */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f445a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f445a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d2 = this.f445a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d2 != null) {
            filterResults.count = d2.getCount();
            filterResults.values = d2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b2 = this.f445a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b2) {
            this.f445a.a((Cursor) obj);
        }
    }
}
