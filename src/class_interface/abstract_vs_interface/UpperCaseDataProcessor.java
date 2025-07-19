package class_interface.abstract_vs_interface;

public class UpperCaseDataProcessor extends AbstractDataProcessor{
    @Override
    protected void doInitialize() {
        System.out.println("🔧 UpperCaseDataProcessor 전용 초기화");
    }

    @Override
    protected String doProcess(String data) {
        // 입력 문자열을 대문자로 변환
        return data.toUpperCase();
    }

    @Override
    protected void doCleanup() {
        System.out.println("🧹 UpperCaseDataProcessor 전용 정리");
    }
}
