package com.waterfogsw.glucose.user.application.usecase

import com.waterfogsw.glucose.user.application.port.UserSocialLoginInfoRepository
import com.waterfogsw.glucose.user.application.port.UserRepository
import com.waterfogsw.glucose.user.domain.entity.User
import com.waterfogsw.glucose.user.domain.entity.UserSocialLoginInfo
import org.springframework.stereotype.Service

@Service
class UserRegister(
    private val userRepository: UserRepository,
    private val userSocialLoginInfoRepository: UserSocialLoginInfoRepository,
) : UserRegisterUseCase {

    override fun invoke(command: UserRegisterUseCase.Command): UserRegisterUseCase.Result {
        val user: User = User.create(
            name = command.name,
            email = command.email,
            picture = command.picture,
        )
        userRepository.save(user)

        val userSocialLoginInfo = UserSocialLoginInfo.create(
            userId = user.id,
            email = user.email,
            provider = command.provider,
        )
        userSocialLoginInfoRepository.save(userSocialLoginInfo)

        return UserRegisterUseCase.Result.Success(userId = user.id)
    }

}