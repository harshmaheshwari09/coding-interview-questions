package ThoughtSpot.PrintStackWithVersionControl.test;

import ThoughtSpot.PrintStackWithVersionControl.src.ExceptionMessage;
import ThoughtSpot.PrintStackWithVersionControl.src.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testWithValidInputs() throws Exception {
        Solution stack = new Solution();

        // Empty Stack
        Assertions.assertEquals(Arrays.asList(), stack.print(0));

        // 1: push(1)
        stack.push(1);
        Assertions.assertEquals(Arrays.asList(1), stack.print(1));

        // 2: push(2)
        stack.push(2);
        Assertions.assertEquals(Arrays.asList(2, 1), stack.print(2));

        // 3: push(3)
        stack.push(3);
        Assertions.assertEquals(Arrays.asList(3, 2, 1), stack.print(3));

        // print(3)
        Assertions.assertEquals(Arrays.asList(3, 2, 1), stack.print(3));

        // print(2)
        Assertions.assertEquals(Arrays.asList(2, 1), stack.print(2));

        // 4: pop()
        stack.pop();
        Assertions.assertEquals(Arrays.asList(2, 1), stack.print(4));

        // 5: pop()
        stack.pop();
        Assertions.assertEquals(Arrays.asList(1), stack.print(5));

        // print(5)
        Assertions.assertEquals(Arrays.asList(1), stack.print(5));

        // print(4)
        Assertions.assertEquals(Arrays.asList(2, 1), stack.print(4));

        // 6: push(4)
        stack.push(4);
        Assertions.assertEquals(Arrays.asList(4, 1), stack.print(6));

        // 7: push(5)
        stack.push(5);
        Assertions.assertEquals(Arrays.asList(5, 4, 1), stack.print(7));

        // print(3)
        Assertions.assertEquals(Arrays.asList(3, 2, 1), stack.print(3));

        // print invalid snapshot
        Exception exception = Assertions.assertThrows(Exception.class, () -> stack.print(17));
        Assertions.assertNotNull(exception);
        Assertions.assertEquals(ExceptionMessage.INVALID_SNAPSHOT_VERSION.getMessage(), exception.getMessage());
    }

    @Test
    public void testPoppingFromEmptyStack() throws Exception {
        Solution stack = new Solution();
        Exception exception = Assertions.assertThrows(Exception.class, () -> stack.pop());
        Assertions.assertNotNull(exception);
        Assertions.assertEquals(ExceptionMessage.Empty_STACK.getMessage(), exception.getMessage());
    }
}
