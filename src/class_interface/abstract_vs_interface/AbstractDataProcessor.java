package class_interface.abstract_vs_interface;

import java.sql.SQLOutput;

public abstract class AbstractDataProcessor implements DataProcessor{
    @Override
    public void initialize() {
        System.out.println("공통 초기화 로직 수행");
        doInitialize();
    }

    protected void doInitialize() {
        // 기본 동작: 아무 것도 하지 않음
    }

    @Override
    public String process(String data) {
        System.out.println("처리 시작 " + data);
        String result = doProcess(data);
        System.out.println("처리 완료 " + result);
        return result;
    }
    protected abstract String doProcess(String data);
    @Override
    public void cleanup() {
        System.out.println("공통 처리 로직 수행");
        doCleanup();
    }

    protected void doCleanup(){

    }
}
