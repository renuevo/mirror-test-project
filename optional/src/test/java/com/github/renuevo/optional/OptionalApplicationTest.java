package com.github.renuevo.optional;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Optional;

@SpringBootTest
public class OptionalApplicationTest {

    /**
     * <pre>
     *  @methodName : optionalSplitMax
     *  @author : Deokhwa.Kim
     *  @since : 2020-04-21 오후 10:52
     *  @summary :
     *  @param : []
     *  @return : void
     * </pre>
     */
    @Test
    public void optionalSplitMax() {

        String sample = "1,2,3,4,5,6,7,8,9";
        String sample2 = null;

        int result = Optional.ofNullable(sample)
                .map(data -> data.split(","))
                .map(Arrays::asList)
                .map(list -> list.stream().map(Integer::parseInt).max(Integer::compareTo))
                .orElse(Optional.of(0)).get();

        int result2 = Optional.ofNullable(sample2)
                .map(data -> data.split(","))
                .map(Arrays::asList)
                .map(list -> list.stream().map(Integer::parseInt).max(Integer::compareTo))
                .orElse(Optional.of(0)).get();

        Assert.assertEquals(result, 9);
        Assert.assertEquals(result2, 0);

    }

}
