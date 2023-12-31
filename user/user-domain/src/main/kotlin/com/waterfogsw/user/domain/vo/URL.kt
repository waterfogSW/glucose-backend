package com.waterfogsw.user.domain.vo

@JvmInline
value class URL(private val value: String) {
    init {
        require(isValidUrl(value)) { "유효한 URL 형식이 아닙니다." }
    }

    private fun isValidUrl(value: String): Boolean {
        return try {
            val url = java.net.URL(value)
            url.toURI()
            true
        } catch (exception: Exception) {
            false
        }
    }
}
