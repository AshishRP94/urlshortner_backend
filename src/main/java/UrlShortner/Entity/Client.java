package UrlShortner.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Client
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column(nullable = false)
	    private String clientName;
	    @Column(nullable = false)
	    private String domain;
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "client_id")
	    Set<Url> urls;

}
