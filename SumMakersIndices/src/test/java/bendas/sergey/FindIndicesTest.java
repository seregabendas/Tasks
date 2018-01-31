package bendas.sergey;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindIndicesTest {


  private static int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
  private static int[] array2 = {5, 3, 7, 10, 21, 1, 2, 14};
  private static int[] array3 = {1, -2, 3, 9, 0, 1, 4, -8, 9};


  @Test
  public void shouldSolve1() {

    int[] result = FindIndices.solve(array1, 4);
    assertThat(result, is(new int[]{0, 2}));
  }

  @Test
  public void shouldSolve2() {

    int[] result = FindIndices.solve(array1, 8);
    assertThat(result, is(new int[]{2, 4}));
  }

  @Test
  public void shouldSolve3() {

    int[] result = FindIndices.solve(array2, 3);
    assertThat(result, is(new int[]{5, 6}));
  }

  @Test
  public void shouldSolve4() {

    int[] result = FindIndices.solve(array2, 19);
    assertThat(result, is(new int[]{0, 7}));
  }

  @Test
  public void shouldSolve5() {

    int[] result = FindIndices.solve(array3, 2);
    assertThat(result, is(new int[]{0, 5}));
  }

  @Test
  public void shouldSolve6() {

    int[] result = FindIndices.solve(array3, 7);
    assertThat(result, is(new int[]{1, 3}));
  }

  @Test
  public void shouldSolve7() {

    int[] result = FindIndices.solve(array3, -8);
    assertThat(result, is(new int[]{4, 7}));
  }
}
