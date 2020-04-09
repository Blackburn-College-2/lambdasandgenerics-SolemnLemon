
import explorationsoflambdasandgenerics.IntegerModifier;
import explorationsoflambdasandgenerics.Utils;
import explorationsoflambdasandgenerics.add1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println(Utils.indexedOutput(Utils.repeat("hi", 9)));
        /**
         * new IntegerModifier{
         *
         * @Override public Integer modifyIntegerXTimes(int startingValue,
         * Integer x){ return x;
         *
         * }*
         */
        int i = Utils.modifyIntegerXTimesTester(new IntegerModifier() {
            @Override
            public Integer modifyIntegerXTimes(int startingValue, Integer amount) {
                for (int k = 0; k < amount; k++) {
                    startingValue++;
                }
                return startingValue;
            }
        }, 1, 3);
        //int j = Utils.modifyIntegerXTimesTester(new add1(), 0, 0);
        System.out.println(i);

    }
}

// Utils.modifyIntegerXTimesTester();
//Utils.testInvolutence();

