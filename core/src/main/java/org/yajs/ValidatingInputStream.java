package org.yajs;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by timur on 10/8/16.
 */
public class ValidatingInputStream extends InputStream {
    @Override
    public int read() throws IOException {
        return 0;
    }
}
