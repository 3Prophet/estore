package ch.logvidmi.estore.products.ui.adpter.rest;

import ch.logvidmi.estore.products.api.ProductsApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-02T15:12:53.853853400+02:00[Europe/Berlin]")
@RestController
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class ProductsApiController implements ProductsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
