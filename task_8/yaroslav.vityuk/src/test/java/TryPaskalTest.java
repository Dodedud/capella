import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.hillel.TryPaskal;
import org.junit.Test;

public class TryPaskalTest {

  @Test
  public void shouldArrayString() {
    final int[][] checkArray1 = {{1}};
    final int[][] checkArray2 = {{1}, {1, 1}};
    final int[][] checkArray3 = {{1}, {1, 1}, {1, 2, 1}};
    final int[][] checkArray5 = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};

    final int[][] paskalArray1 = TryPaskal.printPaskal(1);
    final int[][] paskalArray2 = TryPaskal.printPaskal(2);
    final int[][] paskalArray3 = TryPaskal.printPaskal(3);
    final int[][] paskalArray5 = TryPaskal.printPaskal(5);

    assertArrayEquals(checkArray1, paskalArray1);
    assertArrayEquals(checkArray2, paskalArray2);
    assertArrayEquals(checkArray3, paskalArray3);
    assertArrayEquals(checkArray5, paskalArray5);


  }
}
