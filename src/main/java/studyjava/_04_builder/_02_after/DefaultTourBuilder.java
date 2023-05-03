package studyjava._04_builder._02_after;

import studyjava._04_builder._01_before.DetailPlan;
import studyjava._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;

public class DefaultTourBuilder implements TourPlanBuilder{
    //구현체 제작
    //구현 하는 방법은 여러가지가 있겠지만 모든 필드들을 정의해서 할 수 있음
    //파라미터를 전부 갖게 할 수도 있음
    //나는 그냥 has 관계로 만듬
    //기본생성자만으로 생성이 가능하기 때문에 가능한 방법일 듯
    //인스턴스 생성 비용이 많이 들어가면 has 보단 파라미터를 전부 갖는 편이 좋을 것 같다.

    TourPlan tourPlan;

    public DefaultTourBuilder() {
        this.tourPlan = new TourPlan();
    }

    @Override
    public TourPlanBuilder title(String title) {
        tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDay(int night, int days) {
        tourPlan.setNights(night);
        tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if(tourPlan.getPlans() == null){
            tourPlan.setPlans(new ArrayList<>());
        }
        tourPlan.addPlan(day,plan);
        return this;
    }
}
