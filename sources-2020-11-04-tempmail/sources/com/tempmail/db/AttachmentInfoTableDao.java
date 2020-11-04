package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.List;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;
import org.greenrobot.greendao.j.g;
import org.greenrobot.greendao.j.h;
import org.greenrobot.greendao.j.j;

public class AttachmentInfoTableDao extends a<AttachmentInfoTable, Long> {
    public static final String TABLENAME = "ATTACHMENT_INFO_TABLE";
    private g<AttachmentInfoTable> emailTable_AttachmentsQuery;

    public static class Properties {
        public static final f AttachmentId = new f(3, Integer.class, "attachmentId", false, "ATTACHMENT_ID");
        public static final f Cid = new f(6, String.class, "cid", false, "CID");
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Filename = new f(2, String.class, "filename", false, "FILENAME");
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f MimeType = new f(5, String.class, "mimeType", false, "MIME_TYPE");
        public static final f Size = new f(4, Long.class, "size", false, "SIZE");
    }

    public AttachmentInfoTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"ATTACHMENT_INFO_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"EID\" TEXT,\"FILENAME\" TEXT,\"ATTACHMENT_ID\" INTEGER,\"SIZE\" INTEGER,\"MIME_TYPE\" TEXT,\"CID\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ATTACHMENT_INFO_TABLE\"");
        aVar.b(sb.toString());
    }

    public List<AttachmentInfoTable> _queryEmailTable_Attachments(String str) {
        synchronized (this) {
            if (this.emailTable_AttachmentsQuery == null) {
                h queryBuilder = queryBuilder();
                queryBuilder.p(Properties.Eid.a((Object) null), new j[0]);
                this.emailTable_AttachmentsQuery = queryBuilder.c();
            }
        }
        g<AttachmentInfoTable> f2 = this.emailTable_AttachmentsQuery.f();
        f2.i(0, str);
        return f2.h();
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AttachmentInfoTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public Long getKey(AttachmentInfoTable attachmentInfoTable) {
        if (attachmentInfoTable != null) {
            return attachmentInfoTable.getId();
        }
        return null;
    }

    public boolean hasKey(AttachmentInfoTable attachmentInfoTable) {
        return attachmentInfoTable.getId() != null;
    }

    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    public final Long updateKeyAfterInsert(AttachmentInfoTable attachmentInfoTable, long j) {
        attachmentInfoTable.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, AttachmentInfoTable attachmentInfoTable) {
        cVar.e();
        Long id = attachmentInfoTable.getId();
        if (id != null) {
            cVar.d(1, id.longValue());
        }
        String eid = attachmentInfoTable.getEid();
        if (eid != null) {
            cVar.b(2, eid);
        }
        String filename = attachmentInfoTable.getFilename();
        if (filename != null) {
            cVar.b(3, filename);
        }
        Integer attachmentId = attachmentInfoTable.getAttachmentId();
        if (attachmentId != null) {
            cVar.d(4, (long) attachmentId.intValue());
        }
        Long size = attachmentInfoTable.getSize();
        if (size != null) {
            cVar.d(5, size.longValue());
        }
        String mimeType = attachmentInfoTable.getMimeType();
        if (mimeType != null) {
            cVar.b(6, mimeType);
        }
        String cid = attachmentInfoTable.getCid();
        if (cid != null) {
            cVar.b(7, cid);
        }
    }

    public AttachmentInfoTable readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer valueOf2 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Long valueOf3 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        int i8 = i + 6;
        return new AttachmentInfoTable(valueOf, string, string2, valueOf2, valueOf3, cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    public void readEntity(Cursor cursor, AttachmentInfoTable attachmentInfoTable, int i) {
        int i2 = i + 0;
        String str = null;
        attachmentInfoTable.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        attachmentInfoTable.setEid(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        attachmentInfoTable.setFilename(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        attachmentInfoTable.setAttachmentId(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        attachmentInfoTable.setSize(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        attachmentInfoTable.setMimeType(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        if (!cursor.isNull(i8)) {
            str = cursor.getString(i8);
        }
        attachmentInfoTable.setCid(str);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, AttachmentInfoTable attachmentInfoTable) {
        sQLiteStatement.clearBindings();
        Long id = attachmentInfoTable.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String eid = attachmentInfoTable.getEid();
        if (eid != null) {
            sQLiteStatement.bindString(2, eid);
        }
        String filename = attachmentInfoTable.getFilename();
        if (filename != null) {
            sQLiteStatement.bindString(3, filename);
        }
        Integer attachmentId = attachmentInfoTable.getAttachmentId();
        if (attachmentId != null) {
            sQLiteStatement.bindLong(4, (long) attachmentId.intValue());
        }
        Long size = attachmentInfoTable.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(5, size.longValue());
        }
        String mimeType = attachmentInfoTable.getMimeType();
        if (mimeType != null) {
            sQLiteStatement.bindString(6, mimeType);
        }
        String cid = attachmentInfoTable.getCid();
        if (cid != null) {
            sQLiteStatement.bindString(7, cid);
        }
    }
}
