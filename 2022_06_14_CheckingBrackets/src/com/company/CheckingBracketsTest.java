package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingBracketsTest {

   @Test
    public void firstBracketIstClosing_shouldBeFalse(){
       CheckingBrackets checkingBrackets= new CheckingBrackets();
       String string=")+58-(78*21)/[586-61]";
      boolean result=checkingBrackets.checkingBrackets(string);
       Assertions.assertFalse(result);
   }
   @Test
   public void theClosedBracketIsMissing_shouldBeFalse(){
       CheckingBrackets checkingBrackets= new CheckingBrackets();
       String string="58-{(78*21)/[586-61]";
       boolean result=checkingBrackets.checkingBrackets(string);
       Assertions.assertFalse(result);
   }
   @Test
    public void intersectionOfBrackets_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="(45+658*4-[567-1)*98-5]+{45/12}";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
   @Test
    public void theClosedBracketIsExcess_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="58-{25*3}+)";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
    @Test
    public void theOpenBracketIsExcess_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="58[-({25*3}+)";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
    @Test
    public void theOpenBracketIsMissing_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="58-{(78*21)-9)+52}";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
    @Test
    public void onlyBrackets_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="(((([[[[[[}}((((((((((((((((";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
    @Test
    public void onlyOneBracket_shouldBeFalse(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="(";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertFalse(result);
    }
    @Test
    public void correctPlacementOfBracketsSimple_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="18+(25*7-1)+2";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }
    @Test
    public void correctPlacementOfBracketsSimple2_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="<25*7-1>";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }

    @Test
    public void correctPlacementOfBracketsDifficult_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="(68*2+[15-1]-2)+{15+(25+3-[111-5])}";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }
    @Test
    public void correctPlacementOfBracketsDifficult2_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="(125+{18/6*[15+3+1]}+<(258/2)+{656-655*[14-7]}>)+100";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }
    @Test
    public void withoutBrackets_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="18+25*7-1+2";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }
    @Test
    public void onlyBrackets_shouldBeTrue(){
        CheckingBrackets checkingBrackets= new CheckingBrackets();
        String string="({[<>]}{[]})((()))[[[[]]]]";
        boolean result=checkingBrackets.checkingBrackets(string);
        Assertions.assertTrue(result);
    }
}