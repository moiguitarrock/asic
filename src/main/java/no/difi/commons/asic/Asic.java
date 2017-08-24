package no.difi.commons.asic;

import no.difi.commons.asic.api.AsicConfig;
import no.difi.commons.asic.api.AsicReaderFactory;
import no.difi.commons.asic.api.AsicWriterFactory;
import no.difi.commons.asic.builder.Builder;

public interface Asic extends AsicConfig {

    /**
     * The MIME type, which should be the very first entry in the container
     */
    String MIMETYPE_ASICE = "application/vnd.etsi.asic-e+zip";

    static Builder<AsicReaderFactory, RuntimeException> readerFactoryBuilder() {
        return Builder.of(AsicReaderFactoryImpl::new);
    }

    static Builder<AsicWriterFactory, RuntimeException> writerFactoryBuilder() {
        return Builder.of(AsicWriterFactoryImpl::new);
    }
}