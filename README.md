## 기능목록


### 입력
- [x] 참가자 이름 (쉼표기준)
- [ ] 참가자들 배팅금액
- [ ] 한 장 더 받을지 여부


### 기능
- [x] 덱 만들기 (52장)
- [ ] 카드 나눠주기(처음 2장, 한장 더)
  - [x] 나눠준거 제외하기
  - [x] 나눠줄거에서 랜덤으로 한장 추출
- [x] 핸드에 있는 카드 더하기
- [ ] 승자 계산하기 (21에 가까운지)
   - [ ] 카드 추가로 뽑아 21이 넘으면, 베팅금액 0
   - [ ] 처음 2장이 블랙잭이면 , 배팅금액 1.5배
   - [ ] 딜러와 동시에 블랙잭이면, 베팅금액 1배
- [ ] 수익 계산하기

- [ ] 딜러 draw
  - 처음 두장의 합이 16이하면 반드시 draw, 17점이상이면 받을수 없음.

### 카드 도메인 
- [x] 문양 : 하트,스페이드,클로버,다이아몬드
- 숫자
  - [x] Ace : 1 or 11
  - [x] King, Queen, Jack :10

### 출력
- [x] 카드 공개
    - [x] 딜러는 1장, 플레이어는 2장 공개
- [ ] 게임 결과 출력
- [ ] 최종수익