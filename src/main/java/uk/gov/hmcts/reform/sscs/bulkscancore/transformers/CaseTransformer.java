package uk.gov.hmcts.reform.sscs.bulkscancore.transformers;

import uk.gov.hmcts.reform.sscs.bulkscancore.domain.CaseDetails;
import uk.gov.hmcts.reform.sscs.bulkscancore.domain.CaseResponse;

/**
 * Implementation of this interface will need to return CaseTransformationResponse.
 * If case transformation fails then errors field needs to be populated with appropriate message and field which failed transformation.
 */
public interface CaseTransformer {
    CaseResponse transformExceptionRecordToCase(CaseDetails caseDetails);
}
