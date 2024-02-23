package com.example.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

	@Value("${app.jwtSemilla}")
	private String jwtSemilla;

	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;

	public String wildTokenJWT(String nombre) {
		return Jwts.builder().setSubject(nombre).setSubject("hi world").setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + this.jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512,
						"semillaidDAJ919AKAadopakdakoAKDOAjdk1j9dj1j89dajidjakdj81jd81j8d18j8do0109aopzkd9191jada019")
				.compact(); // .setSubject, .setSubject...
	}
}
