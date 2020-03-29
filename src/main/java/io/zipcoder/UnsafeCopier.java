package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public String copiedText;
    Random rand = new Random();

    public UnsafeCopier(String toCopy) {

        super(toCopy);
    }

    public void run() {

        while (this.stringIterator.hasNext()) {
            String text = this.stringIterator.next();
            try {
                Thread.currentThread().sleep(10 + rand.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            copiedText += text + " ";
            System.out.println(Thread.currentThread().getName() + " has just written");

        }
    }
}
