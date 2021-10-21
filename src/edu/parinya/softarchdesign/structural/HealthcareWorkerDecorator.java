package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
    protected HealthcareServiceable worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker.getName(), worker.getPrice());
        this.worker = worker;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}