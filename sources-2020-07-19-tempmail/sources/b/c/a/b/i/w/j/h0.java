package b.c.a.b.i.w.j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: SchemaManager */
final class h0 extends SQLiteOpenHelper {

    /* renamed from: d  reason: collision with root package name */
    static int f2230d = 4;

    /* renamed from: e  reason: collision with root package name */
    private static final a f2231e = d0.b();

    /* renamed from: f  reason: collision with root package name */
    private static final a f2232f = e0.b();
    private static final a g = f0.b();
    private static final a h;
    private static final List<a> i;

    /* renamed from: b  reason: collision with root package name */
    private final int f2233b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2234c = false;

    /* compiled from: SchemaManager */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a b2 = g0.b();
        h = b2;
        i = Arrays.asList(new a[]{f2231e, f2232f, g, b2});
    }

    @Inject
    h0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f2233b = i2;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2234c) {
            onConfigure(sQLiteDatabase);
        }
    }

    static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void g(SQLiteDatabase sQLiteDatabase, int i2) {
        a(sQLiteDatabase);
        h(sQLiteDatabase, 0, i2);
    }

    private void h(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i3 <= i.size()) {
            while (i2 < i3) {
                i.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + i.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2234c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase, this.f2233b);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        g(sQLiteDatabase, i3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        a(sQLiteDatabase);
        h(sQLiteDatabase, i2, i3);
    }
}
