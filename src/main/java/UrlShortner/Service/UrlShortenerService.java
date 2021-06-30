package UrlShortner.Service;

import java.io.UnsupportedEncodingException;

import UrlShortner.Entity.UrlRequest;
import UrlShortner.Entity.Exception.NotFoundException;


public interface UrlShortenerService
{
    String createShortUrl(UrlRequest urlRequest);
    String getLongUrl(String encryptedId) throws UnsupportedEncodingException, NotFoundException;
    void deleteExpiredUrl();
}
