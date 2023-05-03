package studyjava._04_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        //짧은 여행을 갈때 라면
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));
        //당일치기면 WhereToStay가 필요 없고

        //일관된 프로세스가 없고 Days와 Nights는 함께 세팅 되어야 하는데
        //인스턴스가 불안정한 상태로 만들어 질수도 있고
        //다양한 파라미터들을 지원하는 생성자를 만들고 싶을때 생성자가 장황해짐
        //생성자가 너무 많아지면 사용하는 측에서도 햇갈려짐
        //이럴때 빌더 패턴을 적용
        //빌더에다가 인스턴스를 만드는 방법들을 스탭별로 만들어 놓음

        //2박 3일 칸쿤 여행을 가는 클래스
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        //첫날
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        //둘째날
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        //셋째날
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
    }
}
