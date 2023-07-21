package assessment;

import assessment.Vehicle;

public class Bus extends Vehicle {


    public Bus(double capacity) {
        super(capacity);
    }

    @Override
    public double fareCharge() {
        double totalFee = super.fareCharge();
        double tenPercent = (super.fareCharge() * 10) / 100;
        return totalFee + tenPercent;
    }
}
