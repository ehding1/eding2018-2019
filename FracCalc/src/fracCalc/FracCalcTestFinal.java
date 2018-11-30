package fracCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Final Fraccalc_ec submission tests
public class FracCalcTestFinal
{
    @Test public void testAdditionSimple1() {assertEquals("2/5", Fraccalc_ec.produceAnswer("1/5 + 1/5"));}
    @Test public void testAdditionSimple2() {assertEquals("4/5", Fraccalc_ec.produceAnswer("3/5 + 1/5"));}
    @Test public void testAdditionSimple3() {assertEquals("4_3/7", Fraccalc_ec.produceAnswer("1_1/7 + 3_2/7"));}
    
    @Test public void testAdditionReduce1() {assertEquals("1_1/5", Fraccalc_ec.produceAnswer("3/5 + 3/5"));}
    @Test public void testAdditionReduce2() {assertEquals("1_1/5", Fraccalc_ec.produceAnswer("4/5 + 2/5"));}
    @Test public void testAdditionReduce3() {assertEquals("1/4", Fraccalc_ec.produceAnswer("1/8 + 1/8"));}
    
    @Test public void testAdditionWholeNumbers1() {assertEquals("1", Fraccalc_ec.produceAnswer("2/5 + 3/5"));}
    @Test public void testAdditionWholeNumbers2() {assertEquals("1", Fraccalc_ec.produceAnswer("2/3 + 1/3"));}
    @Test public void testAdditionWholeNumbers3() {assertEquals("10", Fraccalc_ec.produceAnswer("3 + 7"));}
    @Test public void testAdditionWholeNumbers8() {assertEquals("2", Fraccalc_ec.produceAnswer("1 + 1"));}
    @Test public void testAdditionWholeNumbers4() {assertEquals("4", Fraccalc_ec.produceAnswer("1 + 3"));}
    @Test public void testAdditionWholeNumbers5() {assertEquals("452", Fraccalc_ec.produceAnswer("452 + 0"));}
    @Test public void testAdditionWholeNumbers6() {assertEquals("254", Fraccalc_ec.produceAnswer("0 + 254"));}
    @Test public void testAdditionWholeNumbers7() {assertEquals("1021778", Fraccalc_ec.produceAnswer("124543 + 897235"));}
    
    @Test public void testAdditionWithNegatives1() {assertEquals("2/5", Fraccalc_ec.produceAnswer("3/5 + -1/5"));}
    @Test public void testAdditionWithNegatives2() {assertEquals("900", Fraccalc_ec.produceAnswer("978 + -78"));}
    @Test public void testAdditionWithNegatives3() {assertEquals("900", Fraccalc_ec.produceAnswer("-78 + 978"));}
    @Test public void testAdditionWithNegatives4() {assertEquals("-1_1/4", Fraccalc_ec.produceAnswer("-3_3/4 + 2_2/4"));}
    @Test public void testAdditionWithNegatives5() {assertEquals("-1_1/4", Fraccalc_ec.produceAnswer("2_2/4 + -3_3/4"));}
    
    @Test public void testAdditionImproperFractionsAndReductions1() {assertEquals("5_5/6", Fraccalc_ec.produceAnswer("20/8 + 3_1/3"));}
    @Test public void testAdditionImproperFractionsAndReductions2() {assertEquals("1_1/20", Fraccalc_ec.produceAnswer("4/5 + 2/8"));}
    
        // This unit test tries a number of combined concepts
    @Test public void testAdditionCombined1() { assertEquals("-9035", Fraccalc_ec.produceAnswer("-9035 + 0"));}
    @Test public void testAdditionCombined2() {     assertEquals("-64", Fraccalc_ec.produceAnswer("64 + -128"));}
    @Test public void testAdditionCombined3() {         assertEquals("-133", Fraccalc_ec.produceAnswer("-98 + -35"));}
    @Test public void testAdditionCombined4() { assertEquals("62_11/19", Fraccalc_ec.produceAnswer("0 + 34_543/19"));}
    @Test public void testAdditionCombined5() { assertEquals("-44_229/888", Fraccalc_ec.produceAnswer("-38_3/72 + -4_82/37"));}
    
    
    @Test public void testSubtractionSimple1() {        assertEquals("1/5", Fraccalc_ec.produceAnswer("3/5 - 2/5"));}
    @Test public void testSubtractionSimple2() {assertEquals("0", Fraccalc_ec.produceAnswer("1/5 - 1/5"));}
    @Test public void testSubtractionSimple3() {assertEquals("0", Fraccalc_ec.produceAnswer("4_1/2 - 4_1/2"));}
        
    
    
