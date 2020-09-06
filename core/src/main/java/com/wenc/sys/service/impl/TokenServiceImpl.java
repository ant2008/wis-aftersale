package com.wenc.sys.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.wenc.sys.service.TokenService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * @author b.v
 */
@Service
public class TokenServiceImpl implements TokenService {

    private static final String SECRET = "hello::word!";
    private static final String AUTHOR = "wiser";


    /**
     * 根据输入的关键字产生对应的token.
     *
     * @param aKey
     * @param maxAge
     * @return
     */
    @Override
    public String createToken(String aKey, long maxAge) {

        Algorithm algorithm = null;
        String retToken = "";
        Date expDate = null;

        try {

            algorithm = Algorithm.HMAC256(SECRET);

            expDate = new Date(System.currentTimeMillis() + maxAge);

            retToken = JWT.create()
                    .withIssuer(AUTHOR)
                    .withExpiresAt(expDate)
                    .withClaim("key", aKey)
                    .sign(algorithm);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return retToken;
    }

    /**
     * 按tenant产生的token.
     *
     * @param aKey
     * @param aTenant
     * @param maxAge
     * @return
     */
    @Override
    public String createToken(String aKey, String aTenant, long maxAge) {
        Algorithm algorithm = null;
        String retToken = "";
        Date expDate = null;

        try {

            algorithm = Algorithm.HMAC256(SECRET);

            expDate = new Date(System.currentTimeMillis() + maxAge);

            retToken = JWT.create()
                    .withIssuer(AUTHOR)
                    .withExpiresAt(expDate)
                    .withClaim("key", aKey)
                    .withClaim("tenant", aTenant)
                    .sign(algorithm);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return retToken;
    }

    /**
     * 按tenant产生token.
     *
     * @param aKey
     * @param aTenant
     * @return
     */
    @Override
    public String createTenantToken(String aKey, String aTenant) {


        ////60L* 1000L* 30L; //默认token两个小时。
        long maxAge = 120L * 60L * 1000L;
        try {

            return createToken(aKey, aTenant, maxAge);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 根据Key获取TOKEN.
     *
     * @param aKey
     * @return
     * @throws Exception
     */
    @Override
    public String createToken(String aKey) throws Exception {
        long maxAge = 120L * 60L * 1000L;  //60L* 1000L* 30L; //默认token两个小时。
        try {

            return createToken(aKey, maxAge);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 验证token
     *
     * @param aToken
     * @param aKey
     * @return
     * @throws Exception
     */
    @Override
    public boolean verifyToken(String aToken, String aKey) throws Exception {
        Algorithm algorithm = null;
        JWTVerifier verifier = null;
        DecodedJWT jwt = null;

        Date expiresAt = null;
        Date issuedAt = null;
        Date notBefore = null;
        Date td = null;

        String claimKey = "";

        Map<String, Claim> claims = null;
        try {

            algorithm = Algorithm.HMAC256(SECRET);
            verifier = JWT.require(algorithm)
                    .withIssuer(AUTHOR)
                    .build();

            jwt = verifier.verify(aToken);

            //验证是否过期
            if (jwt.getExpiresAt() != null) {
                expiresAt = jwt.getExpiresAt();
            }

            if (jwt.getIssuedAt() != null) {
                issuedAt = jwt.getIssuedAt();
            }

            if (jwt.getNotBefore() != null) {
                notBefore = jwt.getNotBefore();
            }

            td = new Date(System.currentTimeMillis());
            //假如发布日期在未来，则验证不过。
            if (issuedAt != null && issuedAt.getTime() > td.getTime()) {
                return false;
            }

            //假如过期日期比当前时间小。
            if (expiresAt != null && expiresAt.getTime() < td.getTime()) {
                return false;
            }

            //比较key
            claims = jwt.getClaims();

            if (claims != null && !aKey.trim().equals("")) {
                if (claims.get("key") == null) {
                    return false;
                }

                claimKey = claims.get("key").asString();
                if (claimKey == null || claimKey.trim().equals("")) {
                    return false;
                }

                if (!claimKey.trim().equals(aKey)) {
                    return false;
                }


            }




        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return true;

    }

    /**
     * 针对tenant产生的token验证。
     *
     * @param aToken
     * @param aKey
     * @param aTenant
     * @return
     * @throws Exception
     */
    @Override
    public boolean verifyToken(String aToken, String aKey, String aTenant) throws Exception {
        Algorithm algorithm = null;
        JWTVerifier verifier = null;
        DecodedJWT jwt = null;

        Date expiresAt = null;
        Date issuedAt = null;
        Date notBefore = null;
        Date td = null;

        String claimKey = "";
        String claimTenant = "";

        Map<String, Claim> claims = null;
        try {

            algorithm = Algorithm.HMAC256(SECRET);
            verifier = JWT.require(algorithm)
                    .withIssuer(AUTHOR)
                    .build();

            jwt = verifier.verify(aToken);

            //验证是否过期
            if (jwt.getExpiresAt() != null) {
                expiresAt = jwt.getExpiresAt();
            }

            if (jwt.getIssuedAt() != null) {
                issuedAt = jwt.getIssuedAt();
            }

            if (jwt.getNotBefore() != null) {
                notBefore = jwt.getNotBefore();
            }

            td = new Date(System.currentTimeMillis());
            //假如发布日期在未来，则验证不过。
            if (issuedAt != null && issuedAt.getTime() > td.getTime()) {
                return false;
            }

            //假如过期日期比当前时间小。
            if (expiresAt != null && expiresAt.getTime() < td.getTime()) {
                return false;
            }

            //比较key
            claims = jwt.getClaims();

            if (claims != null && !aKey.trim().equals("")) {
                if (claims.get("key") == null) {
                    return false;
                }

                claimKey = claims.get("key").asString();
                if (claimKey == null || claimKey.trim().equals("")) {
                    return false;
                }

                if (!claimKey.trim().equals(aKey)) {
                    return false;
                }

                //验证tenant
                claimTenant = claims.get("tenant").asString();
                if (claimTenant == null || claimTenant.trim().equals("")) {
                    return false;
                }

                if (!claimTenant.trim().equals(aTenant)) {
                    return false;
                }


            }


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return true;

    }

    /**
     * 获取常规的token.
     * 默认时间为2个小时。
     *
     * @return
     * @throws Exception
     */
    @Override
    public String createToken() throws Exception {
        String key = "wiser";
        long maxAge = 300L * 60L * 1000L;  //60L* 1000L* 30L; //默认token两个小时。
        try {

            return createToken(key, maxAge);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }


    /**
     * 常规验证token.
     *
     * @param aToken
     * @return
     * @throws Exception
     */
    @Override
    public boolean verifyToken(String aToken) throws Exception {
        String key = "wiser";
        try {
            return verifyToken(aToken, key);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 根据存储在session中的key校验token.
     *
     * @param session
     * @param aSessionKey
     * @param aToken
     * @return
     * @throws Exception
     */
    @Override
    public boolean verifyToken(HttpSession session, String aSessionKey, String aToken) throws Exception {

        String tmpKey = "";

        try {

            if (session.getAttribute(aSessionKey) == null) {
                return false;
            }

            tmpKey = (String) session.getAttribute(aSessionKey);


            return verifyToken(aToken, tmpKey);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * 根据token解析出key
     *
     * @param aToken
     * @return
     * @throws Exception
     */
    @Override
    public String parseTokenKey(String aToken) throws Exception {
        Algorithm algorithm = null;
        JWTVerifier verifier = null;
        DecodedJWT jwt = null;

        Date expiresAt = null;
        Date issuedAt = null;
        Date notBefore = null;
        Date td = null;

        String claimKey = "";

        Map<String, Claim> claims = null;
        try {

            algorithm = Algorithm.HMAC256(SECRET);
            verifier = JWT.require(algorithm)
                    .withIssuer(AUTHOR)
                    .build();

            jwt = verifier.verify(aToken);

            //验证是否过期
            if (jwt.getExpiresAt() != null) {
                expiresAt = jwt.getExpiresAt();
            }

            if (jwt.getIssuedAt() != null) {
                issuedAt = jwt.getIssuedAt();
            }

            if (jwt.getNotBefore() != null) {
                notBefore = jwt.getNotBefore();
            }

            td = new Date(System.currentTimeMillis());
            //假如发布日期在未来，则验证不过。
            if (issuedAt != null && issuedAt.getTime() > td.getTime()) {
                return null;
            }

            //假如过期日期比当前时间小。
            if (expiresAt != null && expiresAt.getTime() < td.getTime()) {
                return null;
            }

            //比较key
            claims = jwt.getClaims();

            if (claims != null) {
                if (claims.get("key") == null) {
                    return null;
                }

                claimKey = claims.get("key").asString();
                if (claimKey == null || claimKey.trim().equals("")) {
                    return null;
                }

                return claimKey;

            }


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return null;
    }

    /**
     * @param aToken
     * @return
     * @throws Exception
     */
    @Override
    public String parseTokenTenant(String aToken) throws Exception {
        Algorithm algorithm = null;
        JWTVerifier verifier = null;
        DecodedJWT jwt = null;

        Date expiresAt = null;
        Date issuedAt = null;
        Date notBefore = null;
        Date td = null;

        String claimKey = "";

        Map<String, Claim> claims = null;
        try {

            algorithm = Algorithm.HMAC256(SECRET);
            verifier = JWT.require(algorithm)
                    .withIssuer(AUTHOR)
                    .build();

            jwt = verifier.verify(aToken);

            //验证是否过期
            if (jwt.getExpiresAt() != null) {
                expiresAt = jwt.getExpiresAt();
            }

            if (jwt.getIssuedAt() != null) {
                issuedAt = jwt.getIssuedAt();
            }

            if (jwt.getNotBefore() != null) {
                notBefore = jwt.getNotBefore();
            }

            td = new Date(System.currentTimeMillis());
            //假如发布日期在未来，则验证不过。
            if (issuedAt != null && issuedAt.getTime() > td.getTime()) {
                return null;
            }

            //假如过期日期比当前时间小。
            if (expiresAt != null && expiresAt.getTime() < td.getTime()) {
                return null;
            }

            //比较key
            claims = jwt.getClaims();

            if (claims != null) {
                if (claims.get("tenant") == null) {
                    return null;
                }

                claimKey = claims.get("tenant").asString();
                if (claimKey == null || claimKey.trim().equals("")) {
                    return null;
                }

                return claimKey;

            }


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return null;
    }


}
