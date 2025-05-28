package tech.wvs.desafiourlshorten.service;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import tech.wvs.desafiourlshorten.controller.dto.UrlRequest;
import tech.wvs.desafiourlshorten.entities.UrlEntity;
import tech.wvs.desafiourlshorten.repository.UrlRepository;

import java.time.LocalDateTime;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public String getShortenUrl(UrlRequest dto,
                                HttpServletRequest servletRequest) {

        String id;
        do
        {
            id = RandomStringUtils.randomAlphanumeric(5, 10);
        } while (urlRepository.existsById(id));

        urlRepository.save(new UrlEntity(id, dto.url(), LocalDateTime.now().plusSeconds(60)));

        return servletRequest.getRequestURI().replace("shorten-url", id);
    }

    public UrlEntity findById(String id) {
        return urlRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("URL not found"));
    }
}
