# 2025-likelion-exercise

## 2025-06-17

링크: https://codesche.oopy.io/210de3f7-e3a8-80e0-bc4c-c96e8fad5b8d

1. 개발 환경 세팅
2. Docker, MySQL, nginx
3. 로드 밸런싱, 다중 서버 구축

## 2025-06-18

링크: https://codesche.oopy.io/215de3f7-e3a8-80bb-9643-d464dce55d04

1. 순수 WebSocket 채팅 서버
2. Spring WebSocket + STOMP 채팅 서버 (1:1), (단체)

## 2025-06-19

링크: https://codesche.oopy.io/216de3f7-e3a8-801e-aedd-e6bd7b546604

1. 취업 특강
   1. 개발자 채용 현황과 취업 준비
   2. 서류 작성법: 이력서 & 포트폴리오
   3. 직무 분석 및 프로젝트 주제 도출 방법
   4. 자기소개 및 기술스택 문장 작성 실습
   5. 프로젝트
2. Spring WebSocket + STOMP 채팅 서버 + redis

## 2025-06-20

링크: https://codesche.oopy.io/218de3f7-e3a8-806c-b391-cc88cc2284bd

1. AI 챗봇 구현
   1. OpenAI 접속 + Postman 세팅
   2. 코드 작성 및 수정
2. Jenkins 세팅
   1. 초기 세팅
   2. 새로운 Item 생성
   3. 파이프라인 실행
   4. Jenkins 배포 자동화 진행 (로컬에 배포)
3. 오늘 푸시한 커밋 리스트

