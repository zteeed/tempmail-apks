package a.i.a;

import a.i.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f438b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f439c;

    /* renamed from: d  reason: collision with root package name */
    protected Cursor f440d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f441e;

    /* renamed from: f  reason: collision with root package name */
    protected int f442f;
    protected C0016a g;
    protected DataSetObserver h;
    protected b i;

    /* renamed from: a.i.a.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    private class C0016a extends ContentObserver {
        C0016a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.i();
        }
    }

    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f438b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f438b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    public Cursor b() {
        return this.f440d;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i2) {
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f439c = true;
        } else {
            this.f439c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f440d = cursor;
        this.f438b = z;
        this.f441e = context;
        this.f442f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.g = new C0016a();
            this.h = new b();
        } else {
            this.g = null;
            this.h = null;
        }
        if (z) {
            C0016a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f438b || (cursor = this.f440d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f438b) {
            return null;
        }
        this.f440d.moveToPosition(i2);
        if (view == null) {
            view = g(this.f441e, this.f440d, viewGroup);
        }
        e(view, this.f441e, this.f440d);
        return view;
    }

    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b(this);
        }
        return this.i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f438b || (cursor = this.f440d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f440d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f438b || (cursor = this.f440d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f440d.getLong(this.f442f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f438b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f440d.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f441e, this.f440d, viewGroup);
            }
            e(view, this.f441e, this.f440d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f439c && (cursor = this.f440d) != null && !cursor.isClosed()) {
            this.f438b = this.f440d.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f440d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0016a aVar = this.g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f440d = cursor;
        if (cursor != null) {
            C0016a aVar2 = this.g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f442f = cursor.getColumnIndexOrThrow("_id");
            this.f438b = true;
            notifyDataSetChanged();
        } else {
            this.f442f = -1;
            this.f438b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
