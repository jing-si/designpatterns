package studyjava._04_builder._02_after;

import studyjava._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    //Builder 인터페이스는 Builder를 반환하도록 해서 또 다른 메서드를 사용 하게 한다.
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDay(int night, int days);

    // 만들려는 객체를 반환 할때까지
    // 해당 메서드에서 벨리데이션도 가능함
    TourPlan getPlan();

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);



}
