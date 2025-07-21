package method.var_args;

public class Main {
    static int sum(int... args){
        int sum = 0;
        for(int arg : args){
            sum+=arg;
        }
        return sum;
    }

    static int min(int... args){
        if(args.length == 0){
            throw new IllegalArgumentException("인수가 1개 이상 필요");
        }
        int min = args[0];
        for(int i=1; i<args.length; i++){
            if(args[i] < min){
                min = args[i];
            }
        }
        return min;
    }

    static int max (int firstArg, int... remainingArgs){
        int max = firstArg;
        for(int arg: remainingArgs){
            if(arg > max){
                max = arg;
            }
        }
        return max;
    }


}
