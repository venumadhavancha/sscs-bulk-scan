package uk.gov.hmcts.reform.sscs.exceptions;

import static java.lang.String.format;

import uk.gov.hmcts.reform.logging.exception.AlertLevel;
import uk.gov.hmcts.reform.logging.exception.UnknownErrorCodeException;

@SuppressWarnings("squid:MaximumInheritanceDepth")
public class BulkScanServiceException extends UnknownErrorCodeException {

    public BulkScanServiceException(String exceptionId, Exception ex) {
        super(AlertLevel.P3, format("Exception thrown for case [%s]", exceptionId), ex);
    }

}
