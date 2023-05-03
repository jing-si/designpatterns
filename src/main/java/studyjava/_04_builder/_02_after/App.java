package studyjava._04_builder._02_after;

import studyjava._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();

        //builder 를 통하면 코드가 간단해짐
        //만약 이런식의 코드가 계속 되어 재사용 된다면
        //Director 를 만들어서 재사용 가능 하게 만들 수 있음
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDay(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        System.out.println(plan);
        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021,7,31))
                .getPlan();
        System.out.println(longBeachTrip);

        //Builder getPlan하면 초기화 되도록 안해놓아서 동일한 인스턴스로 만들어진다..

        //Director를 통해 만드는 방식
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.cancunTrip();
    }
}
