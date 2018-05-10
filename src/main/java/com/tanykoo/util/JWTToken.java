package com.tanykoo.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ThinkPad
 * @Since
 */
public class JWTToken {

    public static String SECRET="DFSFRO88dosfnd>dksdslhds;.";

    public static String creatToken() throws Exception{
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 1);
        Date passDate = calendar.getTime();
        Map<String,Object> map = new HashMap<>();
        map.put("name","dsfd");

        String token = JWT.create().withHeader(map)
                .withClaim("2222","4444")
//                .withExpiresAt(passDate)
//                .withIssuedAt(date)
                .sign(Algorithm.HMAC256(SECRET));

        return token;

    }

    public static Map<String ,Claim> verifyToken(String token){
        JWTVerifier jwtVerifier = null;
        try {
            jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        DecodedJWT jwt = jwtVerifier.verify(token);
        return jwt.getClaims();
    }
}
