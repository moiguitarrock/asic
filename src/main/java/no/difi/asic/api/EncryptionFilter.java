package no.difi.asic.api;

import no.difi.asic.config.ValueWrapper;
import no.difi.asic.lang.AsicException;

import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.X509Certificate;
import java.util.List;

/**
 * @author erlend
 */
public interface EncryptionFilter {

    OutputStream createFilter(OutputStream outputStream, ValueWrapper algorithm, List<X509Certificate> certificates)
            throws IOException, AsicException;

}