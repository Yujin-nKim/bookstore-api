## <img src="https://github.com/nhnacademy-be5-T3Team/front-server/blob/develop/src/main/resources/static/assets/main/images/book-icon.png" width=20 height=20> T3Team Bookstore 

### 프로젝트 소개
- 고객이 책을 검색하고 주문할 수 있는 인터넷 서점입니다.
- NHN 아카데미 Java Backend 5기 과정에서 진행한 팀프로젝트입니다.
- 개발 기간 : 2024.03.11 ~ 05.17
<br>

### 프로젝트 아키텍쳐

<img width="7492" alt="Project  T3Team_bookstore_wireframe" src="https://github.com/nhnacademy-be5-T3Team/.github/assets/84436996/b47151bd-29f8-4588-b165-d24986945ba5">
<br>


### CI/CD
- Github를 통해 코드베이스를 관리하며 변경 사항을 병합하기 위해 Pull Request를 생성하고 팀원들을 이를 검토하고 코드 리뷰를 진행합니다.
PR가 merge되면 Github Action을 통한 CI/CD가 시작됩니다. 이 파이프라인은 빌드를 자동으로 시작하고 빌드된 코드에 대해 SonarQube로 테스트가 진행되어 코드의 품질을 평가합니다. 모든 테스트가 성공하면 자동으로 배포가 진행됩니다.
- 또한, NHN Cloud의 Secure Key Manager를 사용하여 DB 정보를 비롯한 암호화가 필요한 중요한 데이터들을 안전하게 관리하고 환경변수를 통해 접근합니다.
<img width="5636" alt="Project  T3Team_bookstore_wireframe (1)" src="https://github.com/nhnacademy-be5-T3Team/.github/assets/84436996/73238678-403b-4b44-a92b-8827f3fcd8ad">
<br>

### 개발환경
 - 개발도구: Intellij IDEA - Ultimate
 - 언어: Java 11 LTS Temurin
 - 빌드도구: Maven
 - 개발
    - Spring Framework: 5.3
    - Spring Boot: 2.7.18
    - Spring Cloud
      - Spring Cloud Gateway
      - Spring Cloud Netflex(Eureka)
      - Spring Cloud OpenFeign
    - Spring Data
      - Spring Data JPA
      - Spring Data Elasticsearch
      - Spring Data Redis
    - Spring Security
    - JPA
      - QueryDSL
 - 테스트
    - Junit5
    - AssertJ
    - Mockito
    - SonarQube
 - 데이터베이스
    - MySQL: 8.0.25
    - Redis
 - 검색엔진
    - Elastic Search: 7.11.1
    - Kibana: 7.11.1
    - Logstash: 7.11.1
 - ERD
    - ERDCloud
 - 프론트 개발 환경 및 언어
    - 언어:
      - HTML
      - CSS
      - JavaScript
    - 라이브러리 및 프레임워크:
      - Bootstrap 5
      - Thymeleaf
      - TOAST UI
 - NHN Cloud
    - Instance
    - Secure Key Manager
    - Object Storage
 - 형상관리 및 이슈관리
    - GitHub
 - 기타
    - Dooray Hook Sender