    @Test public void testSubtractionReduce1() {assertEquals("4/5", Fraccalc_ec.produceAnswer("9/10 - 1/10"));}
    @Test public void testSubtractionReduce2() {assertEquals("1/5", Fraccalc_ec.produceAnswer("5/10 - 3/10"));}
    
    
    
    @Test public void testSubtractionWholeNumbers1() {  assertEquals("0", Fraccalc_ec.produceAnswer("68591 - 68591"));}
    @Test public void testSubtractionWholeNumbers2() {assertEquals("7", Fraccalc_ec.produceAnswer("42 - 35"));}
    
    
    @Test public void testSubtractionWithNegatives1() { assertEquals("-2/5", Fraccalc_ec.produceAnswer("2/5 - 4/5"));}
    @Test public void testSubtractionWithNegatives2() {assertEquals("-7/8", Fraccalc_ec.produceAnswer("5_3/4 - 6_5/8"));}
    @Test public void testSubtractionWithNegatives3() {assertEquals("-1_1/4", Fraccalc_ec.produceAnswer("-3_3/4 - -2_2/4"));}
    @Test public void testSubtractionWithNegatives4() {assertEquals("-1_5/8", Fraccalc_ec.produceAnswer("4_1/2 - 5_9/8"));}
    @Test public void testSubtractionWithNegatives5() {assertEquals("-1_1/8", Fraccalc_ec.produceAnswer("3_3/4 - 4_7/8"));}
    @Test public void testSubtractionWithNegatives6() {assertEquals("-6_1/4", Fraccalc_ec.produceAnswer("-3_3/4 - 2_2/4"));}
    @Test public void testSubtractionWithNegatives7() {assertEquals("-36891", Fraccalc_ec.produceAnswer("48623 - 85514"));}
    @Test public void testSubtractionWithNegatives8() {assertEquals("-9284", Fraccalc_ec.produceAnswer("0 - 9284"));}
    
    
    
    @Test public void testSubtractionImproperFractionsAndReductions1() {assertEquals("53/96", Fraccalc_ec.produceAnswer("75/32 - 43/24"));}
    @Test public void testSubtractionImproperFractionsAndReductions2() {assertEquals("16_23/24", Fraccalc_ec.produceAnswer("75/4 - 43/24"));}
    
    
        // This unit test tries a number of combined concepts
    @Test public void testSubtractionCombined1() {  assertEquals("12_3/8", Fraccalc_ec.produceAnswer("5_3/4 - -6_5/8"));}
    @Test public void testSubtractionCombined2() {assertEquals("8_5/21", Fraccalc_ec.produceAnswer("-12_3/7 - -20_2/3"));}
    @Test public void testSubtractionCombined3() {assertEquals("-65_247/336", Fraccalc_ec.produceAnswer("-32_75/16 - 27_43/21"));}
    
    
    
    @Test public void testMultiplicationBasic1() {  assertEquals("3", Fraccalc_ec.produceAnswer("1_1/2 * 2"));}
    @Test public void testMultiplicationBasic2() {assertEquals("6/25", Fraccalc_ec.produceAnswer("3/5 * 2/5"));}
    @Test public void testMultiplicationBasic3() {assertEquals("164268", Fraccalc_ec.produceAnswer("234 * 702"));}
    @Test public void testMultiplicationBasic4() {assertEquals("216", Fraccalc_ec.produceAnswer("12 * 18"));}
    @Test public void testMultiplicationBasic5() {assertEquals("8", Fraccalc_ec.produceAnswer("12/3 * 2/1"));}
    @Test public void testMultiplicationBasic6() {assertEquals("2", Fraccalc_ec.produceAnswer("16 * 1/8"));}
    @Test public void testMultiplicationBasic7() {assertEquals("2", Fraccalc_ec.produceAnswer("3 * 2/3"));}
    @Test public void testMultiplicationBasic8() {assertEquals("1_1/2", Fraccalc_ec.produceAnswer("6 * 1/4"));}
    @Test public void testMultiplicationBasic9() {assertEquals("8994872", Fraccalc_ec.produceAnswer("1 * 8994872"));}
    @Test public void testMultiplicationBasic10() {assertEquals("378/943", Fraccalc_ec.produceAnswer("27/41 * 14/23"));}
    @Test public void testMultiplicationBasic11() {assertEquals("5_929/943", Fraccalc_ec.produceAnswer("1_27/41 * 3_14/23"));}
    
    
    
