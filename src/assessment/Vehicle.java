package assessment;

public class Vehicle {

        private final int constant = 100;

        private final double capacity;

        public Vehicle(double capacity){
            this.capacity = capacity;
        }

        public double fareCharge() {
            return constant * capacity;
        }
}