|날짜|커밋 메세지|
|:--:|:--:|
2025-06-20 | [jenkins 세팅](https://github.com/codesche/2025-likelion-exercise/commit/5c84295b4989d985ce0cafd9d85a34b21e486026)
2025-06-20 | [AI 챗봇 서비스 메인 페이지](https://github.com/codesche/2025-likelion-exercise/commit/bb1ebd9f29ac86b8086e3f8e83049e15ca0aa58b)
2025-06-20 | [AI 챗봇 서비스 계층 구현](https://github.com/codesche/2025-likelion-exercise/commit/33ec818287cb32693656387031eed17dc1fbcbb1)
2025-06-20 | [AI 챗봇 UI 코드](https://github.com/codesche/2025-likelion-exercise/commit/977040a23b266a58a0e97132012738141a506684)
2025-06-20 | [젠킨스 배포 위한 테스트 폴더 쪽 properties 추가](https://github.com/codesche/2025-likelion-exercise/commit/fae752494d54753ed26c3a038da0972b2b98df85)
2025-06-20 | [redis 설정 변경 및 open.api.key 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/d4e174b8f5fdbe0cd7c2d40a1336f87db36758fa)
2025-06-20 | [Jenkins 배포 위한 @ActiveProfiles("test") 추가](https://github.com/codesche/2025-likelion-exercise/commit/53bb708fd0284950aa106d25a0f819c543c2538a)
2025-06-20 | [H2 DB 추가](https://github.com/codesche/2025-likelion-exercise/commit/c538024819a937793898fdb068371296825248be)
2025-06-20 | [AI 챗봇 기능 위한 sendMessageGPT 메서드 생성하여 gptService 구현하기 위해 컨트롤러 계층에 코드 작성](https://github.com/codesche/2025-likelion-exercise/commit/cc8e80d118fbda9888c15cc2d0bcf0dbfb2d6efb)
2025-06-20 | [생성자 추가](https://github.com/codesche/2025-likelion-exercise/commit/d18ccc7cec4e8c5ba470a14460fd05232d46078e)
2025-06-20 | [주석 처리 + nginx 설정 image -> build 로 변경](https://github.com/codesche/2025-likelion-exercise/commit/86c7f851a7e3cf44b9fbec84dc7f208a57f15b38)
2025-06-20 | [gpt 엔드포인트 추가](https://github.com/codesche/2025-likelion-exercise/commit/9c92e481a070b97da5e52557bde90b3319fe1520) 

## 2025-06-23

링크: https://codesche.oopy.io/21ade3f7-e3a8-8071-8488-ed0596c1bba4

1. Jenkins 심화 - profile 적용(분기 처리)
   1. 폴더 구조 변경
   2. 에러 확인
2. JPA
   1. Spring Data JPA
   2. 실습 진행 방식
   3. JPA 심화
   4. '회원가입 + 로그인' 실습
3. 오늘 푸시한 커밋 리스트

|날짜|커밋 메세지|
|:--:|:--:|
2025-06-23 | [젠킨스 폴더 구조 변경 후 docker-compose.data.yml 생성](https://github.com/codesche/2025-likelion-exercise/commit/48d7152145a7afa09e2e72fa1dd9bb77dbc34b2f)
2025-06-23 | [젠킨스 폴더 구조 변경 후 docker-compose.cicd.yml 수정](https://github.com/codesche/2025-likelion-exercise/commit/cb4f1823547f5e174d1888e4d5309684ff9a1890)
2025-06-23 | [Data > .env 파일 추가](https://github.com/codesche/2025-likelion-exercise/commit/3cc78bd4ae5c36520bfd773d97ae733ddbef818b)
2025-06-23 | [backendProject > .env 파일 추가](https://github.com/codesche/2025-likelion-exercise/commit/32fa2610cdd3aba6827a091f3e4c0b7135fc786c)
2025-06-23 | [update readme](https://github.com/codesche/2025-likelion-exercise/commit/c9f62072979a5307b05724171ab88b9126a89912)
2025-06-23 | [젠킨스 폴더 구성 변경 이후 nginx 폴더에 Dockerfile 생성](https://github.com/codesche/2025-likelion-exercise/commit/0e89ed212520b707e5dd091d2dfce149b4191e82)
2025-06-23 | [젠킨스 폴더 구성 변경 이후 nginx 폴더에 Dockerfile 생성](https://github.com/codesche/2025-likelion-exercise/commit/cf2cb32e69b6edf83ad6fa942f4937447ff360c5)
2025-06-23 | [젠킨스 폴더 구성 변경 이후 docker-compose.backend.yml 파일 생성](https://github.com/codesche/2025-likelion-exercise/commit/86890df7463e09938916ba5afbd4e4292352107b)
2025-06-23 | [getRoomId() -> getTo() 로 변경](https://github.com/codesche/2025-likelion-exercise/commit/d5b046cacaad3839fd7f0dd460918e874c98b3a0)
2025-06-23 | [H2 DB 설정 해제](https://github.com/codesche/2025-likelion-exercise/commit/a9a9f99411494893eb7a70748edbcf13af6d1223)
2025-06-23 | [JPA 실습 위한 index.html 파일 추가](https://github.com/codesche/2025-likelion-exercise/commit/9e2782ef973ffc80d9a8aaf8d65f36d95b8699d7)
2025-06-23 | [젠킨스 파일 구조 변경 이후 Jenkinsfile 수정](https://github.com/codesche/2025-likelion-exercise/commit/9763cb0e9e91f540a914cdf1f67ebbcf964c297f)
2025-06-23 | [젠킨스 파일 구조 변경 이후 nginx.conf 파일 backendProject > nginx 폴더에 위치](https://github.com/codesche/2025-likelion-exercise/commit/8adee19ddf8b23119ec979e805fde4edec0fed32)
2025-06-23 | [LoginRequestDTO 생성](https://github.com/codesche/2025-likelion-exercise/commit/a5efc8d98b66c3d9b1edfbc7ab46a2a8b8b47f2e)
2025-06-23 | [젠킨스 빌드 위해 프로파일 test 주석 처리](https://github.com/codesche/2025-likelion-exercise/commit/cb3adaaaf4982d753cf091fe9eaf42107b292272)
2025-06-23 | [SignUpRequestDTO 생성](https://github.com/codesche/2025-likelion-exercise/commit/2a4bd620c6bdc4a354da8070997509ba03d50166)
2025-06-23 | [UserRepository 생성](https://github.com/codesche/2025-likelion-exercise/commit/85d90826ff93e8b9d7fe95f3ca9d471779c417c4)
2025-06-23 | [UserProfile 생성](https://github.com/codesche/2025-likelion-exercise/commit/c49138e2167206f1e08e9a2ab6918042d87ac675)
2025-06-23 | [UserDTO 생성](https://github.com/codesche/2025-likelion-exercise/commit/926bc8897ced17247cf786c684b0db931cfbe245)
2025-06-23 | [User 엔티티 생성](https://github.com/codesche/2025-likelion-exercise/commit/76365d1a03df3810a4944feb141c566a4f6f4cb2)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - stompchat2.html](https://github.com/codesche/2025-likelion-exercise/commit/8c2768d9e6c0a6178eea9f02b7abb8f9fcdfe4c2)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - signup.html](https://github.com/codesche/2025-likelion-exercise/commit/4d474297d3f99f50f274ad39261b49e11e75e898)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - myinfo.html](https://github.com/codesche/2025-likelion-exercise/commit/f36a09cafd6bc0aa2c06b25f31ffcfcd4a960aaf)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - main.html](https://github.com/codesche/2025-likelion-exercise/commit/d4b8ddcfbe30134845f916756682d61bc0148801)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - gpt.html](https://github.com/codesche/2025-likelion-exercise/commit/5d975694f86e4cf0416985b47481edb104415518)
2025-06-23 | [JPA 실습 위한 html 파일 추가 - board.html](https://github.com/codesche/2025-likelion-exercise/commit/377bf5aa6c0ffbd5b08094f5a79f9c71004a6b9f)
2025-06-23 | [어노테이션 주석 처리 - test profile 설정 해제](https://github.com/codesche/2025-likelion-exercise/commit/51cff82d179c76621104d3ec8a7ed25131ea96af)
2025-06-23 | [Auth 서비스 생성](https://github.com/codesche/2025-likelion-exercise/commit/f1c72bc60ca4ece68211dd6c85eb7c9f249225b2)
2025-06-23 | [Auth 리포지토리 생성](https://github.com/codesche/2025-likelion-exercise/commit/d8695d58aa2d42903ba4ddab951f96f136108cb4)
2025-06-23 | [Auth 컨트롤러 생성](https://github.com/codesche/2025-likelion-exercise/commit/2cd94ba81e60a948df285901b8de3b05aaf6920f)
2025-06-23 | [Auth 엔티티 생성](https://github.com/codesche/2025-likelion-exercise/commit/d563704d9beb0f0b298dc3e85f0bac9979026aa4)
2025-06-23 | [JPA 실습 위한 설정 파일 변경 - test 구성 파일 주석 처리](https://github.com/codesche/2025-likelion-exercise/commit/5fb793abbafbab5a332641b254114b2bbbe41bc0)
2025-06-23 | [JPA 실습 위한 설정 파일 변경 - local (분기 처리)](https://github.com/codesche/2025-likelion-exercise/commit/26fdf68eb693b46b3e9dd2eaf9bbd7dc8f245f3a)
2025-06-23 | [젠킨스 실습 위한 설정 파일 변경 - prd (분기 처리)](https://github.com/codesche/2025-likelion-exercise/commit/c1c89624688903c3129722d7907e8ebe3eb77b90)
2025-06-23 | [젠킨스 실습 위한 설정 파일 변경 - dev (분기 처리)](https://github.com/codesche/2025-likelion-exercise/commit/5faae2dd865ad953308580c0c0860efd84894949)
2025-06-23 | [JPA 실습 위한 설정 파일 변경](https://github.com/codesche/2025-likelion-exercise/commit/78f1bcdadeaf777b615fa6a3b01bb4f768206834)


## 2025-06-24

링크: https://codesche.oopy.io/21bde3f7-e3a8-809c-b1a2-e5ac99c99027

1. JPA
   1. 엔티티 연관관계 정리
   2. Auth 파트
   3. User 파트
   4. Board 파트
   5. 대량 배치 삽입 - 소요 시간 비교
2. 오늘 푸시한 커밋 리스트

|날짜|커밋 메세지|
|:--:|:--:|
2025-06-24 | [update readme](https://github.com/codesche/2025-likelion-exercise/commit/fef1a50070c2f4a0e70304db874d4915874f1aac)
2025-06-24 | [feat(service): 댓글 서비스 로직 구현](https://github.com/codesche/2025-likelion-exercise/commit/301bd789d423e786ae5d2379c0d209dafe5164b8)
2025-06-24 | [feat(repository): CommentRepository JPA 인터페이스 생성](https://github.com/codesche/2025-likelion-exercise/commit/6a6f6276a69e3e024cbd6933dc60a206627efe60)
2025-06-24 | [feat(dto): 댓글 Request DTO 작성](https://github.com/codesche/2025-likelion-exercise/commit/eceb67850bf00f6ca14b233c299a780c77c449bf)
2025-06-24 | [feat(controller): 댓글 API 추가](https://github.com/codesche/2025-likelion-exercise/commit/a6f0793fec3883bbd285ca0c4ffa7a46a17c4f22)
2025-06-24 | [feat(entity): Comment 엔티티 생성](https://github.com/codesche/2025-likelion-exercise/commit/a7b994afdb542d95c4d73cf41e819bbbcc33eac5)
2025-06-24 | [feat(service): 게시판 서비스 로직 구현](https://github.com/codesche/2025-likelion-exercise/commit/9ec370917fc7a8fb7c01e61e73d52cca9fc54d28)
2025-06-24 | [feat(dto): BoardRepository JPA 인터페이스 생성](https://github.com/codesche/2025-likelion-exercise/commit/1fb150e12e87cc13d2db00d688493b373f5f1cb7)
2025-06-24 | [feat(dto): 게시판 Request DTO 작성](https://github.com/codesche/2025-likelion-exercise/commit/6565b8a7ddcb019473302a1060bf75a714eb9f02)
2025-06-24 | [feat(controller): 게시판 API 추가](https://github.com/codesche/2025-likelion-exercise/commit/f937f1f11ce2b625edba5768472a249276abe986)
2025-06-24 | [feat(entity): Board 엔티티 생성](https://github.com/codesche/2025-likelion-exercise/commit/036829ad4ba6707beff71f5bb6ab51ec84059e19)
2025-06-24 | [feat(config): batch 관련 정보 추가](https://github.com/codesche/2025-likelion-exercise/commit/e9704ee863824f5916f363249d62a2b7db854204)
2025-06-24 | [feat(entity): 일괄 작업 처리 위한 BatchRepository 생성](https://github.com/codesche/2025-likelion-exercise/commit/83674b7413738557185aa7c33d049f5ff24479d8)
2025-06-24 | [feat(entity): BaseTime 엔티티 생성](https://github.com/codesche/2025-likelion-exercise/commit/c0a51d02ee7049544f5fc126a0ad7ec9a097c58f)
2025-06-24 | [feat(main): @EnableJpaAuditing 추가](https://github.com/codesche/2025-likelion-exercise/commit/aeafd13c9aab0d6c4e7f54b2c672d21bb1c1dc4b)
2025-06-24 | [feat(service): @Transactional 패키지 수정 + 로그인 쪽 코드 수정](https://github.com/codesche/2025-likelion-exercise/commit/5920de1edbd33158e1c93d4b43e74a6c2e1603aa)
2025-06-24 | [feat(html): 유저 정보 호출 관련 API 처리 코드 제거](https://github.com/codesche/2025-likelion-exercise/commit/f4327f31de55123ec57c11c71cbd4fad5eb34ad1)
2025-06-24 | [feat(html): 게시판 메인 페이지 레이아웃 마크업 추가](https://github.com/codesche/2025-likelion-exercise/commit/02251f51ea42b83906f783c4d88fd56763c60c2e)
2025-06-24 | [feat(service): 유저 정보 서비스 로직 구현](https://github.com/codesche/2025-likelion-exercise/commit/2f99ec3e3fce5b8737250cb522675eabfaa4dae9)
2025-06-24 | [feat(repository): 회원정보 JPA 인터페이스 생성](https://github.com/codesche/2025-likelion-exercise/commit/d8cfa12f059a4c4c94bc9c4c3ce330e1c6946f50)
2025-06-24 | [feat(dto): 회원정보 수정 RequestDTO 작성](https://github.com/codesche/2025-likelion-exercise/commit/16a7930fce7a8a01cabf1a035183adacb1ff1674)
2025-06-24 | [feat(dto): 로그인/회원가입 RequestDTO 작성](https://github.com/codesche/2025-likelion-exercise/commit/626ff4510c4efb54dcc75e758842a51df44c4e23)
2025-06-24 | [feat(controller): 로그인, 회원가입, 회원정보 수정 API 추가](https://github.com/codesche/2025-likelion-exercise/commit/ff2bb427456a005c854b6b12eb15323fb449d790)
2025-06-24 | [feat(entity): 연관관계 처리하는 boards 변수 추가](https://github.com/codesche/2025-likelion-exercise/commit/0d00baa531ddc7768688c61719359759556748f3)

## 2025-06-25

링크: https://codesche.oopy.io/21cde3f7-e3a8-8081-a421-eafc7ee101ca

1. Spring Security & JWT
   1. build.gradle 설정
   2. application.properties 수정
   3. JWT 패키지 구성
   4. JwtKey (jwt > JwtKey)
   5. Role (core > Role)
   6. CustomUserDetails (core > CustomUserDetails)
   7. User - Role 추가
   8. CustomUserDetailsService (core > CustomUserDetailsService)
   9. JwtTokenProvider
   10. JwtTokenFilter
   11. SecurityConfig
2.  Auth
    1.  새로 회원가입 후 로그인
    2.  내 정보 수정
3.  게시판 테스트
    1.  게시판 CRUD 체크 + 댓글, 대댓글 체크
4.  오늘 푸시한 커밋 리스트

|날짜|커밋 메세지|
|:--:|:--:|
2025-06-25 | [fix(service): 내 정보 수정 화면에서 전화번호와 주소 정보가 보이지 않는 이슈 처리](https://github.com/codesche/2025-likelion-exercise/commit/463902b64ae3047f146211a9904fecb4e919ed6b)
2025-06-25 | [feat(entity): JWT 토큰에서 사용자 정보를 읽어오는 로직을 내 정보 보기, 유저 정보 수정 API에 적용](https://github.com/codesche/2025-likelion-exercise/commit/10c83f6eb826e0aa11d610fbfa67d3a1b4fdf4ba)
2025-06-25 | [feat(entity): role 변수 추가](https://github.com/codesche/2025-likelion-exercise/commit/45da99d2bd3b7bcbb6b89f41486b46ec65cf6240)
2025-06-25 | [feat(html): jwt 로그인 인증 방식에 맞는 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/dceb1aa209f8bcfb782cf702318cec26868f79a5)
2025-06-25 | [feat(html): jwt 로그인 인증 방식에 맞는 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/0ae02858c3e1fcc98c8f75be391c53a7b2c5c9e1)
2025-06-25 | [feat(html): jwt 로그인 인증 방식에 맞는 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/a7105b23b5477e8d9f0c1f5408021e0f9decf7dd)
2025-06-25 | [feat(dto): 로그인 Response DTO 작성](https://github.com/codesche/2025-likelion-exercise/commit/8653d4bc7c42a10fd77075e893a95c22ab6b5153)
2025-06-25 | [feat(jwt): Jwt 유효성 검증 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/ae186bfd3693af1e2dc2bceda9f3c29d25fb282a)
2025-06-25 | [feat(jwt): Jwt 인증 필터 JwtTokenFilter 구현](https://github.com/codesche/2025-likelion-exercise/commit/d6779ac1d5c048e2442f1a592162aa4b7ad200af)
2025-06-25 | [feat(jwt): JwtKey 유틸 클래스 생성](https://github.com/codesche/2025-likelion-exercise/commit/11fd5c8acdf16ba9cd0c7496eb2ccf34acd27f48)
2025-06-25 | [feat(security): CustomUserDetailsService 구현](https://github.com/codesche/2025-likelion-exercise/commit/9dfff020f272ed92e5b4db88f0a4c2e794d87c2e)
2025-06-25 | [feat(security): 사용자 정보 처리를 위한 기본 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/dbb079e90d4c080c5fe8d67db8e6193e971f6e9a)
2025-06-25 | [feat(config): JWT + Spring Security 라이브러리 추가](https://github.com/codesche/2025-likelion-exercise/commit/0cb662a017fb727627d140e1d93a4f9ef0d450f6)
2025-06-25 | [fix(repository): 제목 조건 정렬 기능 해제](https://github.com/codesche/2025-likelion-exercise/commit/0efc6b7680e10a52e1fb97e452542cc6f7044323)
2025-06-25 | [feat(controller): jwt 토큰 인증 받은 사용자만 접속 가능하도록 로직 수정](https://github.com/codesche/2025-likelion-exercise/commit/86114535c1ee0a9c97f5dc6ee8bf1ccb18330959)
2025-06-25 | [feat(html): jwt 토큰 인증 방식 로그인 위한 코드 수정](https://github.com/codesche/2025-likelion-exercise/commit/9d2c6cb93e5619915a0b4ad79a3a8cea88add8a9)
2025-06-25 | [feat(security): Spring Security 기본 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/94d1068328ff62c6aadd2a12629ec4eb56619164)
2025-06-25 | [feat(enum): 유저 권한 구분 위한 enum 파일 생성](https://github.com/codesche/2025-likelion-exercise/commit/68c1c8fbfd5b6d5c5ed0b4d175dfd1400bf74140)
2025-06-25 | [feat(html): JWT Token 로그인 위한 코드 수정(fetchWithAuth.js)](https://github.com/codesche/2025-likelion-exercise/commit/d5dc0654b20f00c794b0a178939502cd88bcfc71)
2025-06-25 | [feat(repository): JWT Token 로그인 서비스 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/75ab43ca4a01ffbc7f8aace182cfdf903a564715)
2025-06-25 | [feat(repository): findByRefreshToken, existsByUser 메서드 추가](https://github.com/codesche/2025-likelion-exercise/commit/336f51067cae830e5d9d5a8dd09252f5393c0201)
2025-06-25 | [feat(controller): JWT 토큰 인증 로그인 방식 API로 수정](https://github.com/codesche/2025-likelion-exercise/commit/5c5f896507a2738b1da6ceb02c5a9fb8411dc687)
2025-06-25 | [feat(entity): JWT 토큰 인증 방식 위한 업데이트 메서드 추가 + 생성자 추가](https://github.com/codesche/2025-likelion-exercise/commit/a445576423c69f4e0d923b9158ed51de3e948e7c)
2025-06-25 | [feat(config): Jwt accessToken, refreshToken, secretKey 정보 추가](https://github.com/codesche/2025-likelion-exercise/commit/749f710cf432c63c61b3667c5d8fd83ebcc26f59)
2025-06-25 | [feat(js): Jwt 토큰 로그인 서비스 구현](https://github.com/codesche/2025-likelion-exercise/commit/0a53f7837578070050dae84f177ce208ec4ef7d4)
2025-06-25 | [feat(image): 메인 페이지 접속할 때 보여지는 도메인 이미지 추가](https://github.com/codesche/2025-likelion-exercise/commit/a462dc88d673afe18a74a18e518c3576f5fc06d4)
2025-06-25 | [feat(html): JwtToken 로그인 방식 구현 위한 코드 수정](https://github.com/codesche/2025-likelion-exercise/commit/d7da3d909cb08b60b8b3cb440c9b1d1c7bf7f948)
2025-06-25 | [feat(html): JwtToken 로그인 방식 구현 위한 코드 수정](https://github.com/codesche/2025-likelion-exercise/commit/83bf23df57493d6b42d85328e111a5a311e124c4)

## 2025-06-26

링크: https://codesche.oopy.io/21dde3f7-e3a8-80d3-b37a-d3696ec1e198

1. 테스트
   1. JwtToken 테스트
2. 소셜 로그인 (Googlem Kakao)
   1. Config 수정
   2. 소셜 로그인 코드 작성
   3. application.properties 에 google, kakao 관련 정보 추가
   4. 구글 로그인 테스트
   5. 카카오톡 로그인 테스트
3. 토큰을 제대로 불러오지 못하는 에러
   1. JwtTokenFilter 쪽에 Cookie 쪽 토큰을 바라보는 메서드 추가 후 doFilterInternal 메서드에 적용
4. 모니터링 실행
   1. build.gradle 실행
   2. application-properties 설정
   3. Docker-compose yml 파일로 Grafana, Prometheus 세팅
   4. Docker Container 확인
5. 오늘 푸시한 커밋리스트

|날짜|커밋 메세지|
|:---:|:---:|                                                                              
2025-06-26 | [update readme](https://github.com/codesche/2025-likelion-exercise/commit/609b58d36b7d3158a6324306e991d20770a599b1)
2025-06-26 | [feat(config): prometheus, grafana, logstash 관련 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/e31f3088fd041efe3b0b42dd73adbb9e94b1b327)
2025-06-26 | [feat(repository): 소셜 로그인 세션 처리 위한 RedisOAuth2AuthorizationRequestRepository 구현](https://github.com/codesche/2025-likelion-exercise/commit/4bbddabadd72160aba92b2933861dadb87bba651)
2025-06-26 | [feat(config): Redis 클라이언트 추가 위한 redisTemplate 생성 + host, port 정보 관련 내용 추가](https://github.com/codesche/2025-likelion-exercise/commit/d11953cc9e3bd97b073e8702856126b2a44721dd)
2025-06-26 | [feat(service): 소셜 로그인 서비스 구현](https://github.com/codesche/2025-likelion-exercise/commit/b30a2bfe07c254488f675722dd49b13224ce8be3)
2025-06-26 | [feat(auth2): 로그아웃 동작을 구현하기 위한 클래스 생성](https://github.com/codesche/2025-likelion-exercise/commit/41535af6acb4182400e7e7125504c4a98630bb92)
2025-06-26 | [feat(auth2): 로그인 동작을 커스텀으로 구현하기 위한 클래스 생성](https://github.com/codesche/2025-likelion-exercise/commit/b634e543271c6b00ad0c704b0e6ed9a57f73f047)
2025-06-26 | [feat(security): 소셜 로그인, 로그아웃, 웹소켓 핸드셰이크, 프로메테우스 모두 사용할 수 있게 해주는 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/553728efdb443a45dca3d884865a5efeac4bf9d3)
2025-06-26 | [fix(html): 소셜 로그인 접속 API 주소 가능하도록 수정](https://github.com/codesche/2025-likelion-exercise/commit/e4ef9bce2d2595f14a5bb3f676f3a3597b9c4a77)
2025-06-26 | [fix(jwt): JWT 인증 필터에 extractTokenFromRequest 메서드 추가 및 적용](https://github.com/codesche/2025-likelion-exercise/commit/1683229382323659f8cdc877a6e1d6e861ab8129)
2025-06-26 | [fix(service): JWT 인증 받은 사용자에 한해 게시글 삭제가 가능하도록 수정](https://github.com/codesche/2025-likelion-exercise/commit/183102864c0a349b327813cdef8765245ed9f66a)
2025-06-26 | [chore(controller): oAuth2, 프로메테우스, Spring Boot Actuator 추가](https://github.com/codesche/2025-likelion-exercise/commit/f53c9f68ac732a0c6ff49201dee168062de7202a)
2025-06-26 | [fix(controller): JWT 토큰 인증 받은 사용자만 게시글을 수정, 삭제할 수 있도록 수정](https://github.com/codesche/2025-likelion-exercise/commit/4388e6a40c460a2f1cc7593d4ce8f6faf690b8a6)
2025-06-26 | [feat(html): 수정 화면 쪽 사용자 ID hidden 처리하는 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/6d4247b12cef3e6bb661756effaa52feeb951de3)
2025-06-26 | [feat(repository): Auth 엔티티에 토큰 저장하는 메서드 추가](https://github.com/codesche/2025-likelion-exercise/commit/d11f815332bc51ad4a1026a3890049143a635127)
2025-06-26 | [feat(controller): 로그아웃 기능 추가 + 일반 로그인 API 로직 수정](https://github.com/codesche/2025-likelion-exercise/commit/07636ca5c4427c671c6da4120b0884f9640a5958)
2025-06-26 | [feat(config): 소셜 로그인 Google, Kakao 설정 추가](https://github.com/codesche/2025-likelion-exercise/commit/2d25bed878a16b6fe9266f7746daeb23a6be9ee7)


## 2025-06-27

링크: https://codesche.oopy.io/21ede3f7-e3a8-80c6-83d2-f381e558ecdc

1. 예외 처리가 중요한 이유
2. 예외를 구분해서 처리해야 하는 이유
   1. 체크예외 (Checked Exception)
   2. 언체크예외 (Unchecked Exception)
3. 예외 코드 작성
   1. GlobalExceptionHandler
   2. ErrorResponse
   3. 주요 사용하는 예외 처리 관련 코드
   4. 예외 테스트
4. 로그의 목적
   1. 로그 적용
5. 로그 수집기 (Elasticsearch + LogStash + Kibana 구축)
   1. application-properties
   2. ELK 설정 후 docker-compose.yml 파일 실행
   3. logback-spring.yml 작성
   4. localhost:9200/_cat/indices?v 에 접속하여 로그 확인
   5. 로그 보기
   6. ElasticSearch 인덱스 확인
   7. 샤드란 무엇인가?
6. AOP (Aspect-Oriented Programming)
   1. 스프링에서의 공통 기능
   2. AOP 용어
7. 컨테이너 여러 개 실행하여 Grafana 에서 확인하는 절차
   1. prometheus.yml 파일 주석 해제
   2. Jenkins build 실행
8. 오늘 푸시한 커밋리스트 (다음 날 커밋, 푸시 진행)


| 날짜  | 커밋 메세지 |
| :---: | :---------: |
2025-06-28 | [fix(service): System.out.println -> log.info(Slf4j) 로 변경](https://github.com/codesche/2025-likelion-exercise/commit/21a6730e4407abffb119da6298f626db15c2b9df)
2025-06-28 | [feat(config): 예외 처리 관련 보안 해제](https://github.com/codesche/2025-likelion-exercise/commit/792973a570d9f8371add8ca11d7e3940be0e5a0d)
2025-06-28 | [fix(config): 다중 컨테이너 실행 후 Grafana 에서 확인하기 위해 주석 해제](https://github.com/codesche/2025-likelion-exercise/commit/8406632963b139605a4cd5cdca191a807a825a5b)
2025-06-28 | [feat(config): logStash 실행 위한 conf 파일 생성](https://github.com/codesche/2025-likelion-exercise/commit/58a83afcca6cc037b8dc5eb00e6e7b9190d45522)
2025-06-28 | [feat(config): logStash 실행 위한 xml 파일 생성](https://github.com/codesche/2025-likelion-exercise/commit/a5b7c501e62804cd9aae1744b86750fc32feb921)
2025-06-28 | [feat(aop): 공통으로 관리하고 싶은 기능을 담당하는 클래스 생성](https://github.com/codesche/2025-likelion-exercise/commit/73f04e8127fe7df120bcad34df0771b4c221bdec)
2025-06-28 | [feat(jwt): jwt 인증 필터에서 미비된 부분 추가](https://github.com/codesche/2025-likelion-exercise/commit/e919424727277086a27ff34a80d3839e10f8b1b2)
2025-06-28 | [fix(handler): 예외 처리 위한 handler 생성](https://github.com/codesche/2025-likelion-exercise/commit/91db54c2f234ed29259e94aa681b4a37a01893ec)
2025-06-28 | [fix(response): 예외 처리 위한 response 생성](https://github.com/codesche/2025-likelion-exercise/commit/1d81ce04d288d3863781b191d2c7e0b3499fd194)
2025-06-28 | [fix(config): ELK 위한 구성 파일 전면 수정](https://github.com/codesche/2025-likelion-exercise/commit/96435400109f7ebe844c017d59f4d16d7937f015)
2025-06-28 | [fix(service): System.out.println -> Slf4j의 log로 수정](https://github.com/codesche/2025-likelion-exercise/commit/a7d2c16733ad2ed215039c5ca15b5804420c2cfd)


## 2025-06-30

링크: https://codesche.oopy.io/222de3f7-e3a8-80cd-9143-d5b20bd08724

1. ThreadLocal
   1. 주요 사용처
   2. ThreadLocal + 로그 추적기
2. ElasticSearch
   1. ElasticSearch란?
   2. 인덱싱
   3. 역색인이란?
   4. ElasticSearch 인덱싱의 실제 흐름
   5. ElasticSearch 노드(node), 클러스터(cluster), 샤드(shard), 복제(replica)
   6. 운영환경에서 ElasticSearch 검색엔진의 최소 권장 노드(서버) 수
   7. 쿼리 종류
   8. 실습 - 검색은 ElasticSearch로 진행, CRUD는 MySQL에서
3. 오늘 푸시한 커밋리스트

| 날짜  | 커밋 메세지 |
| :---: | :---------: |
2025-06-30 | [feat(handler): 스레드마다 고유한 요청 ID를 저장 및 불러오는 역할 생성](https://github.com/codesche/2025-likelion-exercise/commit/11c5496145e1555e213552b2fe0918cc95ed3140)
2025-06-30 | [feat(aop): ThreadLocal 관련 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/1a704c2656be2be1bdeab072c50e7dddd8e7c75d)
2025-06-30 | [feat(jwt): ThreadLocal 관련 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/85154e3d5b23ace6d41ca25ea17d5b65941f04c0)
2025-06-30 | [feat(service): ElasitcSearch 관련 비즈니스 로직 추가](https://github.com/codesche/2025-likelion-exercise/commit/fad00a20ed23b8e1f290c06608bb2db344e72747)
2025-06-30 | [feat(config): ElasitcSearch 의존 라이브러리 추가](https://github.com/codesche/2025-likelion-exercise/commit/151e21f032b0560fdf0e18cdadfc7b121169b53c)
2025-06-30 | [feat(repository): ElasticSearch 비즈니스 로직 구현](https://github.com/codesche/2025-likelion-exercise/commit/3bd0b33add809520822469b1424f9a1b4dc89671)
2025-06-30 | [feat(repository): ElasticsearchRepository 구현체 생성](https://github.com/codesche/2025-likelion-exercise/commit/ab013c1ff4732f2b05aa93b6eb7bd55c150e399c)
2025-06-30 | [feat(dto): ElasticSearch에 적용될 문서를 자바 객체로 정의](https://github.com/codesche/2025-likelion-exercise/commit/7bb733b3ea4deff35423bdb701b33add78165148)
2025-06-30 | [feat(controller): ElasticSearch 검색결과 page 형태로 감싼 다음 응답을 json으로 반환](https://github.com/codesche/2025-likelion-exercise/commit/4dcc07573ed72297fa472a8f42f6bf2aaf9c406e)
2025-06-30 | [fix(html): 들여쓰기 추가](https://github.com/codesche/2025-likelion-exercise/commit/a5cb230786d92e00538c9a04a9bf723d74f2837d)
2025-06-30 | [feat(repository): ElasticSearch 관련 조회 기능 추가](https://github.com/codesche/2025-likelion-exercise/commit/1c00f56faca4b5f037c5946becaca70d96f4e5f3)