## TDD(Test Driven Development)
테스트 주도 개발 : 테스트가 개발을 이끌어 나간다.<br>

테스트를 먼저 만들고 테스트를 통과하기 위한 것을 짜는 것 즉, 만드는 과정에서 우선 테스트를 작성하고 그걸 통과하는 코드를 만들고를 반복하면서 제대로 동작하는지에 대한 피드백을 적극적으로 받는 것이다.
<img src="https://user-images.githubusercontent.com/47962660/66155743-437a1f00-e65b-11e9-81e1-dc983ccb56e7.gif"/>
<pre>
정확한 프로그래밍 목적을 디자인 단계에서 반드시 미리 정의해야만 하고 또 무엇을 미리 정의해야한다.
RED : 실패하는 테스트를 만들기.
GREEN : 테스트에 통과할 만한 작은 코드를 작성하기.
REFACTOR : 반복되는 코드, 긴 메소드, 큰 클래스, 긴 매개변수 목록 등등 코드를 좀 더 효율적으로 바꾸기.
</pre>
<h3>장점</h3>
<ul>
  <li>작업과 동시에 테스트를 진행함으로써 실시간으로 오류 상황을 파악하여 시스템 결함을 방지한다.</li>
  <li>짧은 개발 주기를 통해 고객의 요구사항을 빠르게 수용하거나 피드백을 줄 수 있고 현재 진행 상황을 쉽게 파악할 수 있다.</li>
  <li>
    자동화 도구를 이용해 TDD의 테스트케이스를 단위테스트로 사용이 가능하다.
    <ul>
      <li>Junit(Java), CppUnit(C/C++), NUnit(.NET) 등</li>
    </ul>
  </li>
</ul>
<h3>단점</h3>
<ul>
  <li>기존의 개발프로세스에 테스트케이스 설계까지 추가되므로 코드 생산 비용이 높아진다.</li>
  <li>어떻게 테스트를 할 것이며, 프로젝트 성격에 따른 테스트 프레임워크 선택 등 여러 부분에 대한 고려가 필요하다.</li>
</ul>

## 레퍼런스
https://nesoy.github.io/articles/2017-01/TDD
https://github.com/kim6394/Dev_BasicKnowledge/blob/master/Concept/TDD(Test%20Driven%20Development).md
https://gmlwjd9405.github.io/2018/06/03/agile-tdd.html
https://ict-nroo.tistory.com/96
