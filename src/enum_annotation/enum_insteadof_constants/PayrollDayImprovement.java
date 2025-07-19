package enum_annotation.enum_insteadof_constants;

import static enum_annotation.enum_insteadof_constants.PayrollDayImprovement.PayType.WEEKDAY;
import static enum_annotation.enum_insteadof_constants.PayrollDayImprovement.PayType.WEEKEND;

public enum PayrollDayImprovement {
    MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY),
    THURSDAY(WEEKDAY), FRIDAY(WEEKDAY), SATURDAY(WEEKEND), SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDayImprovement(PayType payType){
        this.payType = payType;
    }

    int pay(int minuteWorked, int payRate){
        return payType.pay(minuteWorked, payRate);
    }

    enum PayType{
        WEEKDAY{
            int overtimePay(int minsWorked, int payRate){
                return minsWorked <= MINS_PER_SHIFT ? 0 :
                        (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay(int minsWorked, int payRate){
                return minsWorked * payRate /2;
            }
        };

        abstract int overtimePay(int mins, int payRate);
        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate){
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }
}
