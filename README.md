# CodeSquad-pre-week2-1-2

## 도서 목록

### 객체 배열과 배열의 복사(Shallow, Deep)을 사용하여 도서 목록을 출력하시오.

- 도서 목록 A를 얕은 복사한 A-1과, 깊은 복사한 B 목록을 출력한다.
- 목록 A : (제목, 저자)
    - '태백산맥' (조정래)
    - '이기적 유전자' (리처드 도킨즈)
    - '자전거 도둑' (박완서)
    - '토지' (박경리)
    - '대변동' (제레드 다이아몬드)
- 변동 내용
    - A 목록의 3번째 항목 변경
        - '자전거 도둑' (박완서) -> '그 많던 싱아는 누가 다 먹었을까' (박완서)
    - B 목록에 도서 추가
        - '사피엔스' (유발 하라리)

### 배열의 복사

- 얕은 복사 (Shallow Copy)
    - 단순한 변수 선언을 통한 복사의 형태로, 복사하려는 배열의 주솟값을 가져오게 된다.
    - 복사한 배열을 수정하면 원본 배열도 수정된다.
- 깊은 복사 (Deep Copy)
    - 원래 배열을 그대로 가져와 새 배열에 덮어쓰기 하는 것이다.
    - 복사한 배열을 수정하더라도 원본 배열을 변하지 않는다.
    - 1차원 배열 복사는 clone(), 2차원 배열 복사는 System.arraycopy()