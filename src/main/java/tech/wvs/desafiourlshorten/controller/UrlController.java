package tech.wvs.desafiourlshorten.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.wvs.desafiourlshorten.controller.dto.UrlRequest;
import tech.wvs.desafiourlshorten.controller.dto.UrlResponse;
import tech.wvs.desafiourlshorten.service.UrlService;

import java.net.URI;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping(path = "/shorten-url")
    public ResponseEntity<UrlResponse> shorterUrl(@RequestBody UrlRequest dto,
                                                  HttpServletRequest servletRequest) {

        var redirectUrl = urlService.getShortenUrl(dto, servletRequest);

        return ResponseEntity.ok(new UrlResponse(redirectUrl));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Void> redirect(@PathVariable("id") String id) {
        var urlEntity = urlService.findById(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(urlEntity.getFullUrl()));

        return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
    }

}
