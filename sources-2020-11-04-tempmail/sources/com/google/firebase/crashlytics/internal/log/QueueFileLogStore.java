package com.google.firebase.crashlytics.internal.log;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.log.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class QueueFileLogStore implements FileLogStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    private class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    private void doWriteToLog(long j, String str) {
        if (this.logFile != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.maxLogSize / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.logFile.add(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(UTF_8));
                while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                    this.logFile.remove();
                }
            } catch (IOException e2) {
                Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.logFile.forEach(new QueueFile.ElementReader() {
                public void read(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e2) {
            Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new QueueFile(this.workingFile);
            } catch (IOException e2) {
                Logger logger = Logger.getLogger();
                logger.e("Could not open log file: " + this.workingFile, e2);
            }
        }
    }

    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        int i = logBytes.offset;
        byte[] bArr = new byte[i];
        System.arraycopy(logBytes.bytes, 0, bArr, 0, i);
        return bArr;
    }

    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, UTF_8);
        }
        return null;
    }

    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }
}
