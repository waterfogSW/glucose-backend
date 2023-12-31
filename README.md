# 포도당


<p align="center">
    <img src="docs/image/logo.png" width="200px" height="200px" alt="logo" />
</p>

<p align="center">
  <img src = "https://img.shields.io/badge/development-in%20progress-yellow">
</p>

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.21-7F52FF?style=flat&logo=kotlin)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.1-6DB33F?style=flat&logo=spring-boot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-3.2.1-6DB33F?style=flat&logo=spring)
![OpenFeign](https://img.shields.io/badge/Open_Feign-4.1.0-orange?style=flat)
![Kotest](https://img.shields.io/badge/Kotest-5.6.0-7F52FF?style=flat)
![Spring Cloud Contract](https://img.shields.io/badge/Spring_Cloud_Contract-4.0.1-6DB33F?style=flat&logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0.33-4479A1?style=flat&logo=mysql)

## 목차

- [📝 서비스 개요](#-서비스-개요)
- [🛰️ 주요 기능](#-주요-기능)
- [👨‍💻 유스케이스](#-유스케이스)
- [🏗️ 아키텍처](#-아키텍처)
- [👷🏻 구현](#-구현)
- [📝 API 문서](#-api-문서)
- [🛢️ ERD](#-erd)
- [📐 시퀀스 다이어그램](#-시퀀스-다이어그램)
- [📚 참고 자료](#-참고-자료)


## 📝 서비스 개요

많은 사람들이 일상에서 마주하는 물건, 장소, 사건 등에 대해 이야기하고 싶어하지만, 이에 대해 토론하거나 정보를 공유할 플랫폼을 찾는데 어려움이 있습니다. **포도당**은
사용자가 현재 경험하고 있는 것들에 대해 즉시 대화를 나눌 수 있도록, **사진을 업로드하면, AI를 통해 해당 이미지를 분석해 적절한 채팅방을 추천**하고 실시간으로 대화를
나눌수 있는 플랫폼입니다.

## 🛰️ 주요 기능

**1. 실시간 사진 업로드 및 AI 분석**

사용자는 현재 보고 있는 것이나 경험하고 있는 상황에 대한 사진을 업로드합니다.
AI는 사진의 내용을 분석하여 현재 개설된 채팅방중 적합한 채팅방을 추천합니다. 만약 적합한 채팅방이 없다면, 새로운 채팅방을 개설합니다.

**2. 관련 채팅방 추천 및 참여**

사용자는 추천된 채팅방에서 즉각적으로 다른 이들과 의견을 나눌 수 있습니다.
예를 들어, 새로운 카페의 사진을 업로드하면, 카페 탐방이나 커피에 관심이 있는 사람들과의 대화방이 제안될 수 있습니다.

**3. 실시간 소통 및 네트워킹**

사용자들은 자신의 경험을 실시간으로 공유하며, 동시에 비슷한 관심사를 가진 사람들과 네트워킹할 수 있습니다.

## 👨‍💻 유스케이스

### 유저

- 사용자는 소셜 로그인을 통해 로그인 할 수 있다.
- 사용자는 자신의 프로필을 수정할 수 있다.
- 사용자는 자신의 프로필을 조회할 수 있다.
- 사용자는 회원탈퇴를 할 수 있다.

### 채팅

- 사용자는 이미지를 통해 적절한 채팅방을 추천받을 수 있다.
- 사용자는 새로운 채팅방을 생성할 수 있다.
- 사용자는 채팅방의 정보를 확인할 수 있다.
- 사용자는 채팅방에 참여할 수 있다.
- 사용자는 채팅방에 메시지를 전송할 수 있다.
- 사용자는 채팅방을 나갈 수 있다.
- 사용자는 다른 사용자의 프로필을 확인할 수 있다.

## 🏗️ 아키텍처

### 시스템 아키텍처

![img.png](docs/image/Service%20Architecture.png)

## 🚀 구현

### 1. 소셜 로그인 -> OIDC

**기술 선택**

- OIDC
  - OAuth 2.0의 인증 및 인가 과정을 단순화한 프로토콜.
  - OAuth 2.0의 Authorization Code Flow에 사용자 정보를 포함하고 있는 ID Token을 같이 발급받아 사용자 정보를 확인할 수 있음. 
  - Access Token을 통해 사용자 정보를 Provider의 리소스 서버에 사용자 정보를 요청하는 과정이 필요 없음.
- Open Feign
  - Spring Security의 OAuth 2.0 Client도 사용할 수 있지만, Spring Security 의존성들도 포함되기 때문에, client모듈에 사용하기 부적합
  - Open Feign은 외부 API를 호출하기 위한 HTTP Client로 어노테이션 기반으로 선언적으로 사용할 수 있어 편리함. 

**구현**

- OIDC를 사용해 OAuth 2.0의 인증 및 인가 과정을 단순화.
- Open Feign을 사용해 

![img.png](docs/image/oidc-flow.png)

### 2. 이미지 분석을 통한 채팅방 추천

...Vector DB, ChatGPT API

### 3. 실시간 채팅 기능

...

## 📝 API 문서

...

## 🛢️ ERD

...

## 📐 시퀀스 다이어그램

...

## 📚 참고 자료

...
