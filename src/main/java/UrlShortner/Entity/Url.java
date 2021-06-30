package UrlShortner.Entity;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Url
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String url;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date expiryDateTime;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Url url1 = (Url) o;
        return url.equals(url1.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

}
