package com.waterfogsw.glucose.user.infrastructure.client.api.dto

object KakaoOidcApiDtoFixtures {

    fun getTokenRequest(): KakaoOidcApiDto.GetTokenRequest {
        return KakaoOidcApiDto.GetTokenRequest(
            clientId = "clientId",
            redirectUri = "redirectUri",
            clientSecret = "clientSecret",
            code = "code",
        )
    }

    fun getTokenResponse(): KakaoOidcApiDto.GetTokenResponse {
        return KakaoOidcApiDto.GetTokenResponse(
            idToken = "idToken",
            accessToken = "accessToken",
            refreshToken = "refreshToken",
            expiresIn = 1000,
            scope = "scope",
            tokenType = "tokenType",
            refreshTokenExpiresIn = 1000,
        )
    }

    fun getTokenInfoResponse(): KakaoOidcApiDto.GetTokenInfoResponse {
        return KakaoOidcApiDto.GetTokenInfoResponse(
            iss = "iss",
            sub = "sub",
            aud = "aud",
            exp = 1000,
            iat = 1000,
            nickname = "nickname",
            picture = "picture",
            email = "email",
            authTime = 1000,
        )
    }
}