    @Test public void testMultiplicationWithNegatives1() {  assertEquals("-8", Fraccalc_ec.produceAnswer("12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives2() {assertEquals("-8", Fraccalc_ec.produceAnswer("-12/3 * 2/1"));}
    @Test public void testMultiplicationWithNegatives3() {assertEquals("8", Fraccalc_ec.produceAnswer("-12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives4() {assertEquals("-15_5/7", Fraccalc_ec.produceAnswer("-3_2/3 * 4_2/7"));}
    @Test public void testMultiplicationWithNegatives5() {assertEquals("-15_5/7", Fraccalc_ec.produceAnswer("3_2/3 * -4_2/7"));}
    @Test public void testMultiplicationWithNegatives6() {assertEquals("15_5/7", Fraccalc_ec.produceAnswer("-3_2/3 * -4_2/7"));}
    @Test public void testMultiplicationWithNegatives7() {assertEquals("-842346", Fraccalc_ec.produceAnswer("1 * -842346"));}
    @Test public void testMultiplicationWithNegatives8() {assertEquals("-75421", Fraccalc_ec.produceAnswer("-1 * 75421"));}
    @Test public void testMultiplicationWithNegatives9() {assertEquals("37953", Fraccalc_ec.produceAnswer("-1 * -37953"));}
    
    
    
    @Test public void testMultiplicationByZero1() { assertEquals("0", Fraccalc_ec.produceAnswer("0 * 4/5"));}
    @Test public void testMultiplicationByZero2() {assertEquals("0", Fraccalc_ec.produceAnswer("0 * 0"));}
    @Test public void testMultiplicationByZero3() {assertEquals("0", Fraccalc_ec.produceAnswer("0 * 9321"));}
    @Test public void testMultiplicationByZero4() {assertEquals("0", Fraccalc_ec.produceAnswer("0 * -5902"));}
    @Test public void testMultiplicationByZero5() {assertEquals("0", Fraccalc_ec.produceAnswer("146 * 0"));}
    @Test public void testMultiplicationByZero6() {assertEquals("0", Fraccalc_ec.produceAnswer("3_25/26 * 0"));}
    @Test public void testMultiplicationByZero7() {assertEquals("0", Fraccalc_ec.produceAnswer("-24_1/3 * 0"));}
    
    
    
    @Test public void testMultiplicationCombined1() {   assertEquals("1065_115/168", Fraccalc_ec.produceAnswer("-32_75/16 * -27_43/21"));}
    @Test public void testMultiplicationCombined2() {assertEquals("-15_67/943", Fraccalc_ec.produceAnswer("1_27/41 * -3_140/23"));}
    @Test public void testMultiplicationCombined3() {assertEquals("4_2/3", Fraccalc_ec.produceAnswer("3_2/4 * 4/3"));}
    
    
    @Test public void testDivisionBasic1() {assertEquals("9/16", Fraccalc_ec.produceAnswer("3/4 / 4/3"));}
    @Test public void testDivisionBasic2() {assertEquals("2_1/4", Fraccalc_ec.produceAnswer("3/2 / 2/3"));}
    @Test public void testDivisionBasic3() {assertEquals("9457", Fraccalc_ec.produceAnswer("9457 / 1"));}
    @Test public void testDivisionBasic4() {assertEquals("6/11", Fraccalc_ec.produceAnswer("6 / 11"));}
    @Test public void testDivisionBasic5() {assertEquals("4/9", Fraccalc_ec.produceAnswer("4 / 9"));}
    @Test public void testDivisionBasic6() {assertEquals("1", Fraccalc_ec.produceAnswer("23 / 23"));}
    @Test public void testDivisionBasic7() {assertEquals("2_6/7", Fraccalc_ec.produceAnswer("20 / 7"));}
    @Test public void testDivisionBasic8() {assertEquals("13/24", Fraccalc_ec.produceAnswer("1_1/12 / 2"));}
    @Test public void testDivisionBasic9() {assertEquals("1", Fraccalc_ec.produceAnswer("3/4 / 3/4"));}
    
    
    
    @Test public void testDivisionWithNegatives1() {    assertEquals("1_5/8", Fraccalc_ec.produceAnswer("-13 / -8"));}
    @Test public void testDivisionWithNegatives2() {assertEquals("-2803", Fraccalc_ec.produceAnswer("-2803 / 1"));}
    @Test public void testDivisionWithNegatives3() {assertEquals("-12457", Fraccalc_ec.produceAnswer("12457 / -1"));}
    @Test public void testDivisionWithNegatives4() {assertEquals("45236", Fraccalc_ec.produceAnswer("-45236 / -1"));}
    @Test public void testDivisionWithNegatives5() {assertEquals("-2_6/7", Fraccalc_ec.produceAnswer("-20 / 7"));}
    @Test public void testDivisionWithNegatives6() {assertEquals("1_13/32", Fraccalc_ec.produceAnswer("-3_3/4 / -2_2/3"));}
    @Test public void testDivisionWithNegatives7() {assertEquals("-1_13/32", Fraccalc_ec.produceAnswer("-3_3/4 / 2_2/3"));}
    @Test public void testDivisionWithNegatives8() {assertEquals("-1_13/32", Fraccalc_ec.produceAnswer("3_3/4 / -2_2/3"));}
    
    
    
    @Test public void testDivisionWithZero1() { assertEquals("0", Fraccalc_ec.produceAnswer("-0 / 98701"));}
    @Test public void testDivisionWithZero2() {assertEquals("0", Fraccalc_ec.produceAnswer("-0 / -98701"));}
    @Test public void testDivisionWithZero3() {assertEquals("0", Fraccalc_ec.produceAnswer("0 / -98701"));}
    @Test public void testDivisionWithZero4() {assertEquals("0", Fraccalc_ec.produceAnswer("0 / 37569"));}
    @Test public void testDivisionWithZero5() { assertEquals("0", Fraccalc_ec.produceAnswer("0 / 46/27"));}
    @Test public void testDivisionWithZero6() {assertEquals("0", Fraccalc_ec.produceAnswer("0/24 / 1/46"));}
    @Test public void testDivisionWithZero7() {assertEquals("0", Fraccalc_ec.produceAnswer("0/11 / 6/7"));}
    
    
    
    @Test public void testDivisionCombined1() {assertEquals("2_2/3", Fraccalc_ec.produceAnswer("16/4 / 3/2"));}
    @Test public void testDivisionCombined2() {assertEquals("-2_2/3", Fraccalc_ec.produceAnswer("16/4 / -3/2"));}
    @Test public void testDivisionCombined3() {assertEquals("6_661/5520", Fraccalc_ec.produceAnswer("-38_3/72 / -4_82/37"));}
    @Test public void testDivisionCombined4() {assertEquals("-5/21", Fraccalc_ec.produceAnswer("1_2/3 / -5_6/3"));}

    // Extra credit only
    @Test public void multipleOps1() {assertEquals("-20/21", Fraccalc_ec.produceAnswer("1_2/3 + 5/4 + 5_5/4 - 2_2/4 / -5_6/3"));}
    @Test public void multipleOps2() {assertEquals("4", Fraccalc_ec.produceAnswer("1 + 3 + -3 - -3"));}
    @Test public void multipleOps3() {assertEquals("0", Fraccalc_ec.produceAnswer("12 * 18 * 18 * 0"));}
    @Test public void multipleOps4() {assertEquals("3_47/60", Fraccalc_ec.produceAnswer("20/8 + 3_1/3 - 4/5 - 5/4"));}
    @Test public void multipleOps5() {assertEquals("1", Fraccalc_ec.produceAnswer("12345 - 12345 + 12345 - 12345 + 1"));}
    @Test public void multipleOps6() {assertEquals("0", Fraccalc_ec.produceAnswer("0 * 0 / 1 / 4/6 / 2_3/4"));}
    @Test public void multipleOps7() {assertEquals("-1", Fraccalc_ec.produceAnswer("1/5 + 1/5 + 1/5 + 1/5 + 1/5 - 2"));}
    @Test public void multipleOps8() {assertEquals("0", Fraccalc_ec.produceAnswer("-4 + 1 + 1 + 1 + 1"));}
    @Test public void multipleOps9() {assertEquals("4_1/2", Fraccalc_ec.produceAnswer("16/4 / 3/2 * 3/2 + 1/2"));}
    @Test public void multipleOps10() {assertEquals("0", Fraccalc_ec.produceAnswer("12457 / -1 + 12457"));}
    @Test public void multipleOps11() {assertEquals("7", Fraccalc_ec.produceAnswer("5_3/4 - -6_8/8 - 5_3/4"));}
    @Test public void multipleOps12() {assertEquals("4", Fraccalc_ec.produceAnswer("2 * 3 - 6 + 1_1/2 + 1/2 - 1/2 - 1/2 + 3"));}
    @Test public void multipleOps13() {assertEquals("-4", Fraccalc_ec.produceAnswer("2 * 3 - 6 + -1_1/2 + -1/2 - -1/2 - -1/2 - 3"));}
    @Test public void multipleOps14() {assertEquals("4", Fraccalc_ec.produceAnswer("20 / 5 * -1 + 8"));}
}