### ERD
![image](https://github.com/nhnacademy-be5-T3Team/.github/assets/19462768/0f96422b-cfa0-4343-9451-09e47a4a08b1)
<br>

### [프로젝트 관리, WBS](https://github.com/orgs/nhnacademy-be5-T3Team/projects/2)
Github Roadmap
- Github에서 제공하는 Project를 활용해 프로젝트의 작업 현황과 진행도를 체계적으로 관리했습니다.
- 이를 통해 작업 항목들을 시각적으로 구성하고, 각 항목과 관련된 PR, 이슈 등을 연결하여 프로젝트의 전반적인 진행 상황을 투명하게 공유할 수 있었습니다.

<img width="1679" alt="KakaoTalk_Photo_2024-05-10-13-41-16" src="https://github.com/nhnacademy-be5-T3Team/.github/assets/67141385/e77ab0f0-df81-4459-871f-72f14de660d7">
<br>

### [Kanban Board](https://github.com/orgs/nhnacademy-be5-T3Team/projects/2/views/9)
Github Kanban
- Github의 Project 기능 중 Kanban 보드를 활용하여 프로젝트를 관리했습니다.
- Todo, InProgress, Done 의 열로 작업을 구분해 현재 작업 상황을 실시간으로 확인할 수 있도록 했습니다. 또한, Delay 탭을 별도로 만들어 프로젝트 내에서 지연되는 부분을 확인해 적절한 조치를 취할 수 있도록 했습니다.

<img width="1713" alt="image" src="https://github.com/nhnacademy-be5-T3Team/.github/assets/84436996/5270bbf9-fcee-4538-b202-ab7fd4f13d34">
<br>

### 스크럼
일주일 간격으로 스크럼 마스터를 선정해 매일 아침 10:00에 스크럼을 진행했습니다. 개발 기간 동안 총 40번이 넘는 스크럼이 진행되었고, 스크럼에서는 팀원들이 각자의 진행 상황을 공유하고 발생한 이슈들을 함께 논의하여 프로젝트를 원활하게 진행할 수 있었습니다.

<img width="492" alt="스크린샷 2024-05-10 오후 1 47 41" src="https://github.com/nhnacademy-be5-T3Team/.github/assets/67141385/87571534-7bae-4a70-ac6f-39faa1c44640">
<br>

## :bust_in_silhouette: 김유진 담당 역할 

### 1. 도서 검색, 추천, 리뷰 관리 기능을 제공하는 REST API 개발
- QueryDSL을 사용한 동적쿼리 작성
- 페이지네이션 및 정렬 기능 지원
<img width="998" alt="스크린샷 2025-03-16 오후 2 55 32" src="https://github.com/user-attachments/assets/0d0315f7-bfd7-4a11-965e-862b4ea55cc4" />


### 2. 도서 상세 정보 API의 N+1 문제 해결 및 JPQL에서 QueryDSL로의 단계별 쿼리 개선

1. 과정
    - 도서 상세 정보 조회 API를 구현하는 과정에서 코드 리뷰를 통해 **N+1 문제 가능성을 인식**했습니다.
        - 관련 로그를 분석하며 공부한 결과, **Lazy Loading으로 인해 발생하는 N+1 문제뿐만 아니라, OneToOne 양방향 관계에서의 불필요한 쿼리 호출 문제**까지 확인할 수 있었습니다.
    - 이를 해결하기 위해 **JPQL을 활용한 동적 쿼리를 작성**했고, 이후 **QueryDSL을 적용하며 단계적으로 쿼리를 개선**해 나갔습니다.
2. 성과
    - **QueryDSL을 통해 유지보수성과 가독성을 높이는 동시에, 기존 15개의 쿼리를 4개로 줄이며 불필요한 쿼리 호출을 최소화할 수 있었습니다.**
    - 이 과정에서 **OneToMany 관계가 여러 개 존재할 경우 Fetch Join만으로 N+1 문제를 완전히 해결할 수 없다는 점과, 동적 쿼리를 활용하는 방법에 대해 깊이 배울 수 있었습니다.**



### 3. 알라딘 OpenAPI와 Python을 활용한 도서 데이터 수집 및 데이터베이스 저장 스크립트 개발

1. 과정 
    
    1️⃣ 문제 상황
    
    - 도서 데이터를 **수작업으로 입력해야 하는 번거로움**이 있었습니다.
    - **대량의 도서 데이터를 빠르게 확보하기 어려운 문제**가 있었습니다.
    
    2️⃣ 구현 과정
    
    - **알라딘 OpenAPI를 활용한 도서 데이터 수집**
        - 상품 검색 API와 상세 조회 API를 사용하여 카테고리별 도서 정보를 자동으로 수집했습니다.
        - 출판사, 작가, 이미지 등 연관 데이터를 중복 없이 MySQL에 저장하는 파이썬 스크립트를 개발했습니다.
    - **NHN Object Storage와 연동하여 도서 이미지 다운로드 및 업로드 자동화**
        - API에서 받은 도서 이미지를 자동 다운로드 후, NHN Object Storage에 업로드하는 과정을 구현했습니다.
    - **중복 삽입 방지 및 트랜잭션 관리 적용**
        - 중복 데이터 저장을 방지하고, commit(), rollback()을 활용하여 데이터 정합성을 보장했습니다.
2. 성과
    - 도서 데이터 저장 자동화로 수작업 입력에 소요되는 시간을 대폭 절감했습니다.
    - 약 5,000권 이상의 대량 도서 데이터를 빠르게 확보할 수 있었습니다.


### 4. API 개발의 신뢰성을 높이는 테스트 코드 작성 및 검증 경험

1. 과정
    - **API 개발 초기 - 기본적인 기능 구현**
        - 처음에는 CRUD 중심의 기본 API 개발에 집중했습니다.
        - 하지만 비즈니스 로직이 추가되고 데이터 연동이 필요해지면서, 단순한 수동 테스트만으로 기능의 정상 동작을 보장하기 어려운 문제가 발생했습니다.
    - **수동 테스트의 한계를 경험**
        - 기능 추가 및 수정 시 **API를 직접 호출하며 테스트해야 했고, 예상치 못한 오류가 자주 발생**했습니다.
        - 특히, **예외 처리(400, 404, 500 등) 검증이 반복적으로 필요**했으며, 이를 자동화해야 할 필요성을 느꼈습니다.
        - **QueryDSL 기반 복잡한 쿼리의 예상치 못한 결과**를 경험하며, **DB 연동이 올바르게 이루어지는지 검증해야 할 필요성을 인식**했습니다
    - **테스트 코드 도입 제안**
        - 이러한 문제를 해결하기 위해 컨트롤러, 서비스, 리포지토리 계층별 테스트를 진행하기로 결정했습니다.
            - 컨트롤러 테스트 → MockMvc와 Mockito를 활용하여 API 요청과 응답을 검증
            - 서비스 테스트 → Mockito를 활용한 Mock 객체로 비즈니스 로직 검증
            - 리포지토리 테스트 → @DataJpaTest를 활용하여 JPA 기반의 데이터 정합성 검토
            - QueryDSL 테스트 → 복잡한 쿼리가 예상된 결과를 반환하는지 검증
    - **코드 변경 시에도 안정성을 유지하기 위한 반복적인 테스트 수행**
        - API 수정이 발생할 때마다 **기존 기능이 정상 동작하는지 반복 검증**했습니다.
        - 기능 변경이 API 응답에 영향을 주지 않도록 **자동화된 테스트를 지속적으로 수행**했습니다.
2. 성과
    - **API 테스트 자동화를 통한 신뢰성 향상**
        - 다양한 테스트 케이스를 작성함으로써, 기능 수정 시 발생할 수 있는 예기치 않은 오류를 사전에 감지했습니다.
        - CI/CD 환경에서 자동화된 테스트를 실행하여 API의 안전성과 일관성을 유지했습니다.
