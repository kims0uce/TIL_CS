# 면접을 위한 CS 전공지식 노트

ps. 이직안해요..

🐰 목표: 부족한 CS 지식을 빠르게 습득하고자 공부합니다. 이것도 모르냐는 꾸중을 듣고 싶지 않은 응애 개발자 1인.

🐰 교재: 면접을 위한 CS 전공지식 노트 (주홍철 저)

🐰 일정: 매주 수요일

## 목차

### 1. 디자인패턴과 프로그래밍 패러다임

디자인 패턴이란, 프로그램 설계 과정에서 자주 발생하는 문제들에 대한 일반적인 해결책이다.

- [싱글톤패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.1_싱글톤패턴.md)
- [팩토리패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.2_팩토리패턴.md)
- [전략패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.3_전략패턴.md)
- [옵저버패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.4_옵저버패턴.md)
- [프록시패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.5_프록시패턴.md)
- [이터레이터패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.6_이터레이터패턴.md)
- [노출모듈패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.7_노출모듈패턴.md)
- [MVC패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.8_MVC패턴.md)
- [MVP,MVVM패턴](1장_디자인패턴과_프로그래밍패러다임/1.1_디자인패턴/1.1.9_MVP,MVVM패턴.md)

프로그래밍 패러다임이란, 프로그래머에게 프로그래밍의 관점을 갖게하고 결정하는 역할을 하는 개발 방법론이다.

- [선언형과\_함수형프로그래밍](1장_디자인패턴과_프로그래밍패러다임/1.2_프로그래밍패러다임/1.2.1_선언형과_함수형프로그래밍.md)
- [객체지향프로그래밍](1장_디자인패턴과_프로그래밍패러다임/1.2_프로그래밍패러다임/1.2.2_객체지향프로그래밍.md)

<br />

### 2. 네트워크

네트워크는 컴퓨터 등의 장치들이 통신 기술을 이용하여 구축하는 연결망을 지칭한다.

이때 장치들, 예컨대 서버/라우터/스위치 등은 `노드(node)` 이다. 이들을 연결해주는 유무선 매체를 `링크(link)` 라고 한다.

- [처리량과\_지연시간](2장_네트워크/2.1_네트워크의기초/2.1.1_처리량과지연시간.md)
- [네트워크토폴로지와\_병목현상](2장_네트워크/2.1_네트워크의기초/2.1.2_네트워크토폴로지와_병목현상.md)
- [네트워크분류](2장_네트워크/2.1_네트워크의기초/2.1.3_네트워크분류.md)
- [네트워크\_성능분석명령어](2장_네트워크/2.1_네트워크의기초/2.1.4_네트워크성능분석명령어.md)
- [네트워크\_프로토콜표준화](2장_네트워크/2.1_네트워크의기초/2.1.5_네트워크프로토콜표준화.md)

인터넷 프로토콜 스위트(internet protocol suite)는 인터넷에서 컴퓨터들이 서로 정보를 주고받는데 쓰이는 프로토콜의 집합이며, 이를 TCP/IP 4계층 모델로 설명하거나 OSI 7계층 모델로 설명한다.

- [계층구조](2장_네트워크/2.2_TCPIP_4계층모델/2.2.1_계층구조.md)
- [pdu(protocol_data_unit)](2장_네트워크/2.2_TCPIP_4계층모델/2.2.2_PDU.md)

네트워크 기기는 계층별로 처리 범위를 나눌 수 있다. 한편, 상위 계층을 처리하는 기기는 하위 계층을 처리할 수 있지만 그 반대는 불가하다.

- [애플리케이션계층을\_처리하는\_기기](2장_네트워크/2.3_네트워크기기/2.3.2_애플리케이션_계층을_처리하는_기기.md)
- [인터넷계층을\_처리하는\_기기](2장_네트워크/2.3_네트워크기기/2.3.3_인터넷_계층을_처리하는_기기.md)
- [데이터링크계층을\_처리하는\_기기](2장_네트워크/2.3_네트워크기기/2.3.4_데이터링크_계층을_처리하는_기기.md)
- [물리계층을\_처리하는\_기기](2장_네트워크/2.3_네트워크기기/2.3.5_물리_계층을_처리하는_기기.md)

인터넷 계층에서는 패킷을 수신할 상대의 주소를 지정하여 데이터를 전달하기 위해 IP를 사용한다.

- [ARP](2장_네트워크/2.4_IP주소/2.4.1_ARP.md)
- [홉바이홉통신](2장_네트워크/2.4_IP주소/2.4.2_홉바이홉통신.md)
- [IP주소체계](2장_네트워크/2.4_IP주소/2.4.3_IP주소체계.md)

HTTP는 애플리케이션 계층으로, 웹 서비스 통신에 사용된다.

- [HTTP/1.0](2장_네트워크/2.5_HTTP/2.5.1_HTTP_1.0.md)
