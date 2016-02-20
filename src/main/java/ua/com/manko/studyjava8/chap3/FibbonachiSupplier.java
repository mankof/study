package ua.com.manko.studyjava8.chap3;

import java.math.BigDecimal;
import java.util.function.Supplier;

/**
 * Created by Sergej on 07.02.2016.
 */
 class FibbonachiSupplier implements Supplier {
    private BigDecimal prev = BigDecimal.ZERO;
    private BigDecimal next = BigDecimal.ONE;

    @Override
    public BigDecimal get() {
        BigDecimal current = next;
        next = prev.add(current);
        prev = current;
        return current;
    }
}
