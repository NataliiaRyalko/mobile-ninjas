package lecture3.oop;

import java.sql.SQLOutput;

public class Animal {

      //  private Color color;
        private int steps = 0;

        public void run() {
            steps = steps + 50;
        }

        public void write() {
            System.out.println("I'm writing...");
            System.out.println("Initializing object");
        }

        public void makeSound() {
            System.out.println("Make sound");
        }

}
