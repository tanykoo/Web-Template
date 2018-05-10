package com.tanykoo.util;

import com.auth0.jwt.interfaces.Claim;
import org.junit.Test;

import java.util.Map;

/**
 * @Author ThinkPad
 * @Since
 */
public class JWTTokenTest {

    @Test
    public void creatToken()throws Exception{
        System.out.println(JWTToken.creatToken());
        Map<String,Claim> map = JWTToken.verifyToken("eyJuYW1lIjoiZHNmZCIsImFsZyI6IkhTMjU2IiwidHlwIjoiSldUIn0.eyIyMjIyIjoiNDQ0NCJ9.J4PbtXJTUfSAZZ2ps8M4F_pqVVn1Mm5PCab16Tj4iGQ");
        System.out.println(map);
        System.out.println(map.get("2222").asString());
    }
}
