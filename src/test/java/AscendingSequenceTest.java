//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceHappyPath() {
        //0, 1, 2, 3, 4, 5.
// Здесь работает ААА pattern. 1 блок А отвечает за установку всех значений
        int start = 0;
        int end = 5;
        int step = 1;
        int [] expectedResult = {0, 1, 2, 3, 4, 5};

//  2 блок А отвечает за какие-то действия, когда мы получаем actualResult
        AscendingSequence as = new AscendingSequence();
        int [] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
// Цифры в этот блок никогда не пишем, а выносим их в первый блок или в начало класса

// 3 блок А отвечает за сравнение expectedResult с actualResult
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
//    @BeforeEach
//    void setUp() {
//        as = new AscendingSequence();
//        это фишка, чтобы не писать каждый раз AscendingSequence as = new AscendingSequence();
//    }
    @Order(1) //порядковый номер делаем только HappyPath тестам. И их делаем сначала.
    //потом неважно в каком порядке делаем негативные тесты.
    @RepeatedTest(50) //прогонит тест 50 раз. Сначала этот 50 раз, а потом все остальные
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() {
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {
        //-10, -9, -8, -7
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber() {
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThanEnd() {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeStep() {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
