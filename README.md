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
+
