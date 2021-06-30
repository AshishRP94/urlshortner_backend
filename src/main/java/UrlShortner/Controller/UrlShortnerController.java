package UrlShortner.Controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import UrlShortner.Entity.UrlRequest;
import UrlShortner.Entity.Exception.NotFoundException;
import UrlShortner.Service.UrlShortenerService;

@RestController
public class UrlShortnerController
{
    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping("/api/")
    String create(@RequestBody UrlRequest urlRequest)
    {
        return urlShortenerService.createShortUrl(urlRequest);
    }

    @GetMapping("/{encrypted_id}")
    ResponseEntity<String> create(@PathVariable("encrypted_id") String  encryptedId){
        try
        {
            return ResponseEntity.ok(urlShortenerService.getLongUrl(encryptedId));
        } 
        catch (UnsupportedEncodingException e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } 
        catch (NotFoundException e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    //to be triggered by some jobs
    @DeleteMapping("/")
    void delete()
    {
       urlShortenerService.deleteExpiredUrl();
    }

}
