package ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage;


import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.StepCountStrategy;

public class DataAggregator  {
    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
    public void receive(DataRepository repo) {
        repo.getRecords().forEach(r -> strategy.consumeMessage(r));
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
