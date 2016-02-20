package ua.com.manko.studyjava8.chap4;

import org.apache.log4j.Logger;

/**
 * Created by Sergej on 07.02.2016.
 */
public class LogTest {
    private static final Logger log = Logger.getLogger(LogTest.class);
    public static void main(String[] args) {

        log.info("Start processing");

        if (log.isDebugEnabled()) {
            log.info("Result: "+1);
        }

        try {
            throw  new IndexOutOfBoundsException();
        } catch (Exception e) {
            log.error("Something failed", e);
        }

        log.debug("done");

    }
}
