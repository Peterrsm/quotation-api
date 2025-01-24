package stubs;

import com.pedromiranda.quotation_api.entity.request.CoverageRequest;

public class CoverageRequestStub {

    public CoverageRequest create() {
        CoverageRequest coverageRequest = new CoverageRequest();

        coverageRequest.setCategory("Category");

        return coverageRequest;
    }
}
