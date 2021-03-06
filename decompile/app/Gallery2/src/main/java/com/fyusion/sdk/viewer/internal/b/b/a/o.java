package com.fyusion.sdk.viewer.internal.b.b.a;

import com.android.gallery3d.gadget.XmlUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Unknown */
final class o {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName(XmlUtils.INPUT_ENCODING);

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    static void a(File file) throws IOException {
        int i = 0;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
