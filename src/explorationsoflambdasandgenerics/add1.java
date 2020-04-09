/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationsoflambdasandgenerics;

/**
 *
 * @author sunbe
 */
public class add1 implements IntegerModifier {

    @Override
    public Integer modifyIntegerXTimes(int startingValue, Integer amount) {

        return startingValue + 1;
    }

}
